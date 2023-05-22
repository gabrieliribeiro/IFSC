/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCidade;
import view.CadastroCidade;

/**
 *
 * @author gabri
 */
public class ControllerCadastroCidade implements ActionListener {

    CadastroCidade cadastroCidade;

    public ControllerCadastroCidade(CadastroCidade cadastroCidade) {
        this.cadastroCidade = cadastroCidade;

        this.cadastroCidade.getjButtonNew().addActionListener(this);
        this.cadastroCidade.getjButtonCancel().addActionListener(this);
        this.cadastroCidade.getjButtonBuscar().addActionListener(this);
        this.cadastroCidade.getJButtonExit().addActionListener(this);
        this.cadastroCidade.getjButtonSave().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroCidade.getBottompane());
        utilities.Utilities.ativa(true, this.cadastroCidade.getToppane());
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCidade.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroCidade.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroCidade.getMidpane());

        } else if (e.getSource() == this.cadastroCidade.getJButtonExit()) {
            this.cadastroCidade.dispose();
            

        } else if (e.getSource() == this.cadastroCidade.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroCidade.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getMidpane());

        } else if (e.getSource() == this.cadastroCidade.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroCidade.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroCidade.getMidpane());

        } else if(e.getSource() == this.cadastroCidade.getjButtonBuscar()){
            BuscaCidade buscaCidade = new BuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            //Inserir o controller da busca de bairros
            buscaCidade.setVisible(true);

        }
    }
    
}
