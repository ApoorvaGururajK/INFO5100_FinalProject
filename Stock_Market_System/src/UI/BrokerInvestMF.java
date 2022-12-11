/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import model.UserRegistrationDetails;
import model.UserSelectionDetails;

/**
 *
 * @author apoorvakulkarni
 */
public class BrokerInvestMF extends javax.swing.JFrame {

    /**
     * Creates new form BrokerInvestMF
     */
    UserRegistrationDetails newUser;
    UserSelectionDetails selections;
    private String User_selected;
    private String Company_selected;
    private String Unit;
    private Integer Unit_price;
    private Integer Total;
    public List<String> UserNames;
    public Set<String> UnitsOfIndex; 
    private Integer No_of_units;
    private String MFIndex_selected;
    private Integer Initial_wallet_balance;
    private Integer Fidelity_ZERO_Large_Cap_Index;
    private Integer Vanguard_SP_500_ETF;
    private Integer SPDR_SP_500_ETF_Trust;
    private Integer iShares_Core_SP_500_ETF;
    private Integer Shelton_NASDAQ_100_Index_Direct;
    public Map<String, String> MututalFundIndex;
    public Map<String, Integer> MutualFundUnitPrice;
    private Integer index_unit_value;
    public String UserID;
    
    public BrokerInvestMF() {
        initComponents();
        this.UserNames = new ArrayList<>();
        this.UnitsOfIndex = new HashSet<>();
    }
    
    public BrokerInvestMF(String MFIndex_selected, Integer No_of_units, Integer index_unit_value, Integer Initial_wallet_balance, String UserID) {
        initComponents();
        this.MFIndex_selected = MFIndex_selected;
        this.No_of_units = No_of_units;
        this.Initial_wallet_balance = Initial_wallet_balance;
        this.index_unit_value = index_unit_value;
        
        this.Fidelity_ZERO_Large_Cap_Index = 0;
        this.Vanguard_SP_500_ETF = 0;
        this.SPDR_SP_500_ETF_Trust = 0;
        this.iShares_Core_SP_500_ETF = 0;
        this.Shelton_NASDAQ_100_Index_Direct = 0;
        
        this.UserID = UserID;
        
        this.MututalFundIndex = new HashMap<>();
        this.MutualFundUnitPrice = new HashMap<>();
        
        this.MututalFundIndex.put("Fidelity ZERO Large Cap Index.", "Fidelity ZERO Large Cap Index Fund for $14.43");
        this.MututalFundIndex.put( "Vanguard S&P 500 ETF." ,"Vanguard S&P 500 ETF for $374.00");
        this.MututalFundIndex.put( "SPDR S&P 500 ETF Trust.", "SPDR S&P 500 ETF Trust for $406.91");
        this.MututalFundIndex.put("iShares Core S&P 500 ETF.", "iShares Core S&P 500 ETF for $408.71");
        this.MututalFundIndex.put( "Shelton NASDAQ-100 Index Direct.", "Shelton NASDAQ-100 Index Direct for $25.90");
        
        this.MutualFundUnitPrice.put("Fidelity ZERO Large Cap Index Fund for $14.43", 14);
        this.MutualFundUnitPrice.put("Vanguard S&P 500 ETF for $374.00", 374);
        this.MutualFundUnitPrice.put("SPDR S&P 500 ETF Trust for $406.91", 406);
        this.MutualFundUnitPrice.put("iShares Core S&P 500 ETF for $408.71", 407);
        this.MutualFundUnitPrice.put("Shelton NASDAQ-100 Index Direct for $25.90", 25);
        

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCalculateTotal1 = new javax.swing.JButton();
        txtGetTotal = new javax.swing.JTextField();
        btnCalculateTotal2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        labelTitle.setText("Invest in Mutual Funds");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitle)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Unit of Index to invest in", "Price per unit", "No.of units to buy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCalculateTotal1.setBackground(new java.awt.Color(0, 0, 0));
        btnCalculateTotal1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCalculateTotal1.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateTotal1.setText("Calculate Total");
        btnCalculateTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTotal1ActionPerformed(evt);
            }
        });

        txtGetTotal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtGetTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetTotalActionPerformed(evt);
            }
        });

        btnCalculateTotal2.setBackground(new java.awt.Color(0, 0, 0));
        btnCalculateTotal2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnCalculateTotal2.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateTotal2.setText("Buy Mutual Funds");
        btnCalculateTotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTotal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btnCalculateTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnCalculateTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
            
        Object[] row = new Object[10];
        row[0] = this.MFIndex_selected;
        row[1] = this.index_unit_value;
        row[2] = this.No_of_units;
        
        model.addRow(row);
        

        
        
    }
    
    
    private void btnCalculateTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotal1ActionPerformed
        // TODO add your handling code here:
        this.Total = this.No_of_units * this.index_unit_value;
        txtGetTotal.setText(this.Total.toString());
        this.Initial_wallet_balance = this.Initial_wallet_balance -1;
    }//GEN-LAST:event_btnCalculateTotal1ActionPerformed

    private void txtGetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetTotalActionPerformed

    private void populateDB() {
        if (this.MFIndex_selected == "Fidelity ZERO Large Cap Index") {
            this.Fidelity_ZERO_Large_Cap_Index = this.No_of_units;
        }
        else if (this.MFIndex_selected == "Vanguard S&P 500 ETF") {
            this.Vanguard_SP_500_ETF = this.No_of_units;
        }
        else if (this.MFIndex_selected == "SPDR S&P 500 ETF Trust") {
            this.SPDR_SP_500_ETF_Trust = this.No_of_units;
        }
        else if (this.MFIndex_selected == "iShares Core S&P 500 ETF") {
            this.iShares_Core_SP_500_ETF = this.No_of_units;
        }
        else if (this.MFIndex_selected == "Shelton NASDAQ-100 Index Direct") {
            this.Shelton_NASDAQ_100_Index_Direct = this.No_of_units;
            System.out.println(this.Shelton_NASDAQ_100_Index_Direct);
        }
        
        
        
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            
//            String UserID = "568856e6-3443-47c2-98af-ab8ea9ff8aea";
            
            String sqlS1= "UPDATE `info5100_finalproject`.`users` SET  `Fidelity ZERO Large Cap Index Fund` = '"+this.Fidelity_ZERO_Large_Cap_Index+"', `Vanguard S&P 500 ETF` = '"+this.Vanguard_SP_500_ETF+"', `SPDR S&P 500 ETF Trust` = '"+this.SPDR_SP_500_ETF_Trust+"', `iShares Core S&P 500 ETF` = '"+this.iShares_Core_SP_500_ETF+"', `Shelton NASDAQ-100 Index Direct` = '"+this.Shelton_NASDAQ_100_Index_Direct+"', `Initial Wallet Balance` = '"+this.Initial_wallet_balance+"' WHERE (`Name`='apoorva')";
            
            stm.executeUpdate(sqlS1);
            con.close();
            
        }
        catch (Exception e) {
            System.out.println("Inside catch of populate DB");
            showMessageDialog(this,e);

        }
        
    }
    
    
    private void btnCalculateTotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotal2ActionPerformed
        // TODO add your handling code here:
        populateDB();
        JOptionPane.showMessageDialog(this, "Successfully bought " +  (this.No_of_units) + " units of " + (this.MFIndex_selected));
    
    }//GEN-LAST:event_btnCalculateTotal2ActionPerformed

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
            java.util.logging.Logger.getLogger(BrokerInvestMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerInvestMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerInvestMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerInvestMF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerInvestMF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateTotal1;
    private javax.swing.JButton btnCalculateTotal2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtGetTotal;
    // End of variables declaration//GEN-END:variables
}
