package observer.model;

import java.util.ArrayList;
import java.util.List;
import observer.interfaces.Observer;
import observer.interfaces.Subject;

public class ConcreteSubject implements Subject{
    private int state;
    private List<Observer> observers;
    
    
    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void register(Observer observer) {
        if (observer == null) System.out.println("Observer nulo!");
        else
            if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.state;
    }
    
    public void postMessage(int sta){
        System.out.println("Estado foi alterado:  " + sta);
        this.state = sta;
        notifyObservers();
    }
}
