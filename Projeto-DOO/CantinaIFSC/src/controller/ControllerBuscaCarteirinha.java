/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCarteirinha;

/**
 *
 * @author gabri
 */
public class ControllerBuscaCarteirinha  implements ActionListener{
        
    BuscaCarteirinha buscaCarteirinha;

    public ControllerBuscaCarteirinha(BuscaCarteirinha buscaCarteirinha) {
        this.buscaCarteirinha = buscaCarteirinha;
        
        this.buscaCarteirinha.getjButtonFiltrar().addActionListener(this);
        this.buscaCarteirinha.getjButtonCarregar().addActionListener(this);
        this.buscaCarteirinha.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaCarteirinha.getBottompane());
        utilities.Utilities.ativa(true, this.buscaCarteirinha.getjPanelDados());
        utilities.Utilities.ativa(true, this.buscaCarteirinha.getToppane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCarteirinha.getjButtonFiltrar()){
        
        }else if(e.getSource() == this.buscaCarteirinha.getjButtonCarregar()){
        
        }else if(e.getSource() == this.buscaCarteirinha.getJButtonExit()){
            this.buscaCarteirinha.dispose();
            
        }
    }
}
