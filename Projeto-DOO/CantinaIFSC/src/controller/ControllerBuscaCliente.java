/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cliente;
import view.BuscaCliente;

/**
 *
 * @author gabri
 */
public class ControllerBuscaCliente  implements  ActionListener{
    BuscaCliente buscaCliente;
    String quemChama;
    
     public ControllerBuscaCliente(BuscaCliente buscaCliente) {
        this.buscaCliente = buscaCliente;

        this.buscaCliente.getjButtonFiltrar().addActionListener(this);
        this.buscaCliente.getjButtonCarregar().addActionListener(this);
        this.buscaCliente.getJButtonExit().addActionListener(this);
        


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaCliente.getjButtonFiltrar()) {
            DAO.ClasseDados.getInstance();

            DefaultTableModel tabela = (DefaultTableModel) this.buscaCliente.getjTable().getModel();
            tabela.setRowCount(0); // Clear the existing table rows

            for (Cliente clienteAtual : DAO.ClasseDados.listaCliente) {
                tabela.addRow(new Object[]{clienteAtual.getId(), clienteAtual.getCpf(), clienteAtual.getNome(),clienteAtual.getStatus()});
            }
            
        } else if (e.getSource() == this.buscaCliente.getjButtonCarregar()) {
            int selectedRow = this.buscaCliente.getjTable().getSelectedRow();
            if (selectedRow != -1) {
                int codigo = (int) this.buscaCliente.getjTable().getValueAt(selectedRow, 0);
                
                if(quemChama == "carteirinha"){
                controller.ControllerCadastroCarteirinha.codigoCliente = codigo;
                }else if (quemChama=="cliente"){
                
            }
                this.buscaCliente.dispose();
            }
        } else if (e.getSource() == this.buscaCliente.getJButtonExit()) {
            this.buscaCliente.dispose();
        }
    }
}
