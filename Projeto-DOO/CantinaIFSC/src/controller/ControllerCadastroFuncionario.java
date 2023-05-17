/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaEndereco;
import view.BuscaFuncionario;
import view.CadastroEndereco;
import view.CadastroFuncionario;

/**
 *
 * @author Thiago
 */
public class ControllerCadastroFuncionario implements ActionListener {

    CadastroFuncionario cadastroFuncionario;

    public ControllerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;

        this.cadastroFuncionario.getjButtonNew().addActionListener(this);
        this.cadastroFuncionario.getjBExit().addActionListener(this);
        this.cadastroFuncionario.getjButtonCancel().addActionListener(this);
        this.cadastroFuncionario.getjButtonSave().addActionListener(this);
        this.cadastroFuncionario.getjButtonBuscar().addActionListener(this);
        this.cadastroFuncionario.getjButtonBuscarcep().addActionListener(this);
        this.cadastroFuncionario.getjButtonAddCEP().addActionListener(this);
        
        
        utilities.Utilities.ativa(true, this.cadastroFuncionario.getBottompane());
        utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getMidpane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == this.cadastroFuncionario.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroFuncionario.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getMidpane());

        } else if (e.getSource() == this.cadastroFuncionario.getjBExit()) {
            this.cadastroFuncionario.dispose();

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroFuncionario.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getMidpane());

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroFuncionario.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroFuncionario.getMidpane());

        } else if (e.getSource() == this.cadastroFuncionario.getjButtonBuscar()) {
            BuscaFuncionario buscaFuncionario = new BuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(buscaFuncionario);
            buscaFuncionario.setVisible(true);
             
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonBuscarcep()){
             BuscaEndereco buscaEndereco = new BuscaEndereco(null, true);
             ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
             buscaEndereco.setVisible(true);
                
        } else if (e.getSource() == this.cadastroFuncionario.getjButtonAddCEP()){
             CadastroEndereco cadastroEndereco = new CadastroEndereco();
             ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
             cadastroEndereco.setVisible(true);
        }
    }

}
