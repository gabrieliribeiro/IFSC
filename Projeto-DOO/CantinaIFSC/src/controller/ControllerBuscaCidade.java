/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCidade;

/**
 *
 * @author gabri
 */
public class ControllerBuscaCidade  implements ActionListener{
    BuscaCidade buscaCidade;
    
    public ControllerBuscaCidade(BuscaCidade buscaCidade){
        this.buscaCidade = buscaCidade;
        
        this.buscaCidade.getjButtonFiltrar().addActionListener(this);
        this.buscaCidade.getjButtonCarregar().addActionListener(this);
        this.buscaCidade.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaCidade.getBottompane());
        utilities.Utilities.ativa(true, this.buscaCidade.getToppane());
        utilities.Utilities.ativa(true, this.buscaCidade.getjPanelDados());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.buscaCidade.getjButtonFiltrar()) {
            
        }else if(e.getSource()==this.buscaCidade.getjButtonCarregar()){ 
            
        }else if (e.getSource()==this.buscaCidade.getJButtonExit()) {
            this.buscaCidade.dispose();
        }
    }
}