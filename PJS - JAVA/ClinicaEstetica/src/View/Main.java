
import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import Models.Usuario;

public class Main {

    public static void main(String[] args) {
        String nome = "Gabrieli Ribeiro";
        System.out.println(nome);

        Servico servico = new Servico(2, "Consulta com cardiologista", 200);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());

        Cliente cliente = new Cliente(3, "Raul Pacheco", "Av. Rodovalho", "88705-090", 'M', "02/02/2000", "(48)9 9922-3716", "eu@raulpacheco.com", "871658-49");
        System.out.println(cliente.getNome());

        Usuario usuario = new Usuario(10, "senha123", "eugabiszoka");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getSenha());

       Agendamento agendamento = new Agendamento(11, 200, "02/11/2023", "Gabi linda");
       
    }
}
