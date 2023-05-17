
package observer.model;

 import observer.interfaces.Observer;
import observer.interfaces.Subject;


public class ConcreteObserver implements Observer{
    
    private String name;
    private  Subject topic;
    private int newState;
    
    
    public ConcreteObserver(String name) {
        this.name = name;
    }
    
     public void setNewState(int state){
        this.newState = state;
    }
    
    public int getNewState(){
        return newState;
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }

    @Override
    public void update() {
         Object state = topic.getUpdate(this);
        if (state == null) {
            System.out.println("Sem mensagens");
        }else{
            this.newState = (Integer)state;
            printState();
        }
       
    }
    
    public  void printState(){
        System.out.println("Novo estado: " + this.newState);
    }
    
}
