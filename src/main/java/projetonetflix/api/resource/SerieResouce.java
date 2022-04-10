package projetonetflix.api.resource;

import projetonetflix.api.model.Serie;
import projetonetflix.api.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieResouce {

    @Autowired
    private SerieService service;

    @PostMapping
    public Serie salvar(@RequestBody Serie serie){
        serie = service.salvar(serie);
        return serie;
    }

    @PutMapping
    public Serie atualizar(@RequestBody Serie serie) throws Exception {
        return service.atualizar(serie);
    }

    @GetMapping
    public List<Serie> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

}
