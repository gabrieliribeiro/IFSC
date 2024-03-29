/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabri
 */
public class Caixa {
    private int id;
    private DateTimeFormatter dataHoraAbertura;
    private DateTimeFormatter dataHoraFechamento;
    private float valorAbertura;
    private float valorFechamento;
    private String observaccao;
    private char status;
    private Funcionario funcionario;

    public Caixa() {
    }

    public Caixa(int id, DateTimeFormatter dataHoraAbertura, DateTimeFormatter dataHoraFechamento, float valorAbertura, float valorFechamento, String observaccao, char status, Funcionario funcionario) {
        this.id = id;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.valorAbertura = valorAbertura;
        this.valorFechamento = valorFechamento;
        this.observaccao = observaccao;
        this.status = status;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public DateTimeFormatter getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public DateTimeFormatter getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public String getObservaccao() {
        return observaccao;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraAbertura(DateTimeFormatter dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public void setDataHoraFechamento(DateTimeFormatter dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public void setObservaccao(String observaccao) {
        this.observaccao = observaccao;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.funcionario.getUsuario() + ", "
                + this.getDataHoraAbertura() + ", "
                + this.getDataHoraFechamento() + ", " 
                + this.getValorAbertura() + ", " 
                + this.getValorFechamento() + ", " 
                + this.getObservaccao() + ", " 
                + this.getStatus();

    }
}
