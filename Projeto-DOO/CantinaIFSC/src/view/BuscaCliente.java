/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class BuscaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TemplateBusca
     */
    public BuscaCliente() {
        initComponents();
    }
    
     public JButton getJButtonExit() {
        return JButtonExit;
    }

    public JPanel getBottompane() {
        return bottompane;
    }

    public JButton getjButtonFiltrar() {
        return jButtonFiltrar;
    }

    public JButton getjButtonCarregar() {
        return jButtonCarregar;
    }

    public JPanel getMidpane() {
        return midpane;
    }

    public JPanel getToppane() {
        return toppane;
    }

    public JTextField getjTFFiltrar() {
        return jTFFiltrar;
    }

    public void setjTFFiltrar(JTextField jTFFiltrar) {
        this.jTFFiltrar = jTFFiltrar;
    }

    public JTable getjTable() {
        return jTable;
    }

    public void setjTable(JTable jTable) {
        this.jTable = jTable;
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
        jTFFiltrar = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        bottompane = new javax.swing.JPanel();
        jButtonCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jBG.setBackground(new java.awt.Color(255, 255, 255));
        jBG.setMaximumSize(new java.awt.Dimension(1030, 740));
        jBG.setMinimumSize(new java.awt.Dimension(1030, 740));

        toppane.setBackground(new java.awt.Color(109, 217, 108));
        toppane.setPreferredSize(new java.awt.Dimension(1030, 99));

        jLTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(242, 241, 243));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Busca Cliente");
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
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTFFiltrar.setBackground(new java.awt.Color(229, 229, 229));
        jTFFiltrar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jTFFiltrar.setForeground(java.awt.Color.gray);
        jTFFiltrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));

        jButtonFiltrar.setBackground(new java.awt.Color(229, 229, 229));
        jButtonFiltrar.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jButtonFiltrar.setForeground(java.awt.Color.gray);
        jButtonFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-filtro-30 (1).png"))); // NOI18N
        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.setActionCommand("0");
        jButtonFiltrar.setBorderPainted(false);
        jButtonFiltrar.setHideActionText(true);
        jButtonFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonFiltrar.setIconTextGap(30);
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midpaneLayout = new javax.swing.GroupLayout(midpane);
        midpane.setLayout(midpaneLayout);
        midpaneLayout.setHorizontalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midpaneLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jTFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        midpaneLayout.setVerticalGroup(
            midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midpaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(midpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTable.setBackground(new java.awt.Color(229, 229, 229));
        jTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable.setForeground(java.awt.Color.gray);
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "CPF", "Nome", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(400);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(90);
        }

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        bottompane.setBackground(new java.awt.Color(255, 255, 255));

        jButtonCarregar.setBackground(new java.awt.Color(0, 153, 0));
        jButtonCarregar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButtonCarregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/icons8-compromisso-recorrente-24.png"))); // NOI18N
        jButtonCarregar.setText("Carregar");
        jButtonCarregar.setActionCommand("0");
        jButtonCarregar.setBorderPainted(false);
        jButtonCarregar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonCarregar.setIconTextGap(40);
        jButtonCarregar.setPreferredSize(new java.awt.Dimension(200, 90));
        jButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottompaneLayout = new javax.swing.GroupLayout(bottompane);
        bottompane.setLayout(bottompaneLayout);
        bottompaneLayout.setHorizontalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottompaneLayout.setVerticalGroup(
            bottompaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottompaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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
            .addGroup(jBGLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBGLayout.setVerticalGroup(
            jBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGLayout.createSequentialGroup()
                .addComponent(toppane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(midpane, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void JButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonExitActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarregarActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroBairro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonExit;
    private javax.swing.JPanel bottompane;
    private javax.swing.JPanel jBG;
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTFFiltrar;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel midpane;
    private javax.swing.JPanel toppane;
    // End of variables declaration//GEN-END:variables
}
