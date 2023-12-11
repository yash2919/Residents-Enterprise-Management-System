/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BuildingTeam;

import business.Business;
import business.Enterprise.PestControlEnterprise;
import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestPestControlJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Business business;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestPestControlJPanel(JPanel userProcessContainer, UserAccount account, Business business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequestTest = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnRequestTest1 = new javax.swing.JButton();
        btnRequestTest2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnRequestTest.setText("Raise Isecticides Request");
        btnRequestTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTestActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage.setText("ENTER APARTMENT NUMBER :");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Send Pest Control Request");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRequestTest1.setText("Raise Miticides Request");
        btnRequestTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTest1ActionPerformed(evt);
            }
        });

        btnRequestTest2.setText("Raise Microbial Request");
        btnRequestTest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTest2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btnRequestTest2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRequestTest)
                                .addGap(33, 33, 33)
                                .addComponent(btnRequestTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRequestTest, btnRequestTest1, btnRequestTest2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestTest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRequestTest2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRequestTest, btnRequestTest1, btnRequestTest2});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTestActionPerformed

       
    }//GEN-LAST:event_btnRequestTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestTest1ActionPerformed

    private void btnRequestTest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTest2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestTest2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestTest;
    private javax.swing.JButton btnRequestTest1;
    private javax.swing.JButton btnRequestTest2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
