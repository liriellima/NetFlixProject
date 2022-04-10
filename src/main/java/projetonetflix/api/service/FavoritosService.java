package projetonetflix.api.service;

import projetonetflix.api.model.Favoritos;
import projetonetflix.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;

    public Favoritos salvar(Favoritos favoritos){
        return repository.save(favoritos);
    }
    public Favoritos atualizar(Favoritos favoritos) throws Exception {
        if(favoritos.getId()==null){
            throw new Exception("Filme ou Serie Favorita não encontrado");
        }
        return repository.save(favoritos);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Favoritos> listar(){
        return repository.findAll();
    }
}

