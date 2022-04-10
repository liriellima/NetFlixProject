package projetonetflix.api.resource;

import projetonetflix.api.model.Filme;
import projetonetflix.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;
    //POST localhost:8080/filme
        /*
      {
        "titulo": "Harry Fujioka"
      }
     */
    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }
    //PUT localhost:8080/filme
    /*
      {
        "id": 3,
        "titulo": "Alterando Filme"
      }
     */
    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {
        return service.atualizar(filme);
    }
    //GET localhost:8080/filme
    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }

    //DELETE localhost:8080/filme/3
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

}
