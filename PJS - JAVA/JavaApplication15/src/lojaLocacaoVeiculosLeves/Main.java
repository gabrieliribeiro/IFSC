package lojaLocacaoVeiculosLeves;

public class Main {
    public static void main(String[] args) {

        FabricaVeiculos fabricaBicicleta = new FabricaBicicleta();
        Veiculo bicicleta = fabricaBicicleta.criaVeiculo();
        bicicleta.locomocao();

        FabricaVeiculos fabricaPatinete = new FabricaPatinete();
        Veiculo scooter = fabricaPatinete.criaVeiculo();
        scooter.locomocao();
    }
}
