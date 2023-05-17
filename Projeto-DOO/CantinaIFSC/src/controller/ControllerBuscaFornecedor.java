/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaFornecedor;

/**
 *
 * @author gabri
 */
public class ControllerBuscaFornecedor implements ActionListener{
    BuscaFornecedor buscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor buscaFornecedor) {
        this.buscaFornecedor = buscaFornecedor;
        
        this.buscaFornecedor.getjButtonFiltrar().addActionListener(this);
        this.buscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.buscaFornecedor.getJButtonExit().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.buscaFornecedor.getBottompane());
        utilities.Utilities.ativa(true, this.buscaFornecedor.getMidpane());
        utilities.Utilities.ativa(true, this.buscaFornecedor.getToppane());
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaFornecedor.getjButtonFiltrar()){
        
        }else if(e.getSource() == this.buscaFornecedor.getjButtonCarregar()){
        
        }else if(e.getSource() == this.buscaFornecedor.getJButtonExit()){
            this.buscaFornecedor.dispose();
        }
    }
    
    
}
