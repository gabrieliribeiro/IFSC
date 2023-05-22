
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaCliente;
import view.BuscaEndereco;
import view.CadastroCliente;
import view.CadastroEndereco;


public class ControllerCadastroCliente implements ActionListener{
    
    CadastroCliente cadastroCliente;
    
    public  ControllerCadastroCliente(CadastroCliente cadastroCliente){
        this.cadastroCliente = cadastroCliente;
        
        this.cadastroCliente.getjButtonNew().addActionListener(this);
        this.cadastroCliente.getjBExit().addActionListener(this);
        this.cadastroCliente.getjButtonCancel().addActionListener(this);
        this.cadastroCliente.getjButtonSave().addActionListener(this);
        this.cadastroCliente.getjButtonBuscar().addActionListener(this);
        this.cadastroCliente.getjButtonBuscarcep().addActionListener(this);
        this.cadastroCliente.getjButtonAddCEP().addActionListener(this);
        
        
        utilities.Utilities.ativa(true, this.cadastroCliente.getBottompane());
        utilities.Utilities.ativa(true, cadastroCliente.getToppane());
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCliente.getjButtonNew()) {
            utilities.Utilities.ativa(false, this.cadastroCliente.getBottompane());
            utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getMidpane());

        } else if (e.getSource() == this.cadastroCliente.getjBExit()) {
            this.cadastroCliente.dispose();

        } else if (e.getSource() == this.cadastroCliente.getjButtonCancel()) {
            utilities.Utilities.ativa(true, this.cadastroCliente.getBottompane());
            utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getMidpane());

        } else if (e.getSource() == this.cadastroCliente.getjButtonSave()) {
            utilities.Utilities.ativa(true, cadastroCliente.getBottompane());
            utilities.Utilities.limpaComponentes(false, cadastroCliente.getMidpane());

         } else if (e.getSource() == this.cadastroCliente.getjButtonBuscar()) {
            BuscaCliente buscaCliente = new BuscaCliente();
            ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
            
            buscaCliente.setVisible(true);

        } else if (e.getSource() == this.cadastroCliente.getjButtonBuscarcep()) {
      
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            
        } else if (e.getSource() == this.cadastroCliente.getjButtonAddCEP()) {
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            cadastroEndereco.setVisible(true);
            
        }
    }     
}
    
