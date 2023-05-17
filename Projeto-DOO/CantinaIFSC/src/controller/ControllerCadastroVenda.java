/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCarteirinha;
import view.BuscaVenda;
import view.CadastroCarteirinha;
import view.CadastroVenda;

/**
 *
 * @author Thiago
 */
public class ControllerCadastroVenda implements ActionListener {

    CadastroVenda cadastroVenda;

    public ControllerCadastroVenda(CadastroVenda cadastroVenda) {
        this.cadastroVenda = cadastroVenda;

       this.cadastroVenda.getjButtonNew().addActionListener(this);
        this.cadastroVenda.getjBExit4().addActionListener(this);
        this.cadastroVenda.getjButtonCancel().addActionListener(this);
        this.cadastroVenda.getjButtonSave().addActionListener(this);
        this.cadastroVenda.getjButtonBuscar().addActionListener(this);
        this.cadastroVenda.getjButtonBuscarCarteirinha().addActionListener(this);
        this.cadastroVenda.getjButtonAddCarteirinha().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroVenda.getBottompane());
        utilities.Utilities.limpaComponentes(true, this.cadastroVenda.getMidpane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroVenda.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroVenda.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroVenda.getMidpane());

        } else if (e.getSource() == this.cadastroVenda.getjBExit4()) {
            this.cadastroVenda.dispose();

        } else if (e.getSource() == this.cadastroVenda.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroVenda.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroVenda.getMidpane());

        } else if (e.getSource() == this.cadastroVenda.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroVenda.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroVenda.getMidpane());

        } else if (e.getSource() == this.cadastroVenda.getjButtonBuscar()) {
            BuscaVenda buscaVenda = new BuscaVenda(null, true);
            ControllerBuscaVenda controllerBuscaVenda = new ControllerBuscaVenda(buscaVenda);
            buscaVenda.setVisible(true);

            //Inserir o controller da busca de bairros
        } else if (e.getSource() == this.cadastroVenda.getjButtonAddCarteirinha()) {
            CadastroCarteirinha cadastroCarteirinha = new CadastroCarteirinha();
            ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(cadastroCarteirinha);
            cadastroCarteirinha.setVisible(true);
            
        } else if (e.getSource() == this.cadastroVenda.getjButtonBuscarCarteirinha()) {
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha(null, true);
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            buscaCarteirinha.setVisible(true);

        }

    }

}
