/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BuildingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.Enterprise;
import business.Enterprise.PackagingTeamEnterprise;
import business.Enterprise.PestControlEnterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.MainScreen;

/**
 *
 * @author uttkarsh
 */
public class ConciergeWorkArea extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;
    BuildingTeamEnterprise par;
    Business business;

    /**
     * Creates new form ConciergeWorkArea
     */
    public ConciergeWorkArea(JPanel userProcessContainer, UserAccount account, BuildingTeamEnterprise par,
            Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.par = par;
        this.business = business;
        populate();
        check();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WorkArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ServiceRequest = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Service = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Package = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        Enquries = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        Complaints = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Concierge Work Area");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Raise Service Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check for Package");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Send Enquiry to Leasing Team");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check for Complaints");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
                WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkAreaLayout.createSequentialGroup()
                                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(WorkAreaLayout.createSequentialGroup()
                                                .addGap(326, 326, 326)
                                                .addComponent(jLabel1))
                                        .addGroup(WorkAreaLayout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addGroup(WorkAreaLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton4)
                                                        .addGroup(WorkAreaLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jButton1,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButton2,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButton3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                        Short.MAX_VALUE)))))
                                .addContainerGap(385, Short.MAX_VALUE)));
        WorkAreaLayout.setVerticalGroup(
                WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WorkAreaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)
                                .addGap(29, 29, 29)
                                .addComponent(jButton3)
                                .addGap(28, 28, 28)
                                .addComponent(jButton4)
                                .addContainerGap(238, Short.MAX_VALUE)));

        add(WorkArea, "card7");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        Service.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Unit  No.", "Res. Name", "Type", "Message", "Status", "Feedback"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(Service);
        if (Service.getColumnModel().getColumnCount() > 0) {
            Service.getColumnModel().getColumn(0).setResizable(false);
            Service.getColumnModel().getColumn(1).setResizable(false);
            Service.getColumnModel().getColumn(2).setResizable(false);
            Service.getColumnModel().getColumn(3).setResizable(false);
            Service.getColumnModel().getColumn(4).setResizable(false);
            Service.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Concierge Service Request Area");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Packaging");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Pest Control");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Maintenance");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Send Service Request To Enterprise");

        javax.swing.GroupLayout ServiceRequestLayout = new javax.swing.GroupLayout(ServiceRequest);
        ServiceRequest.setLayout(ServiceRequestLayout);
        ServiceRequestLayout.setHorizontalGroup(
                ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addGroup(ServiceRequestLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 822,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnBack))
                                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                                .addGap(254, 254, 254)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 332,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(12, Short.MAX_VALUE)));
        ServiceRequestLayout.setVerticalGroup(
                ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ServiceRequestLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(130, Short.MAX_VALUE)));

        add(ServiceRequest, "card3");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Packages");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PackageLayout = new javax.swing.GroupLayout(Package);
        Package.setLayout(PackageLayout);
        PackageLayout.setHorizontalGroup(
                PackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PackageLayout.createSequentialGroup()
                                .addGroup(PackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PackageLayout.createSequentialGroup()
                                                .addGap(330, 330, 330)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PackageLayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(btnBack1)))
                                .addContainerGap(420, Short.MAX_VALUE)));
        PackageLayout.setVerticalGroup(
                PackageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PackageLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack1)
                                .addContainerGap(423, Short.MAX_VALUE)));

        add(Package, "card4");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enquries");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack2.setText("BACK");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnquriesLayout = new javax.swing.GroupLayout(Enquries);
        Enquries.setLayout(EnquriesLayout);
        EnquriesLayout.setHorizontalGroup(
                EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EnquriesLayout.createSequentialGroup()
                                .addGroup(EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(EnquriesLayout.createSequentialGroup()
                                                .addGap(330, 330, 330)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(EnquriesLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(btnBack2)))
                                .addContainerGap(420, Short.MAX_VALUE)));
        EnquriesLayout.setVerticalGroup(
                EnquriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EnquriesLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack2)
                                .addContainerGap(423, Short.MAX_VALUE)));

        add(Enquries, "card5");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Complaints");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack3.setText("BACK");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComplaintsLayout = new javax.swing.GroupLayout(Complaints);
        Complaints.setLayout(ComplaintsLayout);
        ComplaintsLayout.setHorizontalGroup(
                ComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ComplaintsLayout.createSequentialGroup()
                                .addContainerGap(412, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338))
                        .addGroup(ComplaintsLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnBack3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        ComplaintsLayout.setVerticalGroup(
                ComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ComplaintsLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(btnBack3)
                                .addContainerGap(417, Short.MAX_VALUE)));

        add(Complaints, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(true);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(true);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(false);
        Enquries.setVisible(true);

        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage("Enquiry Check");
        request.setSender(account);
        request.setStatus("Sent");

        if (par != null) {
            System.out.println(par.getWorkQueue().getWorkRequestList() + "    bjdsvsbdvk");
            par.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
        }

        JOptionPane.showMessageDialog(null, "Request for enq message sent");
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(true);
        WorkArea.setVisible(false);
        Enquries.setVisible(false);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }// GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }// GEN-LAST:event_btnBack1ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }// GEN-LAST:event_btnBack2ActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        Package.setVisible(false);
        Complaints.setVisible(false);
        WorkArea.setVisible(true);
        Enquries.setVisible(false);
    }// GEN-LAST:event_btnBack3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        int selectedRow = Service.getSelectedRow();
        if (selectedRow >= 0) {
            String request = (String) Service.getValueAt(selectedRow, 3);
            WorkRequest wok = null;
            for (WorkRequest wkk : par.getWorkQueue().getWorkRequestList()) {
                if (wkk.getMessage().equals(request)) {
                    wok = wkk;
                } else {
                    JOptionPane.showMessageDialog(null, "Can not find work request.");
                    return;
                }
            }
            if (wok != null) {
                Enterprise ent = null;
                for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof MaintenanceTeamEnterprise) {

                        ent = enter;
                        break;
                    }
                }
                if (ent != null) {

                    ent.getWorkQueue().getWorkRequestList().add(wok);
                    wok.setSender2(account);
                    JOptionPane.showMessageDialog(null, "Service request Sent to MaintenanceTeamEnterprise ");

                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }// GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        int selectedRow = Service.getSelectedRow();
        if (selectedRow >= 0) {
            String request = (String) Service.getValueAt(selectedRow, 3);

            WorkRequest wok2 = null;
            for (WorkRequest wkk1 : par.getWorkQueue().getWorkRequestList()) {
                if (wkk1.getMessage().equals(request)) {
                    wok2 = wkk1;
                } else {
                    JOptionPane.showMessageDialog(null, "Can not find work request.");
                    return;
                }
            }
            if (wok2 != null) {
                Enterprise ent1 = null;
                for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof PackagingTeamEnterprise) {

                        ent1 = enter;
                        break;
                    }
                }
                if (ent1 != null) {

                    ent1.getWorkQueue().getWorkRequestList().add(wok2);
                    wok2.setSender2(account);
                    JOptionPane.showMessageDialog(null, "Service request Sent to PackagingTeamEnterprise ");

                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }

    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int selectedRow = Service.getSelectedRow();
        if (selectedRow >= 0) {
            String request = (String) Service.getValueAt(selectedRow, 3);

            WorkRequest wok3 = null;
            for (WorkRequest wkk2 : par.getWorkQueue().getWorkRequestList()) {
                if (wkk2.getMessage().equals(request)) {
                    wok3 = wkk2;
                } else {
                    JOptionPane.showMessageDialog(null, "Can not find work request.");
                    return;
                }
            }
            if (wok3 != null) {
                Enterprise ent1 = null;
                for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof PestControlEnterprise) {

                        ent1 = enter;
                        break;
                    }
                }
                if (ent1 != null) {

                    ent1.getWorkQueue().getWorkRequestList().add(wok3);
                    wok3.setSender2(account);
                    JOptionPane.showMessageDialog(null, "Service request Sent to PestControlEnterprise ");

                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }

    }// GEN-LAST:event_jButton6ActionPerformed

    public void populate() {
        DefaultTableModel model = (DefaultTableModel) Service.getModel();
        model.setRowCount(0);

        if (par != null) {
            for (WorkRequest work : par.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[6];
                row[0] = work.getSender().id;
                row[1] = work.getSender();
                row[2] = work.getType();
                row[3] = work.getMessage();
                row[4] = work.getStatus();

                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Enterprise Workqueue");
        }
    }

    public void check() {
        LabTestWorkRequest request = new LabTestWorkRequest();
        request.setMessage("Maintain Check");
        request.setSender(account);
        request.setStatus("Sent");

        Enterprise ent = null;
        for (Enterprise enter : business.getEnterpriseDirectory().getEnterpriseList()) {

            if (enter instanceof MaintenanceTeamEnterprise) {

                ent = enter;
                break;
            }
        }
        if (ent != null) {
            System.out.println(ent.getName() + "amrish lord");
            System.out.println(ent.getOrganisationDirectory().toString());
            ent.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Complaints;
    private javax.swing.JPanel Enquries;
    private javax.swing.JPanel Package;
    private javax.swing.JTable Service;
    private javax.swing.JPanel ServiceRequest;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
