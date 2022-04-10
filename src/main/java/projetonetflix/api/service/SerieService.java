package projetonetflix.api.service;

import projetonetflix.api.model.Serie;
import projetonetflix.api.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public Serie salvar(Serie serie){
        return repository.save(serie);
    }

    public Serie atualizar(Serie serie) throws Exception {
        if(serie.getId()==null){
            throw new Exception("Serie não encontrada");
        }
        return repository.save(serie);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Serie> listar(){
        return repository.findAll();
    }

}


