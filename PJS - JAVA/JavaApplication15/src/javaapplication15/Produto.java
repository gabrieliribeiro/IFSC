package javaapplication15;


public class Produto implements PedidoItem {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularValorTotal() {
        return preco;
    }
}
