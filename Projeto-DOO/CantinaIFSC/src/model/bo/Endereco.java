/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

/**
 *
 * @author gabri
 */
public class Endereco {
    private int id;
    private String cep;
    private String logradouro;
    private char status;
    private Bairro bairro;
    private Cidade cidade;

    public Endereco(int id, String cep, String logradouro, char status, Bairro bairro, Cidade cidade) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.status = status;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
     public Endereco() {
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getCep()+ ", " 
                + this.getLogradouro()+ ", " 
                +this.bairro.getDescricao() + ", "
                +this.cidade.getDescricao() + ", "
                + this.getStatus();

    }
}
