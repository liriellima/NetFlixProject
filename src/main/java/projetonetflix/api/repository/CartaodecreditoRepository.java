package projetonetflix.api.repository;

import projetonetflix.api.model.Cartaodecredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaodecreditoRepository extends JpaRepository<Cartaodecredito,Integer> {

}
