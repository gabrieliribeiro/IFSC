package formasGeometricas;

public class FabricaBotaoQuadrado extends ButtonFactory{
    @Override
    public Button criaBotao() {
        return new QuadradoButton();
    }
}
