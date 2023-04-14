/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author gabri
 */
public class Contas {
    private int id;
    private DateTimeFormatter dataHoraEmissao;
    private Date dataVencimento;
    private Date dataQuitação;
    private float valorEmitido;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorQuitado;
    private float observacao;
    private char flagTipoConta;
    private char status;
    private Compra compra;
    private Venda venda;
    

    public Contas() {
    }

    public Contas(int id, DateTimeFormatter dataHoraEmissao, Date dataVencimento, Date dataQuitação, float valorEmitido, float valorDesconto, float valorAcrescimo, float valorQuitado, float observacao, char flagTipoConta, char status, Compra compra, Venda venda) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitação = dataQuitação;
        this.valorEmitido = valorEmitido;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
        this.compra = compra;
        this.venda = venda;
    }

    public int getId() {
        return id;
    }

    public DateTimeFormatter getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Date getDataQuitação() {
        return dataQuitação;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public float getObservacao() {
        return observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraEmissao(DateTimeFormatter dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataQuitação(Date dataQuitação) {
        this.dataQuitação = dataQuitação;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public void setObservacao(float observacao) {
        this.observacao = observacao;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDataHoraEmissao() + ", "
                + this.getDataVencimento() + ", " 
                + this.getDataQuitação() + ", "
                + this.getValorEmitido() + ", " 
                + this.getValorDesconto() + ", "
                + this.getValorAcrescimo() + ", " 
                + this.getValorQuitado() + ", "
                + this.getObservacao() + ", " 
                + this.getFlagTipoConta() + ", " 
                + this.getStatus();

    }
}
