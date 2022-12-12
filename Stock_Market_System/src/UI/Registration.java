/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.awt.Image;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.*;

import model.User;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;
import model.UserRegistrationDetails;
import model.UserSelectionDetails;
/**
 *
 * @author rishi
 */
public class Registration extends javax.swing.JFrame {

    ImageIcon icon = new ImageIcon("Logo.png");
    Image image = icon.getImage();
    Image newimg=image.getScaledInstance(75, 75,Image.SCALE_SMOOTH);
    ImageIcon ticon= new ImageIcon(newimg);
    /**
     * Creates new form Registration
     */
    UserSelectionDetails selections;
    User user;
    UserRegistrationDetails newUser;
    public Registration() {
        initComponents();
         logoImg.setIcon(ticon);
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
        labelAdminID7 = new javax.swing.JLabel();
        txtTradingAcc = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtDOB = new javax.swing.JTextField();
        txtInitialBalance = new javax.swing.JTextField();
        labelAdminID10 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoImg = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAdminID.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID.setText("Name:");

        txtName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        labelAdminID1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID1.setText("DOB:");

        txtEmail.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        labelAdminID2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID2.setText("Email:");

        labelAdminID3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
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

        labelAdminID4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID4.setText("Address:");

        labelAdminID5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID5.setText("Phone:");

        labelAdminID6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID6.setText("Trading Acc:");

        labelAdminID7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID7.setText("Occupation:");

        txtTradingAcc.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTradingAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTradingAccActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(255, 0, 0));
        btnRegister.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnRegister1.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
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

        labelAdminID10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelAdminID10.setText("Initial balance in the wallet:");

        header.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Registration");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        txtOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Service", "Defence/Military", "Technology", "Medicine", "Art", "Business" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(312, 312, 312))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID5)
                                .addGap(18, 18, 18)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID2)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAdminID1)
                                    .addComponent(labelAdminID3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTradingAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelAdminID6)
                                .addGap(195, 195, 195))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(labelAdminID10)
                        .addGap(26, 26, 26)
                        .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
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
                    .addComponent(labelAdminID6)
                    .addComponent(txtTradingAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID10)
                    .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
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

    private void txtTradingAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTradingAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTradingAccActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

         String phonePattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
         String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
         String datePattern="^\\d{4}/\\d{2}/\\d{2}$";
        
         String userID= UUID.randomUUID().toString();
         String name = txtName.getText();
         String dob= txtDOB.getText();
         String address=txtAddress.getText(); 
         String phone=txtPhone.getText();
         String email=txtEmail.getText();
         String occupation=txtOccupation.getSelectedItem().toString();
         if(txtTradingAcc.getText().isEmpty() || txtInitialBalance.getText().isEmpty()){
              showMessageDialog(this,"Please Make Sure you fill all the fields  !!");
             return;
         }
         Double tradingAcc= Double.parseDouble(txtTradingAcc.getText().trim());
//         String sbroker=txtStockBroker.getText();
//         String mfbroker=txtMFBroker.getText();
         String password = new String(txtPassword.getPassword());
         Integer initialBalance = Integer.parseInt(txtInitialBalance.getText().trim());
         System.out.println("Before creating the selections");
         this.selections = new UserSelectionDetails();
         System.out.println("After creating the selections");
         
         // Form Validations
         
         if(name.isEmpty() || dob.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty() ||  password.isEmpty()){
             showMessageDialog(this,"Please Make Sure you fill all the fields  !!");
             return;
         }
         
         if (!phone.matches(phonePattern)){
            showMessageDialog(this, "Make sure phone number is in the right format");
            return;
        }
         if (!email.matches(emailPattern)){
            showMessageDialog(this, "Make sure email is in the right format");
            return;
        }
         if (!dob.matches(datePattern)){
            showMessageDialog(this, "Make sure date is YYYY/MM/DD format");
            return;
        }
                try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            
            String sqlS1= "INSERT INTO `info5100_finalproject`.`users` (`UserID`, `Name`, `DOB`,`Email`, `Password`, `Phone`,`Address`, `Occupation`, `Trading Account Number`, `Initial Wallet Balance`) VALUES ('"+userID+"', '"+name+"','"+dob+"','"+email+"','"+password+"', '"+phone+"','"+address+"','"+occupation+"','"+tradingAcc+"','"+initialBalance+"')";
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
//            this.newUser.setSbroker(sbroker);
//            this.newUser.setMfbroker(mfbroker);
            this.newUser.setPassword(password);
            this.newUser.setInitialBalance(initialBalance);
            
        }
        catch(Exception e){
            showMessageDialog(this,e);
        }
           
                txtName.setText("");
                 txtName.setText("");
                 txtDOB.setText("");
                 txtAddress.setText(""); 
                 txtPhone.setText("");
                txtEmail.setText("");
                txtPassword.setText("");
                txtTradingAcc.setText("");
                txtInitialBalance.setText("");
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
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel logoImg;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtInitialBalance;
    private javax.swing.JTextField txtName;
    private javax.swing.JComboBox<String> txtOccupation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTradingAcc;
    // End of variables declaration//GEN-END:variables
}
