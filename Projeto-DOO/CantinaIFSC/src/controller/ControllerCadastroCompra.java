/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCompra;
import view.BuscaFornecedor;
import view.CadastroCompra;
import view.CadastroFornecedor;

/**
 *
 * @author Thiago
 */
public class ControllerCadastroCompra implements ActionListener {
    
    CadastroCompra cadastroCompra;
    
    public ControllerCadastroCompra(CadastroCompra cadastroCompra) {
        this.cadastroCompra = cadastroCompra;
        
        this.cadastroCompra.getjButtonNew().addActionListener(this);
        this.cadastroCompra.getjBExit4().addActionListener(this);
        this.cadastroCompra.getjButtonCancel().addActionListener(this);
        this.cadastroCompra.getjButtonSave().addActionListener(this);
         this.cadastroCompra.getjButtonBuscar().addActionListener(this);
        this.cadastroCompra.getjButtonBuscarCnpj().addActionListener(this);
        this.cadastroCompra.getjButtonAddCnpj().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.cadastroCompra.getBottompane());
        utilities.Utilities.limpaComponentes(true, this.cadastroCompra.getMidpane());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCompra.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroCompra.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroCompra.getMidpane());
            
        } else if (e.getSource() == this.cadastroCompra.getjBExit4()) {
            this.cadastroCompra.dispose();
            
        } else if (e.getSource() == this.cadastroCompra.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroCompra.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCompra.getMidpane());
            
        } else if (e.getSource() == this.cadastroCompra.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroCompra.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroCompra.getMidpane());
            
        } else if (e.getSource() == this.cadastroCompra.getjButtonBuscar()) {
            BuscaCompra buscaCompra = new BuscaCompra(null, true);
            ControllerBuscaCompra controllerBuscaCompra = new ControllerBuscaCompra(buscaCompra);
            buscaCompra.setVisible(true);
            
        } else if (e.getSource() == this.cadastroCompra.getjButtonAddCnpj()) {
            CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
            ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(cadastroFornecedor);
            cadastroFornecedor.setVisible(true);
        } else if (e.getSource() == this.cadastroCompra.getjButtonBuscarCnpj()) {
            BuscaFornecedor buscaFornecedor = new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);
        }
    }
    
}
