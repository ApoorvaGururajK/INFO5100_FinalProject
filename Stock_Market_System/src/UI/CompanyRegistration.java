/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author rishi
 */
public class CompanyRegistration extends javax.swing.JPanel {

    /**
     * Creates new form CompanyRegistration
     */
    public CompanyRegistration() {
        initComponents();
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
        jPasswordField1 = new javax.swing.JPasswordField();
        labelAdminID3 = new javax.swing.JLabel();
        txtAdminID2 = new javax.swing.JTextField();
        labelAdminID2 = new javax.swing.JLabel();
        labelAdminID = new javax.swing.JLabel();
        txtAdminID = new javax.swing.JTextField();
        labelAdminID1 = new javax.swing.JLabel();
        txtAdminID1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        labelTitle.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        labelTitle.setText("Company Registration");

        labelAdminID3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID3.setText("Password:");

        txtAdminID2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtAdminID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminID2ActionPerformed(evt);
            }
        });

        labelAdminID2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID2.setText("Username:");

        labelAdminID.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID.setText("Name:");

        txtAdminID.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtAdminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminIDActionPerformed(evt);
            }
        });

        labelAdminID1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        labelAdminID1.setText("DOB:");

        txtAdminID1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtAdminID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminID1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addGap(268, 268, 268))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelAdminID)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelAdminID2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdminID2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelAdminID3)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelAdminID1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdminID1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTitle)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID)
                    .addComponent(txtAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID1)
                    .addComponent(txtAdminID1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAdminID2)
                    .addComponent(txtAdminID2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdminID3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdminID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminID2ActionPerformed

    private void txtAdminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminIDActionPerformed

    private void txtAdminID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminID1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelAdminID;
    private javax.swing.JLabel labelAdminID1;
    private javax.swing.JLabel labelAdminID2;
    private javax.swing.JLabel labelAdminID3;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtAdminID;
    private javax.swing.JTextField txtAdminID1;
    private javax.swing.JTextField txtAdminID2;
    // End of variables declaration//GEN-END:variables
}
