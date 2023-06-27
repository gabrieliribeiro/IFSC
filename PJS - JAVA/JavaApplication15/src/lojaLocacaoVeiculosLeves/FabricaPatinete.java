package lojaLocacaoVeiculosLeves;

public class FabricaPatinete implements FabricaVeiculos{
    @Override
    public Veiculo criaVeiculo() {
        return new Patinete();
    }
}
