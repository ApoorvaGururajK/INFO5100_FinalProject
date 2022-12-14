/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.MutualFundsBroker;
import model.StocksBroker;
import java.sql.*;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.showMessageDialog;
import model.Broker;

/**
 *
 * @author rishi
 */
public class BrokerAdminDashboard extends javax.swing.JFrame {

    ImageIcon icon = new ImageIcon("Logo.png");
    Image image = icon.getImage();
    Image newimg=image.getScaledInstance(75, 75,Image.SCALE_SMOOTH);
    ImageIcon ticon= new ImageIcon(newimg);
    /**
     * Creates new form BrokerAdminDashboard
     */
    private String Broker_Type;
    private List<String> BrokerType;
    public BrokerAdminDashboard() {
        initComponents();
        logoImg.setIcon(ticon);
        show_broker();
    }
    
            public ArrayList<Broker> brokerList(){
        
        ArrayList<Broker> brokerList = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            
            String dispSt="SELECT `Broker ID`,`Username`,`Organization`, `Type`,`Brokerage Rate`, `Broker Fee`, `Password` FROM `info5100_finalproject`.`brokers`";
            ResultSet rs= stm.executeQuery(dispSt);
            Broker broker;
            
            while(rs.next()){
                broker = new Broker(rs.getString("Broker ID"),rs.getString("Username"),rs.getString("Organization"),rs.getString("Type"),rs.getString("Broker Fee"),rs.getString("Brokerage Rate"),rs.getString("Password"));
                brokerList.add(broker);
            }
            
            con.close(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return brokerList;
    }
    
    public void show_broker(){
        ArrayList<Broker>list = brokerList();
        DefaultTableModel model=(DefaultTableModel)BrokerTable.getModel();
        Object[] row = new Object[7];
        for (int i=0;i<list.size();i++)
        {
             row[0]=list.get(i).getBrokerID();
             row[1]=list.get(i).getUsername();
             row[2]=list.get(i).getOrganization();
             row[3]=list.get(i).getType();
             row[4]=list.get(i).getFee();
             row[5]=list.get(i).getBRate();
             row[6]=list.get(i).getPassword();
              model.addRow(row);
        }
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
        labelUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelBrokerType = new javax.swing.JLabel();
        txtOrganization = new javax.swing.JComboBox<>();
        labelPassword1 = new javax.swing.JLabel();
        txtRegFee = new javax.swing.JTextField();
        labelUsername1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BrokerTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoImg = new javax.swing.JLabel();
        labelBrokerType1 = new javax.swing.JLabel();
        txtType = new javax.swing.JComboBox<>();
        txtBrokerage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelUsername.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelUsername.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelPassword.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N

        labelBrokerType.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelBrokerType.setText("Broker Organization:");

        txtOrganization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank", "Corporate", "Online", "Individual" }));
        txtOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganizationActionPerformed(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelPassword1.setText("Brokerage Rate:");

        txtRegFee.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtRegFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegFeeActionPerformed(evt);
            }
        });

        labelUsername1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelUsername1.setText("Registration Fee:");

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        BrokerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Broker ID", "Username", "Organization", "Type", "Brokerage Rate", "Fee", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BrokerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrokerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BrokerTable);

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Broker Admin Dashboard");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(logoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        labelBrokerType1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        labelBrokerType1.setText("Broker Type:");

        txtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock", "Mutual Funds" }));

        txtBrokerage.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtBrokerage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrokerageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelBrokerType)
                                    .addComponent(labelUsername))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(labelBrokerType1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(labelUsername1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRegFee, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(labelPassword)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(labelPassword1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBrokerage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBrokerType1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegFee, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBrokerType))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword1)
                    .addComponent(txtBrokerage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String BrokerID= UUID.randomUUID().toString();
        String Username = txtUsername.getText();
        String Organization = txtOrganization.getSelectedItem().toString();
         String Type = txtType.getSelectedItem().toString();
        Float RegFee =  Float.valueOf(txtRegFee.getText());
        Float BRate =  Float.valueOf(txtBrokerage.getText());
        String password = new String(txtPassword.getPassword());
//        String[] selections = { "", "Service", "Technology", "Product-based", "Financial", "Puclic", "Non- Profits"};
        

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();

            String sqlS2= "INSERT INTO `info5100_finalproject`.`brokers` (`Broker ID`, `Username`,`Organization`,`Type`,`Brokerage Rate`,`Broker Fee`,`Password`)VALUES('"+BrokerID+"','"+Username+"','"+Organization+"','"+Type+"','"+RegFee+"','"+BRate+"','"+password+"')";

            stm.executeUpdate(sqlS2);

            DefaultTableModel model=(DefaultTableModel)BrokerTable.getModel();
            model.setRowCount(0);
            show_broker();
            showMessageDialog(this,"Broker Added Successfully !!");
            txtUsername.setText("");
            txtPassword.setText("");
            txtRegFee.setText("");
            txtBrokerage.setText("");
            txtOrganization.setSelectedIndex(0);
            txtType.setSelectedIndex(0);
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            DefaultTableModel model=(DefaultTableModel)BrokerTable.getModel();
            String Username = txtUsername.getText();
        String Organization = txtOrganization.getSelectedItem().toString();
         String Type = txtType.getSelectedItem().toString();
        Float RegFee =  Float.valueOf(txtRegFee.getText());
        Float BRate =  Float.valueOf(txtBrokerage.getText());
        String password = new String(txtPassword.getPassword());

            if(BrokerTable.getSelectedRowCount() ==1){

                model.setValueAt(Username, BrokerTable.getSelectedRow(),1);
                model.setValueAt(Organization, BrokerTable.getSelectedRow(),2);
                model.setValueAt(Type, BrokerTable.getSelectedRow(),3);
                model.setValueAt(BRate, BrokerTable.getSelectedRow(),4);
                model.setValueAt(RegFee, BrokerTable.getSelectedRow(),5);
                model.setValueAt(password, BrokerTable.getSelectedRow(),6);

                int rowIndex=BrokerTable.getSelectedRow() ;
                String value =(BrokerTable.getModel().getValueAt(rowIndex, 0).toString());
                String query="UPDATE `info5100_finalproject`.`brokers` SET `Username` = '"+Username+"' ,`Organization` = '"+Organization+"',`Type` = '"+Type+"',`Brokerage Rate` = '"+BRate+"',`Broker Fee` = '"+RegFee+"', `Password` = '"+password+"' WHERE (`Broker ID` = '"+value+"')";
                stm.executeUpdate(query);
                showMessageDialog(this,"Broker Details Updated Successfully !!");
                txtUsername.setText("");
            txtPassword.setText("");
            txtRegFee.setText("");
            txtBrokerage.setText("");
            txtOrganization.setSelectedIndex(0);
            txtType.setSelectedIndex(0);
                
            }else{
                showMessageDialog(this,"Please select a single row to update !!");
            }

            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/info5100_finalproject","root","Prithvi12*");
            Statement stm= con.createStatement();
            DefaultTableModel model=(DefaultTableModel)BrokerTable.getModel();

            if(BrokerTable.getSelectedRowCount() ==1){

                int rowIndex=BrokerTable.getSelectedRow() ;
                String value =(BrokerTable.getModel().getValueAt(rowIndex, 0).toString());
                String query=" DELETE FROM `info5100_finalproject`.`brokers` WHERE (`Broker ID` = '"+value+"');";

                stm.executeUpdate(query);
                model.removeRow(BrokerTable.getSelectedRow());

                showMessageDialog(this,"Broker Deleted Successfully !!");
           
            txtUsername.setText("");
            txtPassword.setText("");
            txtRegFee.setText("");
            txtBrokerage.setText("");
            txtOrganization.setSelectedIndex(0);
            txtType.setSelectedIndex(0);

            }   else{
                showMessageDialog(this,"Please select a single row to delete !!");
            }
            con.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtRegFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegFeeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        Home home= new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganizationActionPerformed

    private void txtBrokerageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrokerageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrokerageActionPerformed

    private void BrokerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrokerTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)BrokerTable.getModel();

        String selRegFee= model.getValueAt(BrokerTable.getSelectedRow(), 5).toString();
        String selUserName= model.getValueAt(BrokerTable.getSelectedRow(), 1).toString();
        String selRate= model.getValueAt(BrokerTable.getSelectedRow(), 4).toString();
        String selPassword= model.getValueAt(BrokerTable.getSelectedRow(), 6).toString();

        txtUsername.setText(selUserName);
        txtRegFee.setText(selRegFee);
        txtPassword.setText(selPassword);
        txtBrokerage.setText(selRate);
        txtOrganization.setSelectedIndex(0);
        txtType.setSelectedIndex(0);
    }//GEN-LAST:event_BrokerTableMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(BrokerAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrokerAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrokerAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrokerAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrokerAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BrokerTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBrokerType;
    private javax.swing.JLabel labelBrokerType1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelUsername1;
    private javax.swing.JLabel logoImg;
    private javax.swing.JTextField txtBrokerage;
    private javax.swing.JComboBox<String> txtOrganization;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRegFee;
    private javax.swing.JComboBox<String> txtType;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
