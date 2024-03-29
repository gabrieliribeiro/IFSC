/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaVenda;

/**
 *
 * @author gabri
 */
public class ControllerBuscaVenda implements ActionListener{
    
    BuscaVenda buscaVenda;

    public ControllerBuscaVenda(BuscaVenda buscaVenda) {
        this.buscaVenda = buscaVenda;
        
        this.buscaVenda.getjButtonFiltrar().addActionListener(this);
        this.buscaVenda.getjButtonCarregar().addActionListener(this);
        this.buscaVenda.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaVenda.getBottompane());
        utilities.Utilities.ativa(true, this.buscaVenda.getjPanelDados());
        utilities.Utilities.ativa(true, this.buscaVenda.getToppane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaVenda.getjButtonFiltrar()){
        
        }else if(e.getSource() == this.buscaVenda.getjButtonCarregar()){
        
        }else if(e.getSource() == this.buscaVenda.getJButtonExit()){
            this.buscaVenda.dispose();
            
        }
        
    }
}
