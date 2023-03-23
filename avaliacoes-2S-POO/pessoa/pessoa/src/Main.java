import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int totalF = 0;
        int totalM = 0;
        float salario = 0;
        float media = 0;

        ArrayList<DadosPessoa> peoples = new ArrayList<>();

        int contaPessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pessoas serão cadastradas?"));

        for (int i = 0; i< contaPessoa; i++){
            DadosPessoa person = new DadosPessoa();

            person.setNome(JOptionPane.showInputDialog(null, "Informe seu nome: "));
            person.setSexo(JOptionPane.showInputDialog(null, "Informe seu sexo (F ou M): ").toUpperCase());
            person.setAno_nascimento(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe seu ano de nascimento: ")));
            person.setSalario(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu salário: ")));
            person.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe sua altura: ")));
            person.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu peso: ")));

            if(Objects.equals(person.getSexo(), "F")){
                totalF++;
            }else{
                totalM++;
            }

            salario += person.getSalario();

            peoples.add(person);
        }
        media = salario/contaPessoa;

        for(int i = 0; i < contaPessoa; i++){
            JOptionPane.showMessageDialog(null,"Total de pessoas: " + contaPessoa +
                                                                        "\n|  Total de Homens:" + totalM+
                                                                        "\n|  Total Mulheres: " + totalF +
                                                                        "\n|  Acumulo dos salários :" + salario+
                                                                        "\n|  Média dos salários :" + media + "  \n -----------------------------"+ peoples.get(i).toString());
        }
    }
}
