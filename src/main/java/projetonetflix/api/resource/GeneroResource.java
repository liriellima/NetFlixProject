package projetonetflix.api.resource;

import projetonetflix.api.model.Genero;
import projetonetflix.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
        return service.salvar(genero);
    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) throws Exception {
        return service.atualizar(genero);
    }

    @GetMapping
    public List<Genero> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }
}
