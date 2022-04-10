package projetonetflix.api.resource;

import projetonetflix.api.model.Favoritos;
import projetonetflix.api.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritosResource{

    @Autowired
    private FavoritosService service;

    @PostMapping
    public Favoritos salvar(@RequestBody Favoritos favoritos){
        return service.salvar(favoritos);
    }

    @PutMapping
    public Favoritos atualizar(@RequestBody Favoritos favoritos) throws Exception {
        return service.atualizar(favoritos);
    }

    @GetMapping
    public List<Favoritos> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }
}
