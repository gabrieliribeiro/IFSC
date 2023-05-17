
package observer.model;



public class OctalObserver extends  ConcreteObserver{
    
    public OctalObserver(String name) {
        super(name);
    }

    @Override
    public void printState() {
        System.out.println("Octal: " + Integer.toOctalString(super.getNewState()));
    }
    
}
