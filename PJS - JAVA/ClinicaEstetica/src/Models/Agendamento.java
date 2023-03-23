/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author aluno
 */
public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id, float valor, String data, String observacao) {
        this.id = id;
        this.cliente=cliente;
        this.servico=servico;
        this.valor = valor;
        
        try {
            this.data = new SimpleDateFormat("dd-MM-yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        this.observacao = observacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public float getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getObservacao() {
        return observacao;
    }
    
    
    
}
