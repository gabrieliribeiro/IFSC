package Models;

public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String senha, String nome) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String senha, String nome, String nivelAcesso, char sexo, String DataNascimento,String telefone, String email, String rg) {
        super(id, nome, sexo, DataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

}
