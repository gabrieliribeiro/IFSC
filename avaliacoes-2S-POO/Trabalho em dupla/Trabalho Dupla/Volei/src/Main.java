
//  A Federação Catarinense de Vôlei necessita de uma aplicação
//para cadastrar as equipes que participaram do Campeonato Estadual Adulto
//do ano de 2022.

public class Main {
    public static void main(String[] args) {
        ContaEquipe contaEquipe = new ContaEquipe();
        contaEquipe.setQuantEquipe();


        DadosEquipe equipeTop1 = null;
        DadosEquipe equipeTop2 = null;
        DadosEquipe equipeTop3 = null;

        for (int i = 0; i < contaEquipe.quantEquipe; i++) {
            DadosEquipe dadosEquipe = contaEquipe.equipes.get(i);

            if (dadosEquipe.colocacao == 1) {
                equipeTop1 = dadosEquipe;
            }
            if (dadosEquipe.colocacao == 2) {
                equipeTop2 = dadosEquipe;
            }
            if (dadosEquipe.colocacao == 3) {
                equipeTop3 = dadosEquipe;
            }
        }

        if (equipeTop1 != null){
            System.out.println("Resultados");
            System.out.println("---------------------------------");
            System.out.println("Em 1° Lugar");
            System.out.println("Nome: " + equipeTop1.nome);
            System.out.println("Cidade: " + equipeTop1.cidade);
            System.out.println("Técnico: " + equipeTop1.tecnico);
            System.out.println("Pontuacao: " + equipeTop1.pontuacao);
            System.out.println("Quantidade de Vitória: " + equipeTop1.quant_vitoria);
            System.out.println("Quantidade de set vencidos: " + equipeTop1.set_vencidos);
            System.out.println("Colocação da Equipe: " + equipeTop1.colocacao);
            System.out.println("email: " + equipeTop1.email);
        }

        if (equipeTop2 != null){
            System.out.println("---------------------------------");
            System.out.println("Em 2° Lugar");
            System.out.println("Nome: " + equipeTop2.nome);
            System.out.println("Cidade: " + equipeTop2.cidade);
        }

        if (equipeTop3 != null){
            System.out.println("---------------------------------");
            System.out.println("Em 3° Lugar");
            System.out.println("Nome: " + equipeTop3.nome);
            System.out.println("Cidade: " + equipeTop3.cidade);
        }
        System.out.println("---------------------------------");
        System.out.println("Total de equipes participantes: " + contaEquipe.quantEquipe);



    }
}