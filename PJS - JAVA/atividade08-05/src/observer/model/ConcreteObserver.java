/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.model;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

/**
 *
 * @author gabri
 */
public class ConcreteObserver implements Observer{
    
    private String name;
    private Subject topic;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name+ " Sem novas mensagens! ");
        }else{
            System.out.println(name +" Nova mensagem: " + msg);
        }
        
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
    
    
    
}
