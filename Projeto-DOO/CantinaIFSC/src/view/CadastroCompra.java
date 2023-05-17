/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class CadastroCompra extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroEnderecos
     */
    public CadastroCompra() {
        initComponents();
    }

    public JPanel getBottompane() {
        return bottompane;
    }

    public JButton getjBExit4() {
        return jBExit4;
    }

    public JButton getjButtonAddCnpj() {
        return jButtonAddCnpj;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public JButton getjButtonBuscarCnpj() {
        return jButtonBuscarCnpj;
    }

    public JButton getjButtonCancel() {
        return jButtonCancel;
    }

    public JButton getjButtonNew() {
        return jButtonNew;
    }

    public JButton getjButtonSave() {
        return jButtonSave;
    }

    public JPanel getMidpane() {
        return midpane;
    }

    public JPanel getToppane4() {
        return toppane4;
    }

    public JComboBox<String> getjCBStatus() {
        return jCBStatus;
    }

    public void setjCBStatus(JComboBox<String> jCBStatus) {
        this.jCBStatus = jCBStatus;
    }

    public JComboBox<String> getjCBTipoDesconto() {
        return jCBTipoDesconto;
    }

    public void setjCBTipoDesconto(JComboBox<String> jCBTipoDesconto) {
        this.jCBTipoDesconto = jCBTipoDesconto;
    }

    public JFormattedTextField getjFTFCnpj() {
        return jFTFCnpj;
    }

    public void setjFTFCnpj(JFormattedTextField jFTFCnpj) {
        this.jFTFCnpj = jFTFCnpj;
    }

    public JFormattedTextField getjFTFDataEmissao() {
        return jFTFDataEmissao;
    }

    public void setjFTFDataEmissao(JFormattedTextField jFTFDataEmissao) {
        this.jFTFDataEmissao = jFTFDataEmissao;
    }

    public JTextField getjTFFornecedor() {
        return jTFFornecedor;
    }

    public void setjTFFornecedor(JTextField jTFFornecedor) {
        this.jTFFornecedor = jTFFornecedor;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public void setjTFID(JTextField jTFID) {
        this.jTFID = jTFID;
    }

    public JTextField getjTFNF() {
        return jTFNF;
    }

    public void setjTFNF(JTextField jTFNF) {
        this.jTFNF = jTFNF;
    }

    public JTextField getjTFObservacao() {
        return jTFObservacao;
    }

    public void setjTFObservacao(JTextField jTFObservacao) {
        this.jTFObservacao = jTFObservacao;
    }

    public JTextField getjTFValorDesconto() {
        return jTFValorDesconto;
    }

    public void setjTFValorDesconto(JTextField jTFValorDesconto) {
        this.jTFValorDesconto = jTFValorDesconto;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBG = new javax.swing.JPanel();
        toppane4 = new javax.swing.JPanel();
        jLTitulo4 = new javax.swing.JLabel();
        jBExit4 = new javax.swing.JButton();
        midpane = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLNF = new javax.swing.JLabel();
        jTFNF = new javax.swing.JTextField();
        jLDataEmissao = new javax.swing.JLabel();
        jFTFDataEmissao = new javax.swing.JFormattedTextField();
        jLCnpj = new javax.swing.JLabel();
        jFTFCnpj = new javax.swing.JFormattedTextField();
        jButtonBuscarCnpj = new javax.swing.JButton();
        jButtonAddCnpj = new javax.swing.JButton();
        jLFornecedor = new javax.swing.JLabel();
        jTFFornecedor = new javax.swing.JTextField();
        jLValorDesconto = new javax.swing.JLabel();
        jTFValorDesconto = new javax.swing.JTextField();
        jCBTipoDesconto = new javax.swing.JComboBox<>();
        jLTipoDesconto = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jCBStatus = new javax.swing.JComboBox<>();
        jTFObservacao = new javax.swing.JTextField();
        jLObservacao = new javax.swing.JLabel();
        bottompane = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 832));

        jBG.setBackground(new java.awt.Color(255, 255, 255));
        jBG.setMaximumSize(new java.awt.Dimension(1030, 740));
        jBG.setMinimumSize(new java.awt.Dimension(1030, 740));
        jBG.setPreferredSize(new java.awt.Dimension(1030, 740));

        toppane4.setBackground(new java.awt.Color(109, 217, 108));
        toppane4.setMaximumSize(new java.awt.Dimension(1030, 99));
        toppane4.setMinimumSize(new java.awt.Dimension(1030, 99));
        toppane4.setName(""); // NOI18N
        toppane4.setPreferredSize(new java.awt.Dimension(1030, 99));

        jLTitulo4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLTitulo4.setForeground(new java.awt.Color(242, 241, 243));
        jLTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo4.setText("Cadastro Compra");
        jLTitulo4.setToolTipText("");
        jLTitulo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jBExit4.setBackground(new java.awt.Color(109, 217, 108));
        jBExit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-voltar-48.png"))); // NOI18N
        jBExit4.setBorderPainted(false);
        jBExit4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toppane4Layout = new javax.swing.GroupLayout(toppane4);
        toppane4.setLayout(toppane4Layout);
        toppane4Layout.setHorizontalGroup(
            toppane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppane4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jBExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(jLTitulo4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppane4Layout.setVerticalGroup(
            toppane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppane4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(toppane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLTitulo4)
                    .addComponent(jBExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        midpane.setBackground(new java.awt.Color(255, 255, 255));
        midpane.setMaximumSize(new java.awt.Dimension(1030, 488));
        midpane.setMinimumSize(new java.awt.Dimension(1030, 488));
        midpane.setPreferredSize(new java.awt.Dimension(1030, 488));

        jLId.setBackground(new java.awt.Color(30, 30, 30));
        jLId.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLId.setForeground(java.awt.Color.gray);
        jLId.setText("ID");

        jTFID.setBackground(new java.awt.Color(229, 229, 229));
        jTFID.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFID.setForeground(java.awt.Color.gray);
        jTFID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jButtonBuscar.setBackground(new java.awt.Color(229, 229, 229));
        jButtonBuscar.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jButtonBuscar.setForeground(java.awt.Color.gray);
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-pesquisar-24.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("1");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setHideActionText(true);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBuscar.setIconTextGap(30);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLNF.setBackground(new java.awt.Color(30, 30, 30));
        jLNF.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLNF.setForeground(java.awt.Color.gray);
        jLNF.setText("NF");

        jTFNF.setBackground(new java.awt.Color(229, 229, 229));
        jTFNF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFNF.setForeground(java.awt.Color.gray);
        jTFNF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLDataEmissao.setBackground(new java.awt.Color(30, 30, 30));
        jLDataEmissao.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLDataEmissao.setForeground(java.awt.Color.gray);
        jLDataEmissao.setText("Data Emissão");

        jFTFDataEmissao.setBackground(new java.awt.Color(229, 229, 229));
        jFTFDataEmissao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jFTFDataEmissao.setForeground(java.awt.Color.gray);
        try {
            jFTFDataEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFDataEmissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFDataEmissao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFDataEmissao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jLCnpj.setBackground(new java.awt.Color(30, 30, 30));
        jLCnpj.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLCnpj.setForeground(java.awt.Color.gray);
        jLCnpj.setText("CNJP");

        jFTFCnpj.setBackground(new java.awt.Color(229, 229, 229));
        jFTFCnpj.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jFTFCnpj.setForeground(java.awt.Color.gray);
        try {
            jFTFCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFCnpj.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFCnpj.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jButtonBuscarCnpj.setBackground(new java.awt.Color(229, 229, 229));
        jButtonBuscarCnpj.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jButtonBuscarCnpj.setForeground(java.awt.Color.gray);
        jButtonBuscarCnpj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-pesquisar-24.png"))); // NOI18N
        jButtonBuscarCnpj.setActionCommand("1");
        jButtonBuscarCnpj.setBorderPainted(false);
        jButtonBuscarCnpj.setHideActionText(true);
        jButtonBuscarCnpj.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBuscarCnpj.setIconTextGap(30);
        jButtonBuscarCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCnpjActionPerformed(evt);
            }
        });

        jButtonAddCnpj.setBackground(new java.awt.Color(229, 229, 229));
        jButtonAddCnpj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-soma-30.png"))); // NOI18N
        jButtonAddCnpj.setActionCommand("1");
        jButtonAddCnpj.setBorderPainted(false);
        jButtonAddCnpj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAddCnpj.setIconTextGap(0);
        jButtonAddCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCnpjActionPerformed(evt);
            }
        });

        jLFornecedor.setBackground(new java.awt.Color(30, 30, 30));
        jLFornecedor.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLFornecedor.setForeground(java.awt.Color.gray);
        jLFornecedor.setText("Fornecedor");

        jTFFornecedor.setBackground(new java.awt.Color(229, 229, 229));
        jTFFornecedor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFFornecedor.setForeground(java.awt.Color.gray);
        jTFFornecedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLValorDesconto.setBackground(new java.awt.Color(30, 30, 30));
        jLValorDesconto.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLValorDesconto.setForeground(java.awt.Color.gray);
        jLValorDesconto.setText("Valor de Desconto");

        jTFValorDesconto.setBackground(new java.awt.Color(229, 229, 229));
        jTFValorDesconto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFValorDesconto.setForeground(java.awt.Color.gray);
        jTFValorDesconto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jCBTipoDesconto.setBackground(new java.awt.Color(229, 229, 229));
        jCBTipoDesconto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jCBTipoDesconto.setForeground(java.awt.Color.gray);
        jCBTipoDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBTipoDesconto.setSelectedIndex(-1);
        jCBTipoDesconto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLTipoDesconto.setBackground(new java.awt.Color(30, 30, 30));
        jLTipoDesconto.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLTipoDesconto.setForeground(java.awt.Color.gray);
        jLTipoDesconto.setText("Tipo de Desconto");

        jLStatus.setBackground(new java.awt.Color(30, 30, 30));
        jLStatus.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLStatus.setForeground(java.awt.Color.gray);
        jLStatus.setText("Status");

        jCBStatus.setBackground(new java.awt.Color(229, 229, 229));
        jCBStatus.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jCBStatus.setForeground(java.awt.Color.gray);
        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBStatus.setSelectedIndex(-1);
        jCBStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jTFObservacao.setBackground(new java.awt.Color(229, 229, 229));
        jTFObservacao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFObservacao.setForeground(java.awt.Color.gray);
        jTFObservacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLObservacao.setBackground(new java.awt.Color(30, 30, 30));
        jLObservacao.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLObservacao.setForeground(java.awt.Color.gray);
        jLObservacao.setText("Observação");

        javax.swing.GroupLayout midpaneLayout = new javax.swing.GroupLayout(midpane);
        midpane.setLayout(midpaneLayout);
        midpaneLayout.setHorizontalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpaneLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midpaneLayout.createSequentialGroup()
                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midpaneLayout.createSequentialGroup()
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNF)
                            .addComponent(jTFNF, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDataEmissao)
                            .addComponent(jFTFDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midpaneLayout.createSequentialGroup()
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCnpj)
                            .addGroup(midpaneLayout.createSequentialGroup()
                                .addComponent(jFTFCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscarCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFornecedor)
                            .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, midpaneLayout.createSequentialGroup()
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLValorDesconto))
                        .addGap(90, 90, 90)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTipoDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLStatus)))
                    .addComponent(jLObservacao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFObservacao, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        midpaneLayout.setVerticalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpaneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLId)
                        .addGap(18, 18, 18)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(midpaneLayout.createSequentialGroup()
                                .addComponent(jLNF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(midpaneLayout.createSequentialGroup()
                                .addComponent(jLDataEmissao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(midpaneLayout.createSequentialGroup()
                                .addComponent(jLCnpj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonBuscarCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorDesconto)
                            .addComponent(jLTipoDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipoDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLObservacao))
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        bottompane.setBackground(new java.awt.Color(255, 255, 255));
        bottompane.setMaximumSize(new java.awt.Dimension(1030, 129));
        bottompane.setMinimumSize(new java.awt.Dimension(1030, 129));

        jButtonNew.setBackground(new java.awt.Color(51, 204, 255));
        jButtonNew.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-adicionar-usuário-masculino-30.png"))); // NOI18N
        jButtonNew.setText("Novo");
        jButtonNew.setActionCommand("0");
        jButtonNew.setBorderPainted(false);
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonNew.setIconTextGap(40);
        jButtonNew.setPreferredSize(new java.awt.Dimension(200, 90));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(109, 217, 108));
        jButtonSave.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-verificar-arquivo-24.png"))); // NOI18N
        jButtonSave.setText("Salvar");
        jButtonSave.setActionCommand("1");
        jButtonSave.setBorderPainted(false);
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonSave.setIconTextGap(40);
        jButtonSave.setPreferredSize(new java.awt.Dimension(200, 90));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(242, 159, 5));
        jButtonCancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-cancelar-30.png"))); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setActionCommand("1");
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonCancel.setIconTextGap(20);
        jButtonCancel.setPreferredSize(new java.awt.Dimension(200, 90));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottompaneLayout = new javax.swing.GroupLayout(bottompane);
        bottompane.setLayout(bottompaneLayout);
        bottompaneLayout.setHorizontalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompaneLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottompaneLayout.setVerticalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBGLayout = new javax.swing.GroupLayout(jBG);
        jBG.setLayout(jBGLayout);
        jBGLayout.setHorizontalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottompane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(midpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBGLayout.setVerticalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGLayout.createSequentialGroup()
                .addComponent(toppane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBExitActionPerformed

    private void jButtonBuscarCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarCnpjActionPerformed

    private void jButtonAddCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddCnpjActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottompane;
    private javax.swing.JButton jBExit4;
    private javax.swing.JPanel jBG;
    private javax.swing.JButton jButtonAddCnpj;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarCnpj;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jCBStatus;
    private javax.swing.JComboBox<String> jCBTipoDesconto;
    private javax.swing.JFormattedTextField jFTFCnpj;
    private javax.swing.JFormattedTextField jFTFDataEmissao;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLDataEmissao;
    private javax.swing.JLabel jLFornecedor;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNF;
    private javax.swing.JLabel jLObservacao;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLTipoDesconto;
    private javax.swing.JLabel jLTitulo4;
    private javax.swing.JLabel jLValorDesconto;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNF;
    private javax.swing.JTextField jTFObservacao;
    private javax.swing.JTextField jTFValorDesconto;
    private javax.swing.JPanel midpane;
    private javax.swing.JPanel toppane4;
    // End of variables declaration//GEN-END:variables
}
