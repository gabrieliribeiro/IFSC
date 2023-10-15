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
import model.bo.Cidade;
import model.bo.Endereco;
import view.BuscaBairro;
import view.BuscaCidade;
import view.BuscaEndereco;
import view.CadastroBairro;
import view.CadastroCidade;
import view.CadastroEndereco;


public class ControllerCadastroEndereco implements ActionListener {

    CadastroEndereco cadastroEndereco;

    public static int codigoCidade, codigoBairro, codigo;
    public static int idCidade, idBairro;

    public ControllerCadastroEndereco(CadastroEndereco cadastroEndereco) {
        this.cadastroEndereco = cadastroEndereco;

        this.cadastroEndereco.getjButtonNew().addActionListener(this);
        this.cadastroEndereco.getjBExit4().addActionListener(this);
        this.cadastroEndereco.getjButtonCancel().addActionListener(this);
        this.cadastroEndereco.getjButtonSave().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscar().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscarBairro().addActionListener(this);
        this.cadastroEndereco.getjButtonBuscarCidade().addActionListener(this);
        this.cadastroEndereco.getjButtonAddBairro().addActionListener(this);
        this.cadastroEndereco.getjButtonAddCidade().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroEndereco.getBottompane());
        utilities.Utilities.ativa(true, this.cadastroEndereco.getToppane4());
        utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getMidpane());
    }

    WindowListener disposeListener = new WindowAdapter() {
        public void windowClosed(WindowEvent e) {
            if (codigo != 0) {
                Endereco endereco = DAO.ClasseDados.listaEndereco.get(codigo - 1);
                utilities.Utilities.ativa(true, cadastroEndereco.getBottompane());
                utilities.Utilities.ativa(true, cadastroEndereco.getToppane4());
                utilities.Utilities.limpaComponentes(false, cadastroEndereco.getMidpane());

                cadastroEndereco.getjTFID().setText(String.valueOf(endereco.getId()));
                cadastroEndereco.getjTFCEP().setText(endereco.getCep());
                cadastroEndereco.getjTFLogradouro().setText(endereco.getLogradouro());
                cadastroEndereco.getjTFBairro().setText(endereco.getBairro().getDescricao());
                cadastroEndereco.getjTFCidade().setText(endereco.getCidade().getDescricao());

                cadastroEndereco.getjTFID().setEnabled(false);
            }
        }
    };

    WindowListener disposeListenerBairro = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoBairro != 0) {
                Bairro bairro = DAO.ClasseDados.listaBairro.get(codigoBairro - 1);
                utilities.Utilities.ativa(false, cadastroEndereco.getBottompane());
                idBairro = bairro.getId() - 1;

                cadastroEndereco.getjTFBairro().setText(bairro.getDescricao());
            }
        }
    };

    WindowListener disposeListenerCidade = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoCidade != 0) {
                Cidade cidade = DAO.ClasseDados.listaCidade.get(codigoCidade - 1);
                utilities.Utilities.ativa(false, cadastroEndereco.getBottompane());
                idCidade = cidade.getId() - 1;

                cadastroEndereco.getjTFCidade().setText(cidade.getDescricao());
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroEndereco.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroEndereco.getBottompane());
             utilities.Utilities.ativa(false, this.cadastroEndereco.getToppane4());
            utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getMidpane());
            this.cadastroEndereco.getjTFID().setEnabled(false);

        } else if (e.getSource() == this.cadastroEndereco.getjBExit4()) {
            this.cadastroEndereco.dispose();

        } else if (e.getSource() == this.cadastroEndereco.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroEndereco.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroEndereco.getToppane4());
            utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getMidpane());

        } else if (e.getSource() == this.cadastroEndereco.getjButtonSave()) {
            Endereco endereco = new Endereco();

            endereco.setId(DAO.ClasseDados.listaEndereco.size() + 1);
            endereco.setLogradouro(this.cadastroEndereco.getjTFLogradouro().getText());
            endereco.setCep(this.cadastroEndereco.getjTFCEP().getText());
            endereco.setBairro(DAO.ClasseDados.listaBairro.get(idBairro));
            endereco.setCidade(DAO.ClasseDados.listaCidade.get(idCidade));

            DAO.ClasseDados.listaEndereco.add(endereco);

            utilities.Utilities.ativa(true, this.cadastroEndereco.getBottompane());
            utilities.Utilities.ativa(true, this.cadastroEndereco.getToppane4());
            utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getMidpane());

        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscar()) {
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.addWindowListener(disposeListener);
            buscaEndereco.setVisible(true);

        } else if (e.getSource() == this.cadastroEndereco.getjButtonAddBairro()) {
            CadastroBairro cadastroBairro = new CadastroBairro();
            ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(cadastroBairro);
            cadastroBairro.setVisible(true);

        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscarBairro()) {
            codigoBairro = 0;
            BuscaBairro buscaBairro = new BuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            buscaBairro.addWindowListener(disposeListenerBairro);
            buscaBairro.setVisible(true);

        } else if (e.getSource() == this.cadastroEndereco.getjButtonAddCidade()) {
            CadastroCidade cadastroCidade = new CadastroCidade();
            ControllerCadastroCidade controllerCadastroCidade = new ControllerCadastroCidade(cadastroCidade);
            cadastroCidade.setVisible(true);

        } else if (e.getSource() == this.cadastroEndereco.getjButtonBuscarCidade()) {
            codigoCidade = 0;
            BuscaCidade buscaCidade = new BuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.addWindowListener(disposeListenerCidade);
            buscaCidade.setVisible(true);
        }
    }
}

