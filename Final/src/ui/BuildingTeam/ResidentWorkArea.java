/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BuildingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uttkarsh
 */
public class ResidentWorkArea extends javax.swing.JPanel {
JPanel userProcessContainer;
UserAccount account;
Business business;
BuildingTeamEnterprise par;

    /**
     * Creates new form ResidentWorkArea
     */
    public ResidentWorkArea(JPanel userProcessContainer, UserAccount account, BuildingTeamEnterprise par, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.par=par;
        this.business=business;
        
        populate();
                     populateLease();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        WorkArea = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        ServiceRequest = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Service = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        type = new javax.swing.JTextField();
        message = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        applease = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Service1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnSubmit1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Residents Work Area");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setText("Raise Service Request");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Raise complaint");

        jButton8.setText("Submit Lease Docs");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Manage Payments");

        jButton10.setText("Check Packages");

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WorkAreaLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(WorkAreaLayout.createSequentialGroup()
                                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(125, 125, 125)
                                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7)
                                    .addComponent(jButton9))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(29, 29, 29)
                .addGroup(WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(30, 30, 30)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        add(WorkArea, "card2");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Residents Raise Service Request");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Service.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Type", "Message", "Status", "Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Service);
        if (Service.getColumnModel().getColumnCount() > 0) {
            Service.getColumnModel().getColumn(0).setResizable(false);
            Service.getColumnModel().getColumn(1).setHeaderValue("Message");
            Service.getColumnModel().getColumn(2).setResizable(false);
            Service.getColumnModel().getColumn(3).setResizable(false);
            Service.getColumnModel().getColumn(3).setHeaderValue("Feedback");
        }

        jLabel1.setText("MESSAGE :");

        jLabel4.setText("TYPE :");

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServiceRequestLayout = new javax.swing.GroupLayout(ServiceRequest);
        ServiceRequest.setLayout(ServiceRequestLayout);
        ServiceRequestLayout.setHorizontalGroup(
            ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceRequestLayout.createSequentialGroup()
                .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServiceRequestLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServiceRequestLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ServiceRequestLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ServiceRequestLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServiceRequestLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ServiceRequestLayout.setVerticalGroup(
            ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceRequestLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ServiceRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        add(ServiceRequest, "card3");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Submit Lease Docs");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Service1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Service1);
        if (Service1.getColumnModel().getColumnCount() > 0) {
            Service1.getColumnModel().getColumn(0).setResizable(false);
            Service1.getColumnModel().getColumn(1).setResizable(false);
            Service1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSubmit1.setText("SUBMIT");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appleaseLayout = new javax.swing.GroupLayout(applease);
        applease.setLayout(appleaseLayout);
        appleaseLayout.setHorizontalGroup(
            appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appleaseLayout.createSequentialGroup()
                .addGroup(appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appleaseLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(appleaseLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(appleaseLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(appleaseLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jButton2)))
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        appleaseLayout.setVerticalGroup(
            appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appleaseLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(appleaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(appleaseLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(376, 376, 376)
                    .addComponent(jButton2)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        add(applease, "card4");
    }// </editor-fold>                        
    public void populate(){
        DefaultTableModel model = (DefaultTableModel) Service.getModel();
        model.setRowCount(0);
        int i=0;
        for(WorkRequest work:account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0]=i;
            row[0] = work.getType();
            row[1]=work.getMessage();
            row[2]=work.getStatus();
            i++;
            
            model.addRow(row);
            
        }
 
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        LabTestWorkRequest request= new LabTestWorkRequest();
        
        request.setType(type.getText());
        request.setMessage(message.getText());
        request.setStatus("Sent");
        request.setSender(account);
        
        if(par!=null){
            par.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Service Request Added!");
             populate();
        }else{
            JOptionPane.showMessageDialog(null,"No Enterprise");
        }
        
        
        
    }                                         

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        applease.setVisible(false);
        ServiceRequest.setVisible(true);
        WorkArea.setVisible(false);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        ServiceRequest.setVisible(false);
        WorkArea.setVisible(true);
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
               applease.setVisible(true);
        ServiceRequest.setVisible(false);
        WorkArea.setVisible(false);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
         DefaultTableModel model = (DefaultTableModel) Service1.getModel();
         if( (model.getRowCount()<1) || (model.getValueAt(0, 2)!=null && model.getValueAt(0, 2).equals("submit again") && (model.getRowCount()<=1)) ){
        LabTestWorkRequest request= new LabTestWorkRequest();
        
        request.setType("lease");
       // request.setMessage(message.getText());
        request.setStatus("sent");
        request.setSender(account);
        
        if(par!=null){
            par.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"Lease Request Added!");
             populateLease();
        }else{
            JOptionPane.showMessageDialog(null,"No Enterprise");
        }
         }
         else if(model.getValueAt(0, 2).equals("sent")|| (model.getValueAt(1, 2)!=null &&model.getValueAt(1, 2).equals("sent"))){
              JOptionPane.showMessageDialog(null,"Your documents are in process with Lease Team");
         }
           else if(model.getValueAt(0, 2).equals("approved") ||(model.getValueAt(1, 2)!=null &&model.getValueAt(1, 2).equals("approved"))){
              JOptionPane.showMessageDialog(null,"Your documents are Approved by the Lease Team");
         }
           
         
        
    }                                          

    
    

    // Variables declaration - do not modify                     
    private javax.swing.JTable Service;
    private javax.swing.JTable Service1;
    private javax.swing.JPanel ServiceRequest;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JPanel applease;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField message;
    private javax.swing.JTextField type;
    // End of variables declaration                   

 public void populateLease(){
        DefaultTableModel model = (DefaultTableModel) Service1.getModel();
        model.setRowCount(0);
        int i=1;
        for(WorkRequest work:account.getWorkQueue().getWorkRequestList()){
            if(work.getType().equals("lease")){
            Object[] row = new Object[4];
            row[0]=i;
            row[1] = work.getType();
         //   row[1]=work.getMessage();
            row[2]=work.getStatus();
            i++;
            
            model.addRow(row);
            }
        }
 
    }
}
