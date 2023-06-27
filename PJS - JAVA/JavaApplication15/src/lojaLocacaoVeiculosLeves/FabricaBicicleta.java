package lojaLocacaoVeiculosLeves;

public class FabricaBicicleta implements FabricaVeiculos{

    @Override
    public Veiculo criaVeiculo() {
        return new Bicicleta();
    }
}
