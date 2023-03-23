//b) Não se sabe o número de equipes.

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaEquipe {

    ArrayList<DadosEquipe> equipes = new ArrayList<>();
    public int quantEquipe;

    public void setQuantEquipe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de equipes a serem cadastradas: ");
        this.quantEquipe = scanner.nextInt();

        for (int i = 0; i < this.quantEquipe; i++) {

            DadosEquipe dadosEquipe = new DadosEquipe();

            System.out.println("Cadastro da equipe " + (i + 1));

            System.out.println("Informe o nome da equipe:");
            dadosEquipe.setNome(scanner.next());

            System.out.println("Informe o nome da cidade:");
            dadosEquipe.setCidade(scanner.next());

            System.out.println("Informe o nome do técnico:");
            dadosEquipe.setTecnico(scanner.next());

            System.out.println("Informe a pontuação:");
            dadosEquipe.setPontuacao(scanner.nextFloat());

            System.out.println("Informe a quantidade de vitórias:");
            dadosEquipe.setQuant_vitoria(scanner.nextInt());

            System.out.println("Informe a quantidade de sets vencidos:");
            dadosEquipe.setSet_vencidos(scanner.nextInt());

            System.out.println("Informe a colocação:");
            dadosEquipe.setColocacao(scanner.nextInt());

            System.out.println("Informe um e-mail:");
            dadosEquipe.setEmail(scanner.next());

            equipes.add(dadosEquipe);
        }
    }
}