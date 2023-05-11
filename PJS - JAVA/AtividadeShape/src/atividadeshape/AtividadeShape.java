package atividadeshape;

import atividadeshape.interfaces.Shape;
import atividadeshape.model.Circle;
import atividadeshape.model.Rectangle;

public class AtividadeShape {

    public static void main(String[] args) {
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area = " + shape.getArea());
        
        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area = " + shape.getArea());
    }
    
}
