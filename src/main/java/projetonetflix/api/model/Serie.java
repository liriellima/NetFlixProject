package projetonetflix.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Serie {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private String duracao;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao(){return duracao;}
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

}
