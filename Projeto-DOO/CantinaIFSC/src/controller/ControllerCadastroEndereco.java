/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaEndereco;
import view.CadastroEndereco;


public class ControllerCadastroEndereco implements ActionListener{
    
    CadastroEndereco cadastroEndereco;

    public ControllerCadastroEndereco(CadastroEndereco cadastroEndereco) {
        
        this.cadastroEndereco = cadastroEndereco;
        
        this.cadastroEndereco.getjButtonNew().addActionListener(this);
        this.cadastroEndereco.getjBExit4().addActionListener(this);
        this.cadastroEndereco.getjButtonCancel().addActionListener(this);
        this.cadastroEndereco.getjButtonSave().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.cadastroEndereco.getBottompane());
        utilities.Utilities.ativa(true, cadastroEndereco.getToppane4());
        utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getMidpane());
    }

    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroEndereco.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroEndereco.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getMidpane());

        } else if (e.getSource() == this.cadastroEndereco.getjBExit4()) {
            this.cadastroEndereco.dispose();

        } else if (e.getSource() == this.cadastroEndereco.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroEndereco.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getMidpane());

        } else if (e.getSource() == this.cadastroEndereco.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroEndereco.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroEndereco.getMidpane());

        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscar()) {
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            //Inserir o controller da busca de bairros
            buscaEndereco.setVisible(true);

        }
    }
    
}
