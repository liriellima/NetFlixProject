package projetonetflix.api.service;

import projetonetflix.api.model.Genero;
import projetonetflix.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero){
        return repository.save(genero);
    }
    public Genero atualizar(Genero genero) throws Exception {
        if(genero.getId()==null){
            throw new Exception("Gênero não encontrado");
        }
        return repository.save(genero);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }
}
