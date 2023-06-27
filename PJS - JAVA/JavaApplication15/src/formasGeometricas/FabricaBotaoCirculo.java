package formasGeometricas;

public class FabricaBotaoCirculo extends ButtonFactory{
    @Override
    public Button criaBotao() {
        return new CirculoButton();
    }
}
