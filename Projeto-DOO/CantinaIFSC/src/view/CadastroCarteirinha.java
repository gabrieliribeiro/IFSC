/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class CadastroCarteirinha extends javax.swing.JFrame {

    /**
     * Creates new form Carteirinha
     */
    public CadastroCarteirinha() {
        initComponents();
    }

    public JButton getJButtonExit() {
        return JButtonExit;
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

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }
    

    
    public JButton getjButtonAdicionarCPF() {
        return jButtonAddCPF;
    }

    public JButton getjButtonPesquisarCPF() {
        return jButtonBuscarCPF;
    }


    public JFormattedTextField getjFormattedTextFieldCPF() {
        return jFTFCPF;
    }

    public void setjFormattedTextFieldCPF(JFormattedTextField jFormattedTextFieldCPF) {
        this.jFTFCPF = jFormattedTextFieldCPF;
    }

    public JFormattedTextField getjFormattedTextFieldDataCancelamento() {
        return jFTFDataCancelamento;
    }

    public void setjFormattedTextFieldDataCancelamento(JFormattedTextField jFormattedTextFieldDataCancelamento) {
        this.jFTFDataCancelamento = jFormattedTextFieldDataCancelamento;
    }

    public JFormattedTextField getjFormattedTextFieldDataGeracao() {
        return jFTFDataGeracao;
    }

    public void setjFormattedTextFieldDataGeracao(JFormattedTextField jFormattedTextFieldDataGeracao) {
        this.jFTFDataGeracao = jFormattedTextFieldDataGeracao;
    }

    public JTextField getjTextFieldCodBarra() {
        return jTFCodBarra;
    }

    public void setjTextFieldCodBarra(JTextField jTextFieldCodBarra) {
        this.jTFCodBarra = jTextFieldCodBarra;
    }

    public JTextField getjTextFieldID() {
        return jTFID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTFID = jTextFieldID;
    }

    public JPanel getBottompane() {
        return bottompane;
    }

    public JPanel getMidpane() {
        return midpane;
    }

    public JPanel getToppane() {
        return toppane;
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
        toppane = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        JButtonExit = new javax.swing.JButton();
        midpane = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLCPF = new javax.swing.JLabel();
        jFTFCPF = new javax.swing.JFormattedTextField();
        jButtonBuscarCPF = new javax.swing.JButton();
        jButtonAddCPF = new javax.swing.JButton();
        jLCodBarra = new javax.swing.JLabel();
        jTFCodBarra = new javax.swing.JTextField();
        jLDataGeracao = new javax.swing.JLabel();
        jFTFDataGeracao = new javax.swing.JFormattedTextField();
        jLDataCancelamento = new javax.swing.JLabel();
        jFTFDataCancelamento = new javax.swing.JFormattedTextField();
        bottompane = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBG.setBackground(new java.awt.Color(255, 255, 255));
        jBG.setMaximumSize(new java.awt.Dimension(1030, 740));
        jBG.setMinimumSize(new java.awt.Dimension(1030, 740));

        toppane.setBackground(new java.awt.Color(109, 217, 108));
        toppane.setPreferredSize(new java.awt.Dimension(1030, 99));

        jLTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(242, 241, 243));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Cadastro Carteirinha");
        jLTitulo.setToolTipText("");
        jLTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        JButtonExit.setBackground(new java.awt.Color(109, 217, 108));
        JButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-voltar-48.png"))); // NOI18N
        JButtonExit.setActionCommand("0");
        JButtonExit.setBorderPainted(false);
        JButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toppaneLayout = new javax.swing.GroupLayout(toppane);
        toppane.setLayout(toppaneLayout);
        toppaneLayout.setHorizontalGroup(
            toppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppaneLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(JButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254)
                .addComponent(jLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppaneLayout.setVerticalGroup(
            toppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(toppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo)
                    .addComponent(JButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        midpane.setBackground(new java.awt.Color(255, 255, 255));
        midpane.setPreferredSize(new java.awt.Dimension(1030, 152));

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

        jLCPF.setBackground(new java.awt.Color(30, 30, 30));
        jLCPF.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLCPF.setForeground(java.awt.Color.gray);
        jLCPF.setText("CPF");

        jFTFCPF.setBackground(new java.awt.Color(229, 229, 229));
        jFTFCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jFTFCPF.setForeground(java.awt.Color.gray);
        try {
            jFTFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFCPF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jButtonBuscarCPF.setBackground(new java.awt.Color(229, 229, 229));
        jButtonBuscarCPF.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jButtonBuscarCPF.setForeground(java.awt.Color.gray);
        jButtonBuscarCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-pesquisar-24.png"))); // NOI18N
        jButtonBuscarCPF.setBorderPainted(false);
        jButtonBuscarCPF.setHideActionText(true);
        jButtonBuscarCPF.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBuscarCPF.setIconTextGap(30);
        jButtonBuscarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCPFActionPerformed(evt);
            }
        });

        jButtonAddCPF.setBackground(new java.awt.Color(229, 229, 229));
        jButtonAddCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-soma-30.png"))); // NOI18N
        jButtonAddCPF.setBorderPainted(false);
        jButtonAddCPF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAddCPF.setIconTextGap(0);
        jButtonAddCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCPFActionPerformed(evt);
            }
        });

        jLCodBarra.setBackground(new java.awt.Color(30, 30, 30));
        jLCodBarra.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLCodBarra.setForeground(java.awt.Color.gray);
        jLCodBarra.setText("Código de Barra");

        jTFCodBarra.setBackground(new java.awt.Color(229, 229, 229));
        jTFCodBarra.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFCodBarra.setForeground(java.awt.Color.gray);
        jTFCodBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLDataGeracao.setBackground(new java.awt.Color(30, 30, 30));
        jLDataGeracao.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLDataGeracao.setForeground(java.awt.Color.gray);
        jLDataGeracao.setText("Data Geração");

        jFTFDataGeracao.setBackground(new java.awt.Color(229, 229, 229));
        jFTFDataGeracao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jFTFDataGeracao.setForeground(java.awt.Color.gray);
        try {
            jFTFDataGeracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFDataGeracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFDataGeracao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFDataGeracao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        jLDataCancelamento.setBackground(new java.awt.Color(30, 30, 30));
        jLDataCancelamento.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLDataCancelamento.setForeground(java.awt.Color.gray);
        jLDataCancelamento.setText("Data Cancelamento");

        jFTFDataCancelamento.setBackground(new java.awt.Color(229, 229, 229));
        jFTFDataCancelamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jFTFDataCancelamento.setForeground(java.awt.Color.gray);
        try {
            jFTFDataCancelamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFDataCancelamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFDataCancelamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTFDataCancelamento.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        javax.swing.GroupLayout midpaneLayout = new javax.swing.GroupLayout(midpane);
        midpane.setLayout(midpaneLayout);
        midpaneLayout.setHorizontalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpaneLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLCodBarra)
                    .addComponent(jLId)
                    .addComponent(jLCPF)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFCodBarra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDataGeracao)
                    .addComponent(jFTFDataGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDataCancelamento)
                    .addComponent(jFTFDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        midpaneLayout.setVerticalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midpaneLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jTFID))
                .addGap(18, 18, 18)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonBuscarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLDataGeracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataGeracao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLCodBarra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLDataCancelamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataCancelamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        bottompane.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        bottompaneLayout.setVerticalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jBGLayout = new javax.swing.GroupLayout(jBG);
        jBG.setLayout(jBGLayout);
        jBGLayout.setHorizontalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGLayout.createSequentialGroup()
                .addGroup(jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bottompane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(midpane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jBGLayout.setVerticalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGLayout.createSequentialGroup()
                .addComponent(toppane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(midpane, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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

    private void JButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonExitActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonBuscarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarCPFActionPerformed

    private void jButtonAddCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddCPFActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCarteirinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonExit;
    private javax.swing.JPanel bottompane;
    private javax.swing.JPanel jBG;
    private javax.swing.JButton jButtonAddCPF;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonBuscarCPF;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JFormattedTextField jFTFCPF;
    private javax.swing.JFormattedTextField jFTFDataCancelamento;
    private javax.swing.JFormattedTextField jFTFDataGeracao;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCodBarra;
    private javax.swing.JLabel jLDataCancelamento;
    private javax.swing.JLabel jLDataGeracao;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTFCodBarra;
    private javax.swing.JTextField jTFID;
    private javax.swing.JPanel midpane;
    private javax.swing.JPanel toppane;
    // End of variables declaration//GEN-END:variables
}
