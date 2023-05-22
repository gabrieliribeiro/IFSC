/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class CadastroEndereco extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroEnderecos
     */
    public CadastroEndereco() {
        initComponents();
    }

    public JPanel getBottompane() {
        return bottompane;
    }

    public JButton getjBExit4() {
        return jBExit4;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
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

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JTextField getjTFBairro() {
        return jTFBairro;
    }

    public void setjTFBairro(JTextField jTFBairro) {
        this.jTFBairro = jTFBairro;
    }

    public JTextField getjTFCEP() {
        return jTFCEP;
    }

    public void setjTFCEP(JTextField jTFCEP) {
        this.jTFCEP = jTFCEP;
    }

    public JTextField getjTFCidade() {
        return jTFCidade;
    }

    public void setjTFCidade(JTextField jTFCidade) {
        this.jTFCidade = jTFCidade;
    }

    public JTextField getjTFID() {
        return jTFID;
    }

    public void setjTFID(JTextField jTFID) {
        this.jTFID = jTFID;
    }

    public JTextField getjTFLogradouro() {
        return jTFLogradouro;
    }

    public void setjTFLogradouro(JTextField jTFLogradouro) {
        this.jTFLogradouro = jTFLogradouro;
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
        jLCEP = new javax.swing.JLabel();
        jTFCEP = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLLogradouro = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jLBairro = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLIStatus = new javax.swing.JLabel();
        bottompane = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1030, 740));
        setMinimumSize(new java.awt.Dimension(1030, 740));
        setResizable(false);

        jBG.setBackground(new java.awt.Color(255, 255, 255));
        jBG.setMaximumSize(new java.awt.Dimension(1030, 740));
        jBG.setMinimumSize(new java.awt.Dimension(1030, 740));
        jBG.setPreferredSize(new java.awt.Dimension(1030, 740));

        toppane4.setBackground(new java.awt.Color(109, 217, 108));
        toppane4.setMaximumSize(new java.awt.Dimension(1030, 99));
        toppane4.setMinimumSize(new java.awt.Dimension(1030, 99));
        toppane4.setPreferredSize(new java.awt.Dimension(1030, 99));

        jLTitulo4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLTitulo4.setForeground(new java.awt.Color(242, 241, 243));
        jLTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo4.setText("Cadastro Endereço");
        jLTitulo4.setToolTipText("");
        jLTitulo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jBExit4.setBackground(new java.awt.Color(109, 217, 108));
        jBExit4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-voltar-48.png"))); // NOI18N
        jBExit4.setActionCommand("0");
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
                .addGap(230, 230, 230)
                .addComponent(jLTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        midpane.setMaximumSize(new java.awt.Dimension(1030, 152));
        midpane.setMinimumSize(new java.awt.Dimension(1030, 152));
        midpane.setPreferredSize(new java.awt.Dimension(1030, 152));

        jLId.setBackground(new java.awt.Color(30, 30, 30));
        jLId.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLId.setForeground(java.awt.Color.gray);
        jLId.setText("ID");

        jTFID.setBackground(new java.awt.Color(229, 229, 229));
        jTFID.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(229, 229, 229));
        jButtonBuscar.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jButtonBuscar.setForeground(java.awt.Color.gray);
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-pesquisar-24.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("0");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setHideActionText(true);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonBuscar.setIconTextGap(30);
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(135, 44));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLCEP.setBackground(new java.awt.Color(30, 30, 30));
        jLCEP.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLCEP.setForeground(java.awt.Color.gray);
        jLCEP.setText("CEP");

        jTFCEP.setBackground(new java.awt.Color(229, 229, 229));
        jTFCEP.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFCEP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLCidade.setBackground(new java.awt.Color(30, 30, 30));
        jLCidade.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLCidade.setForeground(java.awt.Color.gray);
        jLCidade.setText("Cidade");

        jTFCidade.setBackground(new java.awt.Color(229, 229, 229));
        jTFCidade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jLLogradouro.setBackground(new java.awt.Color(30, 30, 30));
        jLLogradouro.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLLogradouro.setForeground(java.awt.Color.gray);
        jLLogradouro.setText("Logradouro");

        jTFLogradouro.setBackground(new java.awt.Color(229, 229, 229));
        jTFLogradouro.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFLogradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLBairro.setBackground(new java.awt.Color(30, 30, 30));
        jLBairro.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLBairro.setForeground(java.awt.Color.gray);
        jLBairro.setText("Bairro");

        jTFBairro.setBackground(new java.awt.Color(229, 229, 229));
        jTFBairro.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jComboBox1.setBackground(new java.awt.Color(229, 229, 229));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jComboBox1.setForeground(java.awt.Color.gray);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativa", "Inativa" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jLIStatus.setBackground(new java.awt.Color(30, 30, 30));
        jLIStatus.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLIStatus.setForeground(java.awt.Color.gray);
        jLIStatus.setText("Status");

        javax.swing.GroupLayout midpaneLayout = new javax.swing.GroupLayout(midpane);
        midpane.setLayout(midpaneLayout);
        midpaneLayout.setHorizontalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpaneLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midpaneLayout.createSequentialGroup()
                        .addComponent(jLCEP)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midpaneLayout.createSequentialGroup()
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLId)
                            .addComponent(jLLogradouro)
                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCidade)
                            .addComponent(jLCidade)
                            .addComponent(jLBairro)
                            .addComponent(jTFBairro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midpaneLayout.createSequentialGroup()
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLIStatus)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(113, 113, 113))))
        );
        midpaneLayout.setVerticalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midpaneLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jLIStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCEP)
                    .addComponent(jLCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro)
                    .addComponent(jLBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );

        bottompane.setBackground(new java.awt.Color(255, 255, 255));
        bottompane.setMaximumSize(new java.awt.Dimension(1030, 129));
        bottompane.setMinimumSize(new java.awt.Dimension(1030, 129));

        jButtonNew.setBackground(new java.awt.Color(51, 204, 255));
        jButtonNew.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-novo-por-cópia-30.png"))); // NOI18N
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
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-salvar-30.png"))); // NOI18N
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
                .addContainerGap(167, Short.MAX_VALUE))
        );
        bottompaneLayout.setVerticalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottompaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jBGLayout = new javax.swing.GroupLayout(jBG);
        jBG.setLayout(jBGLayout);
        jBGLayout.setHorizontalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toppane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGLayout.createSequentialGroup()
                .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(midpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBGLayout.setVerticalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGLayout.createSequentialGroup()
                .addComponent(toppane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(midpane, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(bottompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
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

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottompane;
    private javax.swing.JButton jBExit4;
    private javax.swing.JPanel jBG;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLIStatus;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLTitulo4;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCEP;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JPanel midpane;
    private javax.swing.JPanel toppane4;
    // End of variables declaration//GEN-END:variables
}
