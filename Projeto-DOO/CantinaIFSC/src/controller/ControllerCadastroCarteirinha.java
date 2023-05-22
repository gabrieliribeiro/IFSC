/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCarteirinha;
import view.BuscaCliente;
import view.CadastroCarteirinha;
import view.CadastroCliente;

/**
 *
 * @author gabri
 */
public class ControllerCadastroCarteirinha implements ActionListener {

    CadastroCarteirinha cadastroCarteirinha;

    public ControllerCadastroCarteirinha(CadastroCarteirinha cadastroCarteirinha) {
        this.cadastroCarteirinha = cadastroCarteirinha;

        this.cadastroCarteirinha.getjButtonNew().addActionListener(this);
        this.cadastroCarteirinha.getjButtonSave().addActionListener(this);
        this.cadastroCarteirinha.getjButtonCancel().addActionListener(this);
        this.cadastroCarteirinha.getjButtonBuscar().addActionListener(this);
        this.cadastroCarteirinha.getJButtonExit().addActionListener(this);
        this.cadastroCarteirinha.getjButtonPesquisarCPF().addActionListener(this);
        this.cadastroCarteirinha.getjButtonAdicionarCPF().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getBottompane());
        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getToppane());
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCarteirinha.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroCarteirinha.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinha.getMidpane());

        } else if (e.getSource() == this.cadastroCarteirinha.getJButtonExit()) {
            this.cadastroCarteirinha.dispose();

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroCarteirinha.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getMidpane());

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroCarteirinha.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroCarteirinha.getMidpane());

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonBuscar()) {
            
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha();
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            //Inserir o controller da busca de bairros
            buscaCarteirinha.setVisible(true);

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonAdicionarCPF()) {
            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);
            cadastroCliente.setVisible(true);

        } else if (e.getSource() == this.cadastroCarteirinha.getjButtonPesquisarCPF()) {
            BuscaCliente buscaCliente = new BuscaCliente();
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.setVisible(true);
        }
    }
}
