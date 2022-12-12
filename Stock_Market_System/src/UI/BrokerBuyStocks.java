/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
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
public class BrokerBuyStocks extends javax.swing.JFrame {

    /**
     * Creates new form BrokerBuyStocks
     */
    UserRegistrationDetails newUser;
    UserSelectionDetails selections;
    public Map<String, List<Integer>> UserStockHistory;
    public List<String> UserNames;
    public Set<String> Companies;
    private String User_selected;
    private String Company_selected;
    private Integer Current_Stock_price;
    private Integer Total;
    private Integer No_of_Stocks;
    private Integer Initial_wallet_balance;
    private Integer Stocks_of_Apple;
    private Integer Stocks_of_Microsoft;
    private Integer Stocks_of_Amazon;
    private Integer Stocks_of_Netflix;
    public String UserID;
    
    public BrokerBuyStocks() {
        initComponents();
        this.UserNames = new ArrayList<>();
        this.Companies = new HashSet<>();
        //TODO: After the user buys the stocks, directly come to the broker buy stocks page. Update the table with 
        // the same values for comapnay selected(Send company selected as string) and no of stocks bought (as an int).
        // Cut the brokerage fee after the user buys the stock. Give a filed to indicate the brokerage fee and update the balance in DB
        //Same with Broker sell stocks. Get the Stocks broker name in user buy stocks and display it on BRoker buy stocks.
        //Dont update the DB in user, update it on Broker. Remove S/MF Broker Dashboard.

    }
    
    public BrokerBuyStocks(String Company_selected, Integer No_of_Stocks, Integer Initial_wallet_balance, String UserID) {
        initComponents();
        this.Company_selected = Company_selected;
        this.No_of_Stocks = No_of_Stocks;
        this.Initial_wallet_balance = Initial_wallet_balance;
        this.UserID = UserID;
        
        System.out.print("Inside Broker Constructor");
        System.out.print(this.Company_selected);
        System.out.print(this.No_of_Stocks);
        System.out.print(this.Initial_wallet_balance);
        this.Stocks_of_Apple = 0;
        this.Stocks_of_Microsoft = 0;
        this.Stocks_of_Amazon = 0;
        this.Stocks_of_Netflix = 0;
        
        this.UserStockHistory = new HashMap<>();
        
        this.UserStockHistory.put("Apple", Arrays.asList(142, 0, 0));
        this.UserStockHistory.put("Microsoft", Arrays.asList(247, 0, 0));
        this.UserStockHistory.put("Amazon", Arrays.asList(90, 0, 0));
        this.UserStockHistory.put("Netflix", Arrays.asList(310, 0, 0));
        
        populateTable();
        
    }
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        System.out.print("Inside Populate func");
        System.out.print(this.Company_selected);
        System.out.print(this.No_of_Stocks);
        Object[] row = new Object[10];
        row[0] = this.Company_selected;
        row[1] = this.UserStockHistory.get(Company_selected).get(0);
        this.Current_Stock_price = this.UserStockHistory.get(Company_selected).get(0);
        row[2] = this.No_of_Stocks;
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCalculateTotal1 = new javax.swing.JButton();
        txtGetTotal = new javax.swing.JTextField();
        btnBuyStocks = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Company", "Price per stock", "No.of Stocks to buy"
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
        btnCalculateTotal1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
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

        btnBuyStocks.setBackground(new java.awt.Color(255, 0, 0));
        btnBuyStocks.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnBuyStocks.setForeground(new java.awt.Color(255, 255, 255));
        btnBuyStocks.setText("Buy Stocks");
        btnBuyStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyStocksActionPerformed(evt);
            }
        });

        btnSignOut.setBackground(new java.awt.Color(0, 0, 0));
        btnSignOut.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnSignOut.setForeground(new java.awt.Color(255, 255, 255));
        btnSignOut.setText("Go Back");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Broker Buy Stocks");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txtGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuyStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGetTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculateTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btnBuyStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotal1ActionPerformed
        // TODO add your handling code here:
        this.Total = this.Current_Stock_price * this.No_of_Stocks;
        txtGetTotal.setText(this.Total.toString());
        this.Initial_wallet_balance = Initial_wallet_balance - 1;

    }//GEN-LAST:event_btnCalculateTotal1ActionPerformed

    private void txtGetTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGetTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGetTotalActionPerformed

    private void populateDB() {
        if (this.Company_selected == "Apple") {
            this.Stocks_of_Apple = this.No_of_Stocks;
        }
        else if (this.Company_selected == "Microsoft") {
            this.Stocks_of_Microsoft = this.No_of_Stocks;
        }
        else if (this.Company_selected == "Amazon") {
            this.Stocks_of_Amazon = this.No_of_Stocks;
        }
        else if (this.Company_selected == "Netflix") {
            this.Stocks_of_Netflix = this.No_of_Stocks;
        }
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            
//            String UserID = "568856e6-3443-47c2-98af-ab8ea9ff8aea";
            
            String sqlS1= "UPDATE `info5100_finalproject`.`users` SET  `Stocks_of_Apple` = '"+this.Stocks_of_Apple+"', `Stocks_of_Microsoft` = '"+this.Stocks_of_Microsoft+"', `Stocks_of_Amazon` = '"+this.Stocks_of_Amazon+"', `Stocks_of_Netflix` = '"+this.Stocks_of_Netflix+"', `Initial Wallet Balance` = '"+this.Initial_wallet_balance+"' WHERE (`UserID`='"+this.UserID+"')";
            
            stm.executeUpdate(sqlS1);
            con.close();
            
        }
        catch (Exception e) {
            System.out.println("Inside catch of populate DB");
            showMessageDialog(this,e);

        }
        
    }
    
    
    
    private void btnBuyStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyStocksActionPerformed
        // TODO add your handling code here:
        
        //TODO Update DB
        populateDB();
        JOptionPane.showMessageDialog(this, "Successfully bought " +  (this.No_of_Stocks) + " stocks of " + (this.Company_selected));
        UserDashboard home = new UserDashboard();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuyStocksActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        UserDashboard home = new UserDashboard();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSignOutActionPerformed

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
            java.util.logging.Logger.getLogger(BrokerBuyStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerBuyStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerBuyStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerBuyStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerBuyStocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyStocks;
    private javax.swing.JButton btnCalculateTotal1;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGetTotal;
    // End of variables declaration//GEN-END:variables
}
