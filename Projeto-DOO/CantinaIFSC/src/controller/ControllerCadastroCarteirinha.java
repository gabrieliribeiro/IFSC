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
import model.bo.Carteirinha;
import model.bo.Cliente;
import utilities.Utilities;
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
    public static int codigo, codigoCliente, idCliente;

    public ControllerCadastroCarteirinha(CadastroCarteirinha cadastroCarteirinha) {
        this.cadastroCarteirinha = cadastroCarteirinha;

        this.cadastroCarteirinha.getjButtonNew().addActionListener(this);
        this.cadastroCarteirinha.getjButtonSave().addActionListener(this);
        this.cadastroCarteirinha.getjButtonCancel().addActionListener(this);
        this.cadastroCarteirinha.getjButtonBuscar().addActionListener(this);
        this.cadastroCarteirinha.getJButtonExit().addActionListener(this);
        this.cadastroCarteirinha.getjButtonBuscarCPF().addActionListener(this);
        this.cadastroCarteirinha.getjButtonAddCPF().addActionListener(this);

        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getBottompane());
        utilities.Utilities.ativa(true, this.cadastroCarteirinha.getToppane());
        utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getMidpane());
    }

    private WindowListener disposeListener = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigo != 0) {
                Carteirinha carteirinha = DAO.ClasseDados.listaCarteirinhas.get(codigo - 1);
                Utilities.ativa(false, cadastroCarteirinha.getBottompane());
                Utilities.ativa(false, cadastroCarteirinha.getToppane());
                Utilities.limpaComponentes(true, cadastroCarteirinha.getMidpane());

                cadastroCarteirinha.getjTFID().setText(String.valueOf(carteirinha.getId()));
                cadastroCarteirinha.getjTFCodBarra().setText(carteirinha.getCodigoBarra());
                cadastroCarteirinha.getjFTFDataGeracao().setText(carteirinha.getDataGeracao());
                cadastroCarteirinha.getjFTFDataCancelamento().setText(carteirinha.getDataCancelamento());
                cadastroCarteirinha.getjTFNomeCliente().setText(carteirinha.getCliente().getNome());
                cadastroCarteirinha.getjFTFCPF().setText(carteirinha.getCliente().getCpf());

                cadastroCarteirinha.getjTFID().setEnabled(false);
                cadastroCarteirinha.getjFTFCPF().setEnabled(false);
                cadastroCarteirinha.getjTFNomeCliente().setEnabled(false);
            }
        }
    };

    private WindowListener disposeListenerCliente = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoCliente != 0) {
                Cliente cliente = DAO.ClasseDados.listaCliente.get(codigoCliente - 1);
                idCliente = cliente.getId() - 1;

                cadastroCarteirinha.getjFTFCPF().setText(cliente.getCpf());
                cadastroCarteirinha.getjTFNomeCliente().setText(cliente.getNome());

                cadastroCarteirinha.getjFTFCPF().setEnabled(false);
                cadastroCarteirinha.getjTFNomeCliente().setEnabled(false);
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cadastroCarteirinha.getjButtonNew()) {
            Utilities.ativa(false, cadastroCarteirinha.getBottompane());
            Utilities.ativa(false, cadastroCarteirinha.getToppane());
            Utilities.limpaComponentes(true, cadastroCarteirinha.getMidpane());

            cadastroCarteirinha.getjTFID().setEnabled(false);
            cadastroCarteirinha.getjFTFCPF().setEnabled(false);

        } else if (e.getSource() == cadastroCarteirinha.getJButtonExit()) {
            cadastroCarteirinha.dispose();

        } else if (e.getSource() == cadastroCarteirinha.getjButtonCancel()) {
            Utilities.ativa(true, cadastroCarteirinha.getBottompane());
            Utilities.ativa(true, cadastroCarteirinha.getToppane());
            Utilities.limpaComponentes(false, cadastroCarteirinha.getMidpane());

        } else if (e.getSource() == cadastroCarteirinha.getjButtonSave()) {
            Carteirinha carteirinha = new Carteirinha();
            int index;

            carteirinha.setId(DAO.ClasseDados.listaCarteirinhas.size() + 1);
            carteirinha.setDataGeracao(cadastroCarteirinha.getjFTFDataGeracao().getText());
            carteirinha.setDataCancelamento(cadastroCarteirinha.getjFTFDataCancelamento().getText());
            carteirinha.setCodigoBarra(cadastroCarteirinha.getjTFCodBarra().getText());
            carteirinha.setCliente(DAO.ClasseDados.listaCliente.get(idCliente));

            if (cadastroCarteirinha.getjTFID().getText().isEmpty()) {
                DAO.ClasseDados.listaCarteirinhas.add(carteirinha);
            } else {
                index = Integer.parseInt(cadastroCarteirinha.getjTFID().getText()) - 1;
                DAO.ClasseDados.listaCarteirinhas.get(index).setCliente(DAO.ClasseDados.listaCliente.get(idCliente));

                DAO.ClasseDados.listaCarteirinhas.get(index).setCodigoBarra(cadastroCarteirinha.getjTFCodBarra().getText());
                DAO.ClasseDados.listaCarteirinhas.get(index).setDataCancelamento(cadastroCarteirinha.getjFTFDataCancelamento().getText());
                DAO.ClasseDados.listaCarteirinhas.get(index).setDataGeracao(cadastroCarteirinha.getjFTFDataGeracao().getText());
            }

            Utilities.ativa(true, cadastroCarteirinha.getBottompane());
            Utilities.ativa(true, cadastroCarteirinha.getToppane());
            Utilities.limpaComponentes(false, cadastroCarteirinha.getMidpane());

        } else if (e.getSource() == cadastroCarteirinha.getjButtonBuscar()) {
            codigo = 0;
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha();
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            buscaCarteirinha.addWindowListener(disposeListener);
            buscaCarteirinha.setVisible(true);

        } else if (e.getSource() == cadastroCarteirinha.getjButtonAddCPF()) {
            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);
            cadastroCliente.setVisible(true);

        } else if (e.getSource() == cadastroCarteirinha.getjButtonBuscarCPF()) {
            codigoCliente = 0;
            BuscaCliente buscaCliente = new BuscaCliente();
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.addWindowListener(disposeListenerCliente);
            buscaCliente.setVisible(true);
        }
    }
}

