
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.bo.Cliente;
import model.bo.Endereco;
import utilities.Utilities;
import view.BuscaCliente;
import view.BuscaEndereco;
import view.CadastroCliente;
import view.CadastroEndereco;

public class ControllerCadastroCliente implements ActionListener {

    CadastroCliente cadastroCliente;
    public static int codigo, codigoEndereco, idEndereco;

    public ControllerCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;

        this.cadastroCliente.getjButtonNew().addActionListener(this);
        this.cadastroCliente.getjBExit().addActionListener(this);
        this.cadastroCliente.getjButtonCancel().addActionListener(this);
        this.cadastroCliente.getjButtonSave().addActionListener(this);
        this.cadastroCliente.getjButtonBuscar().addActionListener(this);
        this.cadastroCliente.getjButtonBuscarcep().addActionListener(this);
        this.cadastroCliente.getjButtonAddCEP().addActionListener(this);

        Utilities.ativa(true, this.cadastroCliente.getBottompane());
        Utilities.ativa(true, cadastroCliente.getToppane());
        Utilities.limpaComponentes(false, this.cadastroCliente.getMidpane());
    }

    WindowListener disposeListener = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigo != 0) {
                Cliente cliente = DAO.ClasseDados.listaCliente.get(codigo - 1);
                Utilities.ativa(false, cadastroCliente.getBottompane());
                Utilities.limpaComponentes(true, cadastroCliente.getMidpane());

                cadastroCliente.getjTextFieldId().setText(cliente.getId() + "");
                cadastroCliente.getjTextFieldNome().setText(cliente.getNome());
                cadastroCliente.getjFTFDataNascimento().setText(cliente.getDataNascimento());
                cadastroCliente.getjFTFCPF().setText(cliente.getCpf());
                cadastroCliente.getjTextFieldRG().setText(cliente.getRg());
                cadastroCliente.getjTextFieldMatricula().setText(cliente.getMatricula());
                cadastroCliente.getjFTFFone1().setText(cliente.getFone1());
                cadastroCliente.getjFTFFone2().setText(cliente.getFone2());
                cadastroCliente.getjTextFieldEmail().setText(cliente.getEmail());
                cadastroCliente.getjTextFieldComplemento().setText(cliente.getComplementoEndereco());

                cadastroCliente.getjTextFieldCEP().setText(cliente.getEndereco().getCep());
                cadastroCliente.getjTextFieldRua().setText(cliente.getEndereco().getLogradouro());
                cadastroCliente.getjTextFieldCidade().setText(cliente.getEndereco().getCidade().getDescricao());
                cadastroCliente.getjTextFieldEstado().setText(cliente.getEndereco().getCidade().getUf());
                cadastroCliente.getjTextFieldBairro().setText(cliente.getEndereco().getBairro().getDescricao());

                cadastroCliente.getjTextFieldId().setEnabled(false);
                cadastroCliente.getjTextFieldRua().setEnabled(false);
                cadastroCliente.getjTextFieldEstado().setEnabled(false);
                cadastroCliente.getjTextFieldCidade().setEnabled(false);
                cadastroCliente.getjTextFieldBairro().setEnabled(false);

                // Set the selected row index to 0 for the next selection
                codigo = 0;
            }
        }
    };


    WindowListener disposeListenerEndereco = new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
            if (codigoEndereco != 0) {
                Endereco endereco = DAO.ClasseDados.listaEndereco.get(codigoEndereco - 1);
                idEndereco = endereco.getId() - 1;
                Utilities.ativa(false, cadastroCliente.getToppane());

                cadastroCliente.getjTextFieldCEP().setText(endereco.getCep());
                cadastroCliente.getjTextFieldRua().setText(endereco.getLogradouro());
                cadastroCliente.getjTextFieldCidade().setText(endereco.getCidade().getDescricao());
                cadastroCliente.getjTextFieldEstado().setText(endereco.getCidade().getUf());
                cadastroCliente.getjTextFieldBairro().setText(endereco.getBairro().getDescricao());

                cadastroCliente.getjTextFieldRua().setEnabled(false);
                cadastroCliente.getjTextFieldEstado().setEnabled(false);
                cadastroCliente.getjTextFieldCidade().setEnabled(false);
                cadastroCliente.getjTextFieldBairro().setEnabled(false);
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCliente.getjButtonNew()) {
            Utilities.ativa(false, this.cadastroCliente.getBottompane());
            Utilities.limpaComponentes(true, this.cadastroCliente.getMidpane());

            cadastroCliente.getjTextFieldId().setEnabled(false);
            cadastroCliente.getjTextFieldRua().setEnabled(false);
            cadastroCliente.getjTextFieldEstado().setEnabled(false);
            cadastroCliente.getjTextFieldCidade().setEnabled(false);
            cadastroCliente.getjTextFieldBairro().setEnabled(false);
        } else if (e.getSource() == this.cadastroCliente.getjBExit()) {
            this.cadastroCliente.dispose();
        } else if (e.getSource() == this.cadastroCliente.getjButtonCancel()) {
            Utilities.ativa(true, this.cadastroCliente.getBottompane());
            Utilities.limpaComponentes(false, this.cadastroCliente.getMidpane());
        } else if (e.getSource() == this.cadastroCliente.getjButtonSave()) {
            Utilities.ativa(true, cadastroCliente.getBottompane());
            Utilities.limpaComponentes(false, cadastroCliente.getMidpane());

            Cliente cliente = new Cliente();
            cliente.setId(DAO.ClasseDados.listaCliente.size() + 1);
            cliente.setNome(this.cadastroCliente.getjTextFieldNome().getText());
            cliente.setCpf(this.cadastroCliente.getjFTFCPF().getText());
            cliente.setRg(this.cadastroCliente.getjTextFieldRG().getText());
            cliente.setMatricula(this.cadastroCliente.getjTextFieldMatricula().getText());
            cliente.setFone1(this.cadastroCliente.getjFTFFone1().getText());
            cliente.setFone2(this.cadastroCliente.getjFTFFone2().getText());
            cliente.setEmail(this.cadastroCliente.getjTextFieldEmail().getText());
            cliente.setComplementoEndereco(this.cadastroCliente.getjTextFieldComplemento().getText());
            cliente.setEndereco(DAO.ClasseDados.listaEndereco.get(idEndereco));

            if (this.cadastroCliente.getjTextFieldId().getText().equalsIgnoreCase("")) {
                DAO.ClasseDados.listaCliente.add(cliente);
            } else {
                int index = Integer.parseInt(this.cadastroCliente.getjTextFieldId().getText()) - 1;
                DAO.ClasseDados.listaCliente.get(index).setNome(this.cadastroCliente.getjTextFieldNome().getText());
                DAO.ClasseDados.listaCliente.get(index).setCpf(this.cadastroCliente.getjFTFCPF().getText());
                DAO.ClasseDados.listaCliente.get(index).setRg(this.cadastroCliente.getjTextFieldRG().getText());
                DAO.ClasseDados.listaCliente.get(index).setMatricula(this.cadastroCliente.getjTextFieldMatricula().getText());
                DAO.ClasseDados.listaCliente.get(index).setFone1(this.cadastroCliente.getjFTFFone1().getText());
                DAO.ClasseDados.listaCliente.get(index).setFone2(this.cadastroCliente.getjFTFFone2().getText());
                DAO.ClasseDados.listaCliente.get(index).setEmail(this.cadastroCliente.getjTextFieldEmail().getText());
                DAO.ClasseDados.listaCliente.get(index).setComplementoEndereco(this.cadastroCliente.getjTextFieldComplemento().getText());
                DAO.ClasseDados.listaCliente.get(index).setEndereco(DAO.ClasseDados.listaEndereco.get(idEndereco));
            }
        } else if (e.getSource() == this.cadastroCliente.getjButtonBuscar()) {
            BuscaCliente buscaCliente = new BuscaCliente();
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            buscaCliente.addWindowListener(disposeListener);
            buscaCliente.setVisible(true);
        } else if (e.getSource() == this.cadastroCliente.getjButtonBuscarcep()) {
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.addWindowListener(disposeListenerEndereco);
            buscaEndereco.setVisible(true);
        } else if (e.getSource() == this.cadastroCliente.getjButtonAddCEP()) {
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
        }
    }     
}

