/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BuildingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.Organisation.Organisation;
import business.Role.Role;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class LeasingTeamWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private BuildingTeamEnterprise ent;
    private Business business;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public LeasingTeamWorkAreaJPanel(JPanel workArea, UserAccount account, BuildingTeamEnterprise ent, Business business) {
        initComponents();
        
        this.workArea = workArea;
        this.ent = ent;
        this.business = business;
        this.userAccount = account;
        populateLease();
        populate();  
    }
     public void populateLease(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    
        for(WorkRequest work:ent.getWorkQueue().getWorkRequestList()){
            if(work.getStatus().equals("sent"))
            if(work.getType().equals("lease")){
            Object[] row = new Object[4];
            row[0]=work;
            row[1]=work.getSender().getId();
            
            row[2] = work.getStatus();
              
            model.addRow(row);
            }
        }
 
    }
      public void populate(){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
    
        for(Organisation org: ent.getOrganisationDirectory().getOrganisationList() ){
          for(UserAccount usracc:org.getUserAccountDirectory().getUserAccountList()){
              if(usracc.getRole().type.equals(Role.RoleType.Residents)){
            Object[] row = new Object[4];
            row[0]=usracc.getId();
            row[1]=usracc.getUsername();
            
            row[2] =usracc.isValidate();
              
            model.addRow(row);
              }
          }
        
      
//            if(work.getStatus().equals("sent"))
//            if(work.getType().equals("lease")){
//            Object[] row = new Object[4];
//            row[0]=work;
//            row[1]=work.getSender().getId();
//            
//            row[2] = work.getStatus();
//              
//            model.addRow(row);
//            }
        }
 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Enquiries = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        leasedoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        resp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Leasing Team Work Area");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Enquires");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lease Documentation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Residents Portal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        add(jPanel1, "card2");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnquiriesLayout = new javax.swing.GroupLayout(Enquiries);
        Enquiries.setLayout(EnquiriesLayout);
        EnquiriesLayout.setHorizontalGroup(
            EnquiriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnquiriesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton4)
                .addContainerGap(800, Short.MAX_VALUE))
        );
        EnquiriesLayout.setVerticalGroup(
            EnquiriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnquiriesLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(73, 73, 73))
        );

        add(Enquiries, "card3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Resident", "ID", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Approve Residents Lease Docs");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lease Docs Submitted by -");

        jButton6.setText("Reject Residents Lease Docs");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leasedocLayout = new javax.swing.GroupLayout(leasedoc);
        leasedoc.setLayout(leasedocLayout);
        leasedocLayout.setHorizontalGroup(
            leasedocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leasedocLayout.createSequentialGroup()
                .addGroup(leasedocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leasedocLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton5)
                        .addGap(46, 46, 46)
                        .addComponent(jButton6))
                    .addGroup(leasedocLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leasedocLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addGroup(leasedocLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton7)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        leasedocLayout.setVerticalGroup(
            leasedocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leasedocLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(leasedocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(49, 49, 49)
                .addComponent(jButton7)
                .addGap(88, 88, 88))
        );

        add(leasedoc, "card4");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AptNo.", "Resident", "Lease Approved"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Residents");

        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout respLayout = new javax.swing.GroupLayout(resp);
        resp.setLayout(respLayout);
        respLayout.setHorizontalGroup(
            respLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respLayout.createSequentialGroup()
                .addGroup(respLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel2))
                    .addGroup(respLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(respLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton9)))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        respLayout.setVerticalGroup(
            respLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(78, 78, 78))
        );

        add(resp, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              jPanel1.setVisible(false);
       Enquiries.setVisible(false);
       resp.setVisible(true);
       leasedoc.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jPanel1.setVisible(false);
       Enquiries.setVisible(false);
       resp.setVisible(false);
       leasedoc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Assuming you have jTable1 and model initialized as in your code

// Get the selected row index
int selectedRowIndex = jTable1.getSelectedRow();

// Check if a row is selected
if (selectedRowIndex != -1) { // -1 indicates no row is selected
    // Get the data from the selected row in the model
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//    Object[] selectedRowData = new Object[model.getColumnCount()];
//    for (int i = 0; i < model.getColumnCount(); i++) {
//        selectedRowData[i] = model.getValueAt(selectedRowIndex, i);
//    }
System.out.println( model.getValueAt(selectedRowIndex,0));
   WorkRequest w=(WorkRequest) model.getValueAt(selectedRowIndex,0);
   w.setStatus("approved");
   w.getSender().setValidate(true);
    JOptionPane.showMessageDialog(null,"Approved documents");
    populateLease();
  
} else {
     JOptionPane.showMessageDialog(null,"Select a Row");
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
// Get the selected row index
int selectedRowIndex = jTable1.getSelectedRow();

// Check if a row is selected
if (selectedRowIndex != -1) { // -1 indicates no row is selected
    // Get the data from the selected row in the model
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//    Object[] selectedRowData = new Object[model.getColumnCount()];
//    for (int i = 0; i < model.getColumnCount(); i++) {
//        selectedRowData[i] = model.getValueAt(selectedRowIndex, i);
//    }
   WorkRequest w=(WorkRequest) model.getValueAt(selectedRowIndex,0);
   w.setStatus("submit again");
    JOptionPane.showMessageDialog(null,"Rejected documents");
    populateLease();
  
} else {
     JOptionPane.showMessageDialog(null,"Select a Row");
}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       leasedoc.setVisible(false);
       jPanel1.setVisible(true);
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               Enquiries.setVisible(false);
       jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         resp.setVisible(false);
       jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        Enquiries.setVisible(true);
        resp.setVisible(false);
        leasedoc.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Enquiries;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel leasedoc;
    private javax.swing.JPanel resp;
    // End of variables declaration//GEN-END:variables
}
