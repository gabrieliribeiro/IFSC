/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaProduto;
import view.CadastroProduto;


/**
 *
 * @author Thiago
 */
public class ControllerCadastroProduto implements ActionListener{
    
    CadastroProduto cadastroProduto;
    
    public ControllerCadastroProduto(CadastroProduto cadastroProduto) {
        this.cadastroProduto = cadastroProduto;
        
        this.cadastroProduto.getjButtonNew().addActionListener(this);
        this.cadastroProduto.getJButtonExit().addActionListener(this);
        this.cadastroProduto.getjButtonCancel().addActionListener(this);
        this.cadastroProduto.getjButtonSave().addActionListener(this);
        this.cadastroProduto.getjButtonBuscar().addActionListener(this);
        
        utilities.Utilities.ativa(true, this.cadastroProduto.getBottompane());
        utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getMidpane());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroProduto.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroProduto.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getMidpane());

        } else if (e.getSource() == this.cadastroProduto.getJButtonExit()) {
            this.cadastroProduto.dispose();

        } else if (e.getSource() == this.cadastroProduto.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroProduto.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getMidpane());

        } else if (e.getSource() == this.cadastroProduto.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroProduto.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroProduto.getMidpane());

        } else if (e.getSource() == this.cadastroProduto.getjButtonBuscar()) {
            BuscaProduto buscaProduto = new BuscaProduto(null, true);
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(buscaProduto);
            //Inserir o controller da busca de bairros
            buscaProduto.setVisible(true);

        }
    }
    
    
}
