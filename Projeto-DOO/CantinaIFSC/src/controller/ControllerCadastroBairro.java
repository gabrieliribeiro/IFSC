/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.bo.Bairro;
import view.BuscaBairro;
import view.CadastroBairro;

/**
 *
 * @author gabri
 */
public class ControllerCadastroBairro implements ActionListener {

    CadastroBairro cadastroBairro;
    public static int codigo;
    
    public ControllerCadastroBairro(CadastroBairro cadastroBairro) {
        this.cadastroBairro = cadastroBairro;

        this.cadastroBairro.getJButtonExit().addActionListener(this);
        this.cadastroBairro.getjButtonBuscar().addActionListener(this);
        this.cadastroBairro.getjButtonNew().addActionListener(this);
        this.cadastroBairro.getjButtonSave().addActionListener(this);
        this.cadastroBairro.getjButtonCancel().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroBairro.getBottompane());
        utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getMidpane());
    }
    
    WindowListener disposeListener = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
                if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = DAO.ClasseDados.listaBairro.get(codigo - 1);
                utilities.Utilities.ativa(false, cadastroBairro.getBottompane());
                utilities.Utilities.limpaComponentes(true, cadastroBairro.getMidpane());

                cadastroBairro.getjTFId().setText(bairro.getId() + "");
                cadastroBairro.getjTFDescricao().setText(bairro.getDescricao());
                cadastroBairro.getjTFId().setEnabled(false);
            }
        }  
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroBairro.getjButtonNew()) {
            
            utilities.Utilities.ativa(false, this.cadastroBairro.getBottompane());
            utilities.Utilities.ativa(false, this.cadastroBairro.getMidpane());
            utilities.Utilities.limpaComponentes(true, this.cadastroBairro.getMidpane());
             this.cadastroBairro.getjTFId().setEditable(false);
            
        } else if (e.getSource() == this.cadastroBairro.getJButtonExit()) {
            
            this.cadastroBairro.dispose();
            
        } else if (e.getSource() == this.cadastroBairro.getjButtonCancel()){
            
            utilities.Utilities.ativa(true, this.cadastroBairro.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroBairro.getMidpane());
            utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getMidpane());
            
        } else if (e.getSource() == this.cadastroBairro.getjButtonSave()) {
            
            Bairro bairro = new Bairro();
            
            bairro.setId(DAO.ClasseDados.listaBairro.size()+1);
            bairro.setDescricao(this.cadastroBairro.getjTFDescricao().getText());
            DAO.ClasseDados.listaBairro.add(bairro);
            
            utilities.Utilities.ativa(true, cadastroBairro.getMidpane());
            utilities.Utilities.ativa(true, this.cadastroBairro.getMidpane());
            utilities.Utilities.limpaComponentes(false, cadastroBairro.getMidpane());
            
            //Fazer tela de retorno para usuario
            
        } else if (e.getSource() == this.cadastroBairro.getjButtonBuscar()) {
            codigo = 0;
            BuscaBairro buscaBairro = new BuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.addWindowListener(disposeListener); 
            buscaBairro.setVisible(true);
        }
    }

}
