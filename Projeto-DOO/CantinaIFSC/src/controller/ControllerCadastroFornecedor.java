/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaEndereco;
import view.BuscaFornecedor;
import view.CadastroEndereco;
import view.CadastroFornecedor;


public class ControllerCadastroFornecedor implements ActionListener {
    
    CadastroFornecedor cadastroFornecedor;

    public ControllerCadastroFornecedor(CadastroFornecedor cadastroFornecedor) {
        this.cadastroFornecedor = cadastroFornecedor;
        
        this.cadastroFornecedor.getjButtonNew().addActionListener(this);
        this.cadastroFornecedor.getjBExit().addActionListener(this);
        this.cadastroFornecedor.getjButtonCancel().addActionListener(this);
        this.cadastroFornecedor.getjButtonSave().addActionListener(this);
        this.cadastroFornecedor.getjButtonBuscar().addActionListener(this);
        this.cadastroFornecedor.getjButtonBuscarcep().addActionListener(this);
        this.cadastroFornecedor.getjButtonAddCEP().addActionListener(this);
        
        
        utilities.Utilities.ativa(true, this.cadastroFornecedor.getBottompane());
        utilities.Utilities.ativa(true, cadastroFornecedor.getToppane());
        utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getMidpane());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroFornecedor.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroFornecedor.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getMidpane());

        } else if (e.getSource() == this.cadastroFornecedor.getjBExit()) {
            this.cadastroFornecedor.dispose();

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroFornecedor.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getMidpane());

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroFornecedor.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroFornecedor.getMidpane());

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonBuscar()) {
            BuscaFornecedor buscaFornecedor= new BuscaFornecedor();
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);

        } else if (e.getSource() == this.cadastroFornecedor.getjButtonBuscarcep()){
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            
        } else if(e.getSource() == this.cadastroFornecedor.getjButtonAddCEP()){
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
           ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
        }
    }
    
    
    
}
