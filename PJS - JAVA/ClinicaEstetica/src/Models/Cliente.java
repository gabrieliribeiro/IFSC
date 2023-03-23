/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {

    private String endereco;
    private String cep;

    public Cliente(int id, String nome, String endereco, String cep, char sexo, String DataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, DataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;

    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

}
