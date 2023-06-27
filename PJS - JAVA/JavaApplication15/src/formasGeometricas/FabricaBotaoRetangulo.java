package formasGeometricas;

public class FabricaBotaoRetangulo extends ButtonFactory{
    @Override
    public Button criaBotao() {
        return new RetanguloButton();
    }
}
