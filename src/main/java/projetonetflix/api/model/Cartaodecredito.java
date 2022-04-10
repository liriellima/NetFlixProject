package projetonetflix.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cartaodecredito {
    @Id
    private Integer NumeroCartaodecredito;
    private String NomeDoTitular;
    private Date DataValidade;
    private Integer Cvc;
    private String CpfouCNPJTitular;

    public Integer getNumeroCartaodecredito() {
        return NumeroCartaodecredito;
    }
    public void setNumeroCartaodecredito(Integer NumeroCartaodecredito) {this.NumeroCartaodecredito = NumeroCartaodecredito;}

    public String getNomeTitular() {
        return NomeDoTitular;
    }
    public void setNomeTitular(String NomeTitular) {
        this.NomeDoTitular = NomeTitular;
    }

    public Date getDataValidade() {
        return DataValidade;
    }
    public void setDataValidade(Date DataValidade) {
        this.DataValidade = DataValidade;
    }

    public Integer getCvc() {
        return Cvc;
    }
    public void setCvc(Integer Cvc) {
        this.Cvc = Cvc;
    }

    public String getCpfouCNPJTitular() {
        return CpfouCNPJTitular;
    }
    public void setCpfouCNPJTitular(String CpfouCNPJTitular) {
        this.CpfouCNPJTitular = CpfouCNPJTitular;
    }
}
