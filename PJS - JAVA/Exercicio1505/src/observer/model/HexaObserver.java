/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.model;


public class HexaObserver extends ConcreteObserver{

    public HexaObserver(String name) {
        super(name);
    }

    @Override
    public void printState() {
        System.out.println("Hexa: " + Integer.toHexString(super.getNewState()));
    }
    
    
}
