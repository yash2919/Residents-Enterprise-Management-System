/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BuildingTeam;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.UserAccount.UserAccount;
import business.WorkQueue.LabTestWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class LeasingTeamWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private BuildingTeamEnterprise organization;
    private Business business;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public LeasingTeamWorkAreaJPanel(JPanel workArea, UserAccount account, BuildingTeamEnterprise organization, Business business) {
        initComponents();
        
        this.workArea = workArea;
        this.organization = organization;
        this.business = business;
        this.userAccount = account;
        
       
    }
    
    
    
    
    
    
    
    
    
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    
    
      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

      
    
//       this.workArea = workArea;
//        this.organization = organization;
//        this.business = business;
//        this.userAccount = account;
//    

    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }//        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    //        int selectedRow = tblWorkRequests.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Leasing Team Work Area");
        lblTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Enquires");

        jButton2.setText("Lease Documentation");

        jButton3.setText("Residents Portal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Checking For Payments");

        jButton5.setText("Add Property To Lease");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
