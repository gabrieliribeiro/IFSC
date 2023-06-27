package DAO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import model.bo.Bairro;
import model.bo.Caixa;
import model.bo.Carteirinha;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Compra;
import model.bo.Contas;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import model.bo.ItemCompra;
import model.bo.ItemVenda;
import model.bo.MovimentacaoCaixa;
import model.bo.MovimentacaoEstoque;
import model.bo.Produto;
import model.bo.Venda;

public class ClasseDados {
    private static ClasseDados uniqueInstance;
   
    public static ArrayList<Bairro> listaBairro = new ArrayList<>();
    public static ArrayList<Cidade> listaCidade  = new ArrayList<>();
    public static  ArrayList<Endereco> listaEndereco = new ArrayList<>();
    public static ArrayList<Cliente> listaCliente = new ArrayList<>();
    public static ArrayList<Fornecedor> listaFornecedor  = new ArrayList<>();
    public static ArrayList<Funcionario> listaFuncionario  = new ArrayList<>();
    public static ArrayList<Caixa>listaCaixas = new ArrayList<>();
    public static ArrayList<Carteirinha>listaCarteirinhas = new ArrayList<>();
    public static ArrayList<Compra>listaCompras = new ArrayList<>();
    public static ArrayList<Contas> listaContas = new ArrayList<>();
    public static ArrayList<ItemCompra>listaItemCompra = new ArrayList<>();
    public static ArrayList<ItemVenda>itemVenda = new ArrayList<>();
    public static ArrayList<MovimentacaoEstoque>listamMovimentacaoestoque = new ArrayList<>();
    public static ArrayList<MovimentacaoCaixa>listaMovimentocaixa = new ArrayList<>();
    public static ArrayList<Produto>listaProdutos =new ArrayList<>();
    public static ArrayList<Venda>listaVendas = new ArrayList<>();
    
    
    private ClasseDados() {
        MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
        Caixa caixa = new Caixa();
        Venda venda = new Venda();

        Bairro bairro = new Bairro(1, "Vila Santo Antônio");
        Bairro bairro2 = new Bairro(2, "Vila Nova");
        Bairro bairro3 = new Bairro(3, "Centro");
        listaBairro.add(bairro);
        listaBairro.add(bairro2);
        listaBairro.add(bairro3);

        Cidade cidade = new Cidade(1, "Imbituba", "SC");
        listaCidade.add(cidade);

        Endereco endereco = new Endereco(1, "88780000", "Rua Amazonas", 's', bairro, cidade);
        listaEndereco.add(endereco);

        Cliente cliente = new Cliente("12937866913", "7784569", "1", "02/06/2002", 1, "Gabrieli Ribeiro", "(48)99999-9999", "(48)98888-8888", "gabi@gmail.com", 's', "Campo do Robertinho", endereco);
        listaCliente.add(cliente);

        Carteirinha carteirinha = new Carteirinha(1, "123", "01/01/2023", "10/10/2025", cliente);
        listaCarteirinhas.add(carteirinha);
    }
    
    public  static synchronized ClasseDados getInstance(){   
        if (uniqueInstance == null) {
            uniqueInstance = new ClasseDados();
        }
        return uniqueInstance;
    }
    
}
