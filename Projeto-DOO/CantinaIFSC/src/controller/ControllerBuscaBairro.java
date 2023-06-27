/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Bairro;
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
            DAO.ClasseDados.getInstance();
            
            DefaultTableModel tabela = (DefaultTableModel) this.buscaBairro.getjTable().getModel();
             for (Bairro bairroAtual : DAO.ClasseDados.listaBairro) {
                tabela.addRow(new Object[]{bairroAtual.getId(),bairroAtual.getDescricao()});
            }
            
        }else if(e.getSource()==this.buscaBairro.getjButtonCarregar()){ 
            controller.ControllerCadastroBairro.codigo = (int) this.buscaBairro.getjTable().getValueAt(this.buscaBairro.getjTable().getSelectedRow(), 0);
            this.buscaBairro.dispose();
 
        }else if (e.getSource()==this.buscaBairro.getJButtonExit()) {
            this.buscaBairro.dispose();
        }
    }
    
}
