package projetonetflix.api.service;

import projetonetflix.api.model.Cartaodecredito;
import projetonetflix.api.repository.CartaodecreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaodecreditoService {

    @Autowired
    private CartaodecreditoRepository repository;

    public Cartaodecredito salvar(Cartaodecredito Cartaodecredito){
        return repository.save(Cartaodecredito);
    }

    public Cartaodecredito atualizar(Cartaodecredito Cartaodecredito) throws Exception {
        if(Cartaodecredito.getNumeroCartaodecredito()==null){
            throw new Exception("Cartão de Credito não encontrado");
        }
        return repository.save(Cartaodecredito);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Cartaodecredito> listar(){
        return repository.findAll();
    }
}
