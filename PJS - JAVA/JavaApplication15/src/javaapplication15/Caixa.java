package javaapplication15;

import java.util.ArrayList;
import java.util.List;


public class Caixa implements PedidoItem {
    private String nome;
    private List<PedidoItem> itens;

    public Caixa(String nome) {
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(PedidoItem item) {
        itens.add(item);
    }

    public void removerItem(PedidoItem item) {
        itens.remove(item);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (PedidoItem item : itens) {
            valorTotal += item.calcularValorTotal();
        }
        return valorTotal;
    }
}
