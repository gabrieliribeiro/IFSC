/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaEndereco;

/**
 *
 * @author gabri
 */
public class ControllerBuscaEndereco implements ActionListener {
    BuscaEndereco buscaEndereco;
   
    
    public ControllerBuscaEndereco( BuscaEndereco buscaEndereco){
        this.buscaEndereco = buscaEndereco;
        
        this.buscaEndereco.getjButtonFiltrar().addActionListener(this);
        this.buscaEndereco.getjButtonCarregar().addActionListener(this);
        this.buscaEndereco.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaEndereco.getBottompane());
        utilities.Utilities.ativa(true, buscaEndereco.getToppane());
        utilities.Utilities.ativa(true, this.buscaEndereco.getToppane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.buscaEndereco.getjButtonFiltrar()) {
            
        }else if(e.getSource()==this.buscaEndereco.getjButtonCarregar()){ 
            
        }else if (e.getSource()==this.buscaEndereco.getJButtonExit()) {
            this.buscaEndereco.dispose();
        }
    }
}