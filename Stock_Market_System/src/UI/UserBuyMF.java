/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author apoorvakulkarni
 */
public class UserBuyMF extends javax.swing.JFrame {

    /**
     * Creates new form UserBuyMF
     */
    public Map<String, String> MututalFundIndex;
    public Map<String, Integer> MutualFundUnitPrice;
    public Map<String, Integer> UserMutualFundsHistory;
    private Integer index_unit_value;
    private Integer total;
    private Integer No_of_units;
    private String MFIndex_selected;
    
    public UserBuyMF() {
        initComponents();
    }
    
    public UserBuyMF(Map<String, Integer> UserMutualFundsHistory) {
        initComponents();
        this.UserMutualFundsHistory = UserMutualFundsHistory;
        this.MututalFundIndex = new HashMap<>();
        this.MutualFundUnitPrice = new HashMap<>();
        this.MututalFundIndex.put("Fidelity ZERO Large Cap Index.", "Fidelity ZERO Large Cap Index Fund for $14.43");
        this.MututalFundIndex.put( "Vanguard S&P 500 ETF." ,"Vanguard S&P 500 ETF for $374.00");
        this.MututalFundIndex.put( "SPDR S&P 500 ETF Trust.", "SPDR S&P 500 ETF Trust for $406.91");
        this.MututalFundIndex.put("iShares Core S&P 500 ETF.", "iShares Core S&P 500 ETF for $408.71");
        this.MututalFundIndex.put("Schwab S&P 500 Index Fund." , "Schwab 500 Index for $39.35");
        this.MututalFundIndex.put( "Shelton NASDAQ-100 Index Direct.", "Shelton NASDAQ-100 Index Direct for $25.90");
        this.MututalFundIndex.put("Invesco QQQ Trust ETF.", "Invesco QQQ Trust ETF for $295.55");
        this.MututalFundIndex.put("Vanguard Russell 2000 ETF.", "Vanguard Russell 2000 ETF for $75.98");

       
       
        this.MutualFundUnitPrice.put("Fidelity ZERO Large Cap Index Fund for $14.43", 14);
        this.MutualFundUnitPrice.put("Vanguard S&P 500 ETF for $374.00", 374);
        this.MutualFundUnitPrice.put("SPDR S&P 500 ETF Trust for $406.91", 406);
        this.MutualFundUnitPrice.put("iShares Core S&P 500 ETF for $408.71", 407);
        this.MutualFundUnitPrice.put("Schwab 500 Index for $39.35", 39);
        this.MutualFundUnitPrice.put("Shelton NASDAQ-100 Index Direct for $25.90", 25);
        this.MutualFundUnitPrice.put("Invesco QQQ Trust ETF for $295.55", 295);
        this.MutualFundUnitPrice.put("Vanguard Russell 2000 ETF for $75.98", 75);
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelAdminID2 = new javax.swing.JLabel();
        jComboBoxStockMarketIndex = new javax.swing.JComboBox<>();
        btnCalculateTotal1 = new javax.swing.JButton();
        txtCalculateTotal = new javax.swing.JTextField();
        btnBuyMF = new javax.swing.JButton();
        labelAdminID4 = new javax.swing.JLabel();
        jComboBoxStockMarketUnit = new javax.swing.JComboBox<>();
        labelAdminID5 = new javax.swing.JLabel();
        txtNoOfUnits = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        labelTitle.setText("User Dashboard to Buy Mutual Funds");

        labelAdminID2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID2.setText("Select a Stock Market Index to invest in:");

        jComboBoxStockMarketIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStockMarketIndexActionPerformed(evt);
            }
        });

        btnCalculateTotal1.setBackground(new java.awt.Color(0, 0, 0));
        btnCalculateTotal1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCalculateTotal1.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateTotal1.setText("Calculate Total");
        btnCalculateTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTotal1ActionPerformed(evt);
            }
        });

        txtCalculateTotal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalculateTotalActionPerformed(evt);
            }
        });

        btnBuyMF.setBackground(new java.awt.Color(0, 0, 0));
        btnBuyMF.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnBuyMF.setForeground(new java.awt.Color(255, 255, 255));
        btnBuyMF.setText("Buy Mutual Fund");
        btnBuyMF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyMFActionPerformed(evt);
            }
        });

        labelAdminID4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID4.setText("Choose a unit under the selected index:");

        jComboBoxStockMarketUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBoxStockMarketUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStockMarketUnitActionPerformed(evt);
            }
        });

        labelAdminID5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID5.setText("No of units to buy:");

        txtNoOfUnits.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtNoOfUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfUnitsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(labelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(btnBuyMF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAdminID4)
                            .addComponent(labelAdminID2)
                            .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAdminID5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoOfUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStockMarketIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStockMarketUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalculateTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(labelTitle)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID2)
                    .addComponent(jComboBoxStockMarketIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID4)
                    .addComponent(jComboBoxStockMarketUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID5)
                    .addComponent(txtNoOfUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalculateTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnBuyMF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxStockMarketIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStockMarketIndexActionPerformed
        // TODO add your handling code here:
        System.out.println("Inside jComboBoxStockMarketIndexActionPerformed");
        this.MFIndex_selected = (String) jComboBoxStockMarketIndex.getSelectedItem();
        System.out.println(MFIndex_selected);
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) jComboBoxStockMarketUnit.getModel();
        model2.addElement(this.MututalFundIndex.get(MFIndex_selected));
        System.out.println("After initialising next combobox");
         
    }//GEN-LAST:event_jComboBoxStockMarketIndexActionPerformed
    
    private void populateComboBox() {
        System.out.println("Inside populateComboBox");
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) jComboBoxStockMarketIndex.getModel();
        System.out.println("Before initialising combobox");
        model1.addAll(this.MututalFundIndex.keySet());
        System.out.println("After initialising combobox");
    }
    
    
    private void btnCalculateTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotal1ActionPerformed
        // TODO add your handling code here:
        this.No_of_units = Integer.parseInt(txtNoOfUnits.getText());
        this.total = this.No_of_units * this.index_unit_value;
        txtCalculateTotal.setText(this.total.toString());
        this.UserMutualFundsHistory.put(this.MututalFundIndex.get(MFIndex_selected), this.No_of_units);
        System.out.println("The UserMutualFundsHistory map is " + this.UserMutualFundsHistory);
    }//GEN-LAST:event_btnCalculateTotal1ActionPerformed

    private void txtCalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalculateTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalculateTotalActionPerformed

    private void btnBuyMFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyMFActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Successfully bought " +  (this.No_of_units) + " usnits of " + (this.MFIndex_selected));

    }//GEN-LAST:event_btnBuyMFActionPerformed

    private void jComboBoxStockMarketUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStockMarketUnitActionPerformed
        // TODO add your handling code here:
        String MFIndex_unit_selected = (String) jComboBoxStockMarketUnit.getSelectedItem();
        this.index_unit_value = (this.MutualFundUnitPrice.get(MFIndex_unit_selected));
    }//GEN-LAST:event_jComboBoxStockMarketUnitActionPerformed

    private void txtNoOfUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfUnitsActionPerformed

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
            java.util.logging.Logger.getLogger(UserBuyMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserBuyMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserBuyMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserBuyMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserBuyMF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyMF;
    private javax.swing.JButton btnCalculateTotal1;
    private javax.swing.JComboBox<String> jComboBoxStockMarketIndex;
    private javax.swing.JComboBox<String> jComboBoxStockMarketUnit;
    private javax.swing.JLabel labelAdminID2;
    private javax.swing.JLabel labelAdminID4;
    private javax.swing.JLabel labelAdminID5;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtCalculateTotal;
    private javax.swing.JTextField txtNoOfUnits;
    // End of variables declaration//GEN-END:variables
}
