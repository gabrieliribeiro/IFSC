 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Carteirinha;
import view.BuscaCarteirinha;

/**
 *
 * @author gabri
 */
public class ControllerBuscaCarteirinha implements ActionListener {
    
    private BuscaCarteirinha buscaCarteirinha;

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
        if (e.getSource() == this.buscaCarteirinha.getjButtonFiltrar()) {
            DAO.ClasseDados.getInstance();

            DefaultTableModel tabela = (DefaultTableModel) this.buscaCarteirinha.getjTable().getModel();
            tabela.setRowCount(0);

            for (Carteirinha carteirinhaAtual : DAO.ClasseDados.listaCarteirinhas) {
                tabela.addRow(new Object[]{carteirinhaAtual.getId(), carteirinhaAtual.getCliente().getCpf(), carteirinhaAtual.getCliente().getNome()});
            }
        } else if (e.getSource() == this.buscaCarteirinha.getjButtonCarregar()) {
            int selectedRow = this.buscaCarteirinha.getjTable().getSelectedRow();
            if (selectedRow != -1) {
                int codigo = (int) this.buscaCarteirinha.getjTable().getValueAt(selectedRow, 0);
                controller.ControllerCadastroCarteirinha.codigo = codigo;
                this.buscaCarteirinha.dispose();
            }
        } else if (e.getSource() == this.buscaCarteirinha.getJButtonExit()) {
            this.buscaCarteirinha.dispose();
        }
    }
}
