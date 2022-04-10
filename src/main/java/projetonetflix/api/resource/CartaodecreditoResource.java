package projetonetflix.api.resource;

import projetonetflix.api.model.Cartaodecredito;
import projetonetflix.api.service.CartaodecreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cartaodecredito")
public class CartaodecreditoResource {

    @Autowired
    private CartaodecreditoService service;

    @PostMapping
    public Cartaodecredito salvar(@RequestBody Cartaodecredito Cartaodecredito){
        Cartaodecredito = service.salvar(Cartaodecredito);
        return Cartaodecredito;
    }

    @PutMapping
    public Cartaodecredito atualizar(@RequestBody Cartaodecredito Cartaodecredito) throws Exception {
        return service.atualizar(Cartaodecredito);
    }

    @GetMapping
    public List<Cartaodecredito> listar(){
        return service.listar();
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

}
