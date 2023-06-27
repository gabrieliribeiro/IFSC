package javaapplication15;

public class Main {


    public static void main(String[] args) {
       
        Produto martelo = new Produto("Martelo", 15.99);
        Produto telefone = new Produto("Telefone", 199.99);
        Produto fonesDeOuvido = new Produto("Fones de Ouvido", 49.99);
        Produto carregador = new Produto("Carregador", 29.99);
        
        Caixa caixa1 = new Caixa("Caixa 1");
        caixa1.adicionarItem(martelo);
        caixa1.adicionarItem(telefone);

        Caixa caixa2 = new Caixa("Caixa 2");
        caixa2.adicionarItem(fonesDeOuvido);
        caixa2.adicionarItem(carregador);

        Caixa caixaPrincipal = new Caixa("Caixa Principal");
        caixaPrincipal.adicionarItem(caixa1);
        caixaPrincipal.adicionarItem(caixa2);

        double valorTotalPedido = caixaPrincipal.calcularValorTotal();
        System.out.println("Valor total do pedido: R$" + valorTotalPedido);
    }
    
}
