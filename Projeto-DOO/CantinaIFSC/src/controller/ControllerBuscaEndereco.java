/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Endereco;
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
        utilities.Utilities.ativa(true, this.buscaEndereco.getMidpane());
        utilities.Utilities.ativa(true, this.buscaEndereco.getToppane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaEndereco.getjButtonFiltrar()) {
            DAO.ClasseDados.getInstance();

            DefaultTableModel tabela = (DefaultTableModel) this.buscaEndereco.getjTable().getModel();
            if (tabela.getRowCount() == 0) {
                for (Endereco enderecoAtual : DAO.ClasseDados.listaEndereco) {
                    tabela.addRow(new Object[]{enderecoAtual.getId(), enderecoAtual.getLogradouro(), enderecoAtual.getCidade().getDescricao(), enderecoAtual.getBairro().getDescricao()});
                }
            }

        } else if (e.getSource() == this.buscaEndereco.getjButtonCarregar()) {
            int selectedRow = this.buscaEndereco.getjTable().getSelectedRow();
            if (selectedRow != -1) {
                ControllerCadastroCliente.codigoEndereco = (int) this.buscaEndereco.getjTable().getValueAt(selectedRow, 0);

                ControllerCadastroEndereco.codigo = (int) this.buscaEndereco.getjTable().getValueAt(selectedRow, 0);
                this.buscaEndereco.dispose();

                ControllerCadastroFornecedor.codigoEndereco = (int) this.buscaEndereco.getjTable().getValueAt(selectedRow, 0);

                ControllerCadastroFuncionario.codigoEndereco = (int) this.buscaEndereco.getjTable().getValueAt(selectedRow, 0);
            }

        } else if (e.getSource() == this.buscaEndereco.getJButtonExit()) {
            this.buscaEndereco.dispose();
        }
    }
}
