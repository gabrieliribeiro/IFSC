/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaBairro;
import view.CadastroBairro;

/**
 *
 * @author gabri
 */
public class ControllerCadastroBairro implements ActionListener {

    CadastroBairro cadastroBairro;

    public ControllerCadastroBairro(CadastroBairro cadastroBairro) {
        this.cadastroBairro = cadastroBairro;

        this.cadastroBairro.getJButtonExit().addActionListener(this);
        this.cadastroBairro.getjButtonBuscar().addActionListener(this);
        this.cadastroBairro.getjButtonNew().addActionListener(this);
        this.cadastroBairro.getjButtonSave().addActionListener(this);
        this.cadastroBairro.getjButtonCancel().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroBairro.getBottompane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroBairro.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroBairro.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroBairro.getMidpane());
            
        } else if (e.getSource() == this.cadastroBairro.getJButtonExit()) {
            this.cadastroBairro.dispose();
            
        } else if (e.getSource() == this.cadastroBairro.getjButtonCancel()){
            utilities.Utilities.ativa(true, this.cadastroBairro.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getMidpane());
            
        } else if (e.getSource() == this.cadastroBairro.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroBairro.getMidpane());
            utilities.Utilities.limpaComponentes(false, cadastroBairro.getMidpane());
        } else if (e.getSource() == this.cadastroBairro.getjButtonBuscar()) {
            BuscaBairro buscaBairro = new BuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            
            buscaBairro.setVisible(true);
        }
    }

}
