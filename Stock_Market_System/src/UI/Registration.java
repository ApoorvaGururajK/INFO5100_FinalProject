/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.*;

import model.User;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import static javax.swing.JOptionPane.showMessageDialog;
import model.UserRegistrationDetails;
import model.UserSelectionDetails;
/**
 *
 * @author rishi
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    UserSelectionDetails selections;
    User user;
    UserRegistrationDetails newUser;
    public Registration() {
        initComponents();
    }
    
    private static AtomicLong idCounter = new AtomicLong();

public static String createID()
{
    return String.valueOf(idCounter.getAndIncrement());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelAdminID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelAdminID1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelAdminID2 = new javax.swing.JLabel();
        labelAdminID3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        labelAdminID4 = new javax.swing.JLabel();
        labelAdminID5 = new javax.swing.JLabel();
        labelAdminID6 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        labelAdminID7 = new javax.swing.JLabel();
        txtTradingAcc = new javax.swing.JTextField();
        labelAdminID8 = new javax.swing.JLabel();
        txtStockBroker = new javax.swing.JTextField();
        labelAdminID9 = new javax.swing.JLabel();
        txtMFBroker = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtDOB = new javax.swing.JTextField();
        txtInitialBalance = new javax.swing.JTextField();
        labelAdminID10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        labelTitle.setText("User Registration");

        labelAdminID.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID.setText("Name:");

        txtName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        labelAdminID1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID1.setText("DOB:");

        txtEmail.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        labelAdminID2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID2.setText("Email:");

        labelAdminID3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID3.setText("Password:");

        txtPhone.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        labelAdminID4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID4.setText("Address:");

        labelAdminID5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID5.setText("Phone:");

        labelAdminID6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID6.setText("Trading Acc:");

        txtOccupation.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });

        labelAdminID7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID7.setText("Occupation:");

        txtTradingAcc.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTradingAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTradingAccActionPerformed(evt);
            }
        });

        labelAdminID8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID8.setText("Stock Broker:");

        txtStockBroker.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtStockBroker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockBrokerActionPerformed(evt);
            }
        });

        labelAdminID9.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID9.setText("MF Broker:");

        txtMFBroker.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtMFBroker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMFBrokerActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnRegister1.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Home");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        txtDOB.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtInitialBalance.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtInitialBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInitialBalanceActionPerformed(evt);
            }
        });

        labelAdminID10.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID10.setText("Initial balance in the wallet:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(312, 312, 312))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelAdminID10)
                        .addGap(18, 18, 18)
                        .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(70, 86, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID2)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAdminID1)
                                    .addComponent(labelAdminID3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(labelAdminID7)
                        .addGap(18, 18, 18)
                        .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAdminID6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTradingAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(labelAdminID8)
                        .addGap(18, 18, 18)
                        .addComponent(txtStockBroker, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAdminID9)
                        .addGap(18, 18, 18)
                        .addComponent(txtMFBroker, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTitle)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID1)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID7)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID6)
                    .addComponent(txtTradingAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID8)
                    .addComponent(txtStockBroker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID9)
                    .addComponent(txtMFBroker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID10)
                    .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtTradingAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTradingAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTradingAccActionPerformed

    private void txtStockBrokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockBrokerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockBrokerActionPerformed

    private void txtMFBrokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMFBrokerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMFBrokerActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

         String phonePattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
         String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        
         String userID= UUID.randomUUID().toString();
         String name = txtName.getText();
         String dob= txtDOB.getText();
         String address=txtAddress.getText(); 
         String phone=txtPhone.getText();
         String email=txtEmail.getText();
         String occupation=txtOccupation.getText();
         Double tradingAcc= Double.parseDouble(txtTradingAcc.getText());
         String sbroker=txtStockBroker.getText();
         String mfbroker=txtMFBroker.getText();
         String password = new String(txtPassword.getPassword());
         Integer initialBalance = Integer.parseInt(txtInitialBalance.getText());
         System.out.println("Before creating the selections");
         this.selections = new UserSelectionDetails();
         System.out.println("After creating the selections");
         
                try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Darklord77@");
            Statement stm= con.createStatement();
            
            String sqlS1= "INSERT INTO `info5100_finalproject`.`users` (`UserID`, `Name`, `DOB`,`Email`, `Password`, `Phone`,`Address`, `Occupation`, `Trading Account Number`,`Stock Broker`,`MF Broker`, `Initial Wallet Balance`) VALUES ('"+userID+"', '"+name+"','"+dob+"','"+email+"','"+password+"', '"+phone+"','"+address+"','"+occupation+"','"+tradingAcc+"','"+sbroker+"','"+mfbroker+"', '"+initialBalance+"')";
            String sqlS2= "INSERT INTO `info5100_finalproject`.`authdata` (`ID`, `username`, `password`,`type`) VALUES ('"+userID+"','"+email+"','"+password+"', 'User')";
            
            stm.executeUpdate(sqlS1);
            stm.executeUpdate(sqlS2);
            
            showMessageDialog(this,"User Registered Successfully !!");
            con.close(); 
            System.out.println("After passing the data to  the DB");
            
            this.newUser = this.selections.addUser();
         
            this.newUser.setName(name);
            this.newUser.setUserID(userID);
            this.newUser.setAddress(address);
            this.newUser.setDob(dob);
            this.newUser.setPhone(phone);
            this.newUser.setEmail(email);
            this.newUser.setOccupation(occupation);
            this.newUser.setTradingAcc(tradingAcc);
            this.newUser.setSbroker(sbroker);
            this.newUser.setMfbroker(mfbroker);
            this.newUser.setPassword(password);
            this.newUser.setInitialBalance(initialBalance);
            
        }
        catch(Exception e){
            showMessageDialog(this,e);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        
        System.out.println(this.newUser.toString());
        Home home= new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtInitialBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInitialBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInitialBalanceActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAdminID;
    private javax.swing.JLabel labelAdminID1;
    private javax.swing.JLabel labelAdminID10;
    private javax.swing.JLabel labelAdminID2;
    private javax.swing.JLabel labelAdminID3;
    private javax.swing.JLabel labelAdminID4;
    private javax.swing.JLabel labelAdminID5;
    private javax.swing.JLabel labelAdminID6;
    private javax.swing.JLabel labelAdminID7;
    private javax.swing.JLabel labelAdminID8;
    private javax.swing.JLabel labelAdminID9;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtInitialBalance;
    private javax.swing.JTextField txtMFBroker;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStockBroker;
    private javax.swing.JTextField txtTradingAcc;
    // End of variables declaration//GEN-END:variables
}
