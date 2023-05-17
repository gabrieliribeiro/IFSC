
package exercicio1505;

import  observer.interfaces.Observer;
import observer.model.BinaryObserver;
import observer.model.ConcreteSubject;
import observer.model.HexaObserver;
import observer.model.OctalObserver;


public class Teste {

    public static void main(String[] args) {
        
        ConcreteSubject topic = new ConcreteSubject();
        Observer firstObserver = new  BinaryObserver("First");
        Observer secondObserver = new  HexaObserver("Second");
        Observer thirdObserver = new  OctalObserver("Third");
        
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);
        
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);
        
        topic.postMessage(23);
        
        

       
    }
    
}
