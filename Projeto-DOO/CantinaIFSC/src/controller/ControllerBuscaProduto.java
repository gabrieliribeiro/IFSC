/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaProduto;

/**
 *
 * @author gabri
 */
public class ControllerBuscaProduto implements ActionListener {

    BuscaProduto buscaProduto;

    public ControllerBuscaProduto(BuscaProduto buscaProduto) {
        this.buscaProduto = buscaProduto;

        this.buscaProduto.getjButtonFiltrar().addActionListener(this);
        this.buscaProduto.getjButtonCarregar().addActionListener(this);
        this.buscaProduto.getJButtonExit().addActionListener(this);

        utilities.Utilities.ativa(true, this.buscaProduto.getBottompane());
        utilities.Utilities.ativa(true, this.buscaProduto.getToppane());
        utilities.Utilities.ativa(true, this.buscaProduto.getMidpane());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaProduto.getjButtonFiltrar()) {

        } else if (e.getSource() == this.buscaProduto.getjButtonCarregar()) {

        } else if (e.getSource() == this.buscaProduto.getJButtonExit()) {
            this.buscaProduto.dispose();

        }
    }
}
