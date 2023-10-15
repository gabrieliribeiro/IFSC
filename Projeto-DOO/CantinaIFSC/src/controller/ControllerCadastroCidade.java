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
import model.bo.Cidade;
import utilities.Utilities;
import view.BuscaCidade;
import view.CadastroCidade;

/**
 *
 * @author gabri
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControllerCadastroCidade implements ActionListener {

    CadastroCidade cadastroCidade;
    public static int codigo;

    public ControllerCadastroCidade(CadastroCidade cadastroCidade) {
        this.cadastroCidade = cadastroCidade;

        this.cadastroCidade.getjButtonNew().addActionListener(this);
        this.cadastroCidade.getjButtonCancel().addActionListener(this);
        this.cadastroCidade.getjButtonBuscar().addActionListener(this);
        this.cadastroCidade.getJButtonExit().addActionListener(this);
        this.cadastroCidade.getjButtonSave().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroCidade.getBottompane());
        utilities.Utilities.ativa(true, this.cadastroCidade.getToppane());
        utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getMidpane());
    }
    
    WindowListener disposeListener = new WindowAdapter() {
        public void windowClosed(WindowEvent e) {
            if (codigo != 0) {
                Cidade cidade = DAO.ClasseDados.listaCidade.get(codigo - 1);
                utilities.Utilities.ativa(true, cadastroCidade.getBottompane());
                utilities.Utilities.ativa(true, cadastroCidade.getToppane());
                utilities.Utilities.limpaComponentes(false, cadastroCidade.getMidpane());

                cadastroCidade.getjTFId().setText(String.valueOf(cidade.getId()));
                cadastroCidade.getjTFDescricao().setText(cidade.getDescricao());
                cadastroCidade.getjComboBoxUF().setSelectedItem(cidade.getUf());
                cadastroCidade.getjTFId().setEnabled(false);
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCidade.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroCidade.getBottompane());
            utilities.Utilities.ativa(false, this.cadastroCidade.getToppane());
            utilities.Utilities.limpaComponentes(true, this.cadastroCidade.getMidpane());

        } else if (e.getSource() == this.cadastroCidade.getJButtonExit()) {
            this.cadastroCidade.dispose();
            
        } else if (e.getSource() == this.cadastroCidade.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroCidade.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroCidade.getToppane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getMidpane());

        } else if (e.getSource() == this.cadastroCidade.getjButtonSave()) {
            Cidade cidade = new Cidade();
            int index;

            cidade.setId(DAO.ClasseDados.listaCidade.size() + 1);
            cidade.setUf(this.cadastroCidade.getjComboBoxUF().getSelectedItem().toString());
            cidade.setDescricao(this.cadastroCidade.getjTFDescricao().getText());

            if (cadastroCidade.getjTFId().getText().isEmpty()) {
                DAO.ClasseDados.listaCidade.add(cidade);
            } else {
                index = Integer.parseInt(cadastroCidade.getjTFId().getText()) - 1;
                DAO.ClasseDados.listaCidade.get(index).setDescricao(this.cadastroCidade.getjTFDescricao().getText());
                DAO.ClasseDados.listaCidade.get(index).setId(Integer.parseInt(this.cadastroCidade.getjTFId().getText()));
            }

            utilities.Utilities.ativa(true, this.cadastroCidade.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroCidade.getToppane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getMidpane());

        } else if (e.getSource() == this.cadastroCidade.getjButtonBuscar()) {
            BuscaCidade buscaCidade = new BuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.addWindowListener(disposeListener);
            buscaCidade.setVisible(true);
        }
    }
}

