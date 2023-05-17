/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaBairro;

/**
 *
 * @author gabri
 */
public class ControllerBuscaBairro implements ActionListener{
    
    BuscaBairro buscaBairro;
    
    public ControllerBuscaBairro(BuscaBairro buscaBairro){
        this.buscaBairro = buscaBairro;
        
        this.buscaBairro.getjButtonFiltrar().addActionListener(this);
        this.buscaBairro.getjButtonCarregar().addActionListener(this);
        this.buscaBairro.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaBairro.getBottompane());
        utilities.Utilities.ativa(true, this.buscaBairro.getjPanelDados());
        utilities.Utilities.ativa(true, this.buscaBairro.getToppane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.buscaBairro.getjButtonFiltrar()) {
            
        }else if(e.getSource()==this.buscaBairro.getjButtonCarregar()){ 
            
        }else if (e.getSource()==this.buscaBairro.getJButtonExit()) {
            this.buscaBairro.dispose();
        }
    }
    
}
