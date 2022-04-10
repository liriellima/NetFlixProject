package projetonetflix.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    private String Cpf;
    private String NomeDoUsuario;
    private Date DataNascimento;
    private String Email;
    private String Senha;

    public String getNomeDoUsuario() {
        return NomeDoUsuario;
    }
    public void setNomeDoUsuario(String NomeDoUsuario) {
        this.NomeDoUsuario = NomeDoUsuario;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}