package formasGeometricas;

public class Main {
    public static void main(String[] args) {
        ButtonFactory fabricaCirculo = new FabricaBotaoCirculo();
        Button botaoCirculo = fabricaCirculo.criaBotao();
        botaoCirculo.draw();

        ButtonFactory fabricaRetangulo = new FabricaBotaoRetangulo();
        Button botaoRetangulo = fabricaRetangulo.criaBotao();
        botaoRetangulo.draw();

        ButtonFactory fabricaQuadrado = new FabricaBotaoQuadrado();
        Button botaoQuadrado = fabricaQuadrado.criaBotao();
        botaoQuadrado.draw();

    }
}
