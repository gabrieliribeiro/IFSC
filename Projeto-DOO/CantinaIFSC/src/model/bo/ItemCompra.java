/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bo;

/**
 *
 * @author gabri
 */
public class ItemCompra {
    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;
    private Compra compra;
    private Produto produto;

    public ItemCompra() {
    }

    public ItemCompra(int id, float qtdProduto, float valorUnitario, char status, Compra compra, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.compra = compra;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.compra.getId() + ", "
                + this.getQtdProduto() + ", " 
                + this.getValorUnitario() + ", " 
                + this.produto.getDescricao() + ", "
                + this.getStatus();

    }
}
