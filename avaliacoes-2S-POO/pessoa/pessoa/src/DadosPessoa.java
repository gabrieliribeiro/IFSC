import java.text.DecimalFormat;

public class DadosPessoa {

    private String nome, sexo;
    private int ano_nascimento;
    private float salario, peso, altura, imc;
    int idade;


    public DadosPessoa(){
    }

    public float getImc() {
        imc = peso / (altura * altura);
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        idade = 2022 - ano_nascimento;
        return idade;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String toString() {
        return "\nDados : " +
                "  \n -----------------------------" +
                "  \n|  Nome = " + getNome() +
                "  \n|  Sexo = " + getSexo() +
                "  \n|  Idade = " + getAno_nascimento() +
                "  \n|  Salario = " + getSalario()+
                "  \n|  Altura = " +getAltura() +
                "  \n|  Peso = " + getPeso() +
                "  \n|  Seu IMC = " + new DecimalFormat("#,##0.00").format(getImc());
    }
}
