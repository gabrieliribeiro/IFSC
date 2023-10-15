/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Cidade;
import view.BuscaCidade;

/**
 *
 * @author gabri
 */
public class ControllerBuscaCidade  implements ActionListener{
    BuscaCidade buscaCidade;
    
    public ControllerBuscaCidade(BuscaCidade buscaCidade) {
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
        if (e.getSource() == this.buscaCidade.getjButtonFiltrar()) {
            DAO.ClasseDados.getInstance();

            DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getjTable().getModel();
            tabela.setRowCount(0); // Clear the existing table rows

            for (Cidade cidadeAtual : DAO.ClasseDados.listaCidade) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
            }
        } else if (e.getSource() == this.buscaCidade.getjButtonCarregar()) {
            int selectedRow = this.buscaCidade.getjTable().getSelectedRow();
            if (selectedRow != -1) {
                int codigo = (int) this.buscaCidade.getjTable().getValueAt(selectedRow, 0);
                controller.ControllerCadastroEndereco.codigoCidade = codigo;
                controller.ControllerCadastroCidade.codigo = codigo;
                this.buscaCidade.dispose();
            }
        } else if (e.getSource() == this.buscaCidade.getJButtonExit()) {
            this.buscaCidade.dispose();
        }
    }
}