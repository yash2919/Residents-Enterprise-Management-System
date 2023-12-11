
package business.UserAccount;

import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.Role.Role;
import business.WorkQueue.WorkQueue;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * 
 */
public class UserAccount {
    
    private String username;
//    private String password;
    private Organisation organisation;

       public Integer id=-1;
    private boolean validate=false;
    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }


    private Role role;
    private WorkQueue workQueue;
    private ArrayList<String> historyPass;
    

    public UserAccount() {
         historyPass=new ArrayList<String>();
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
    
        public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    // Getter and Setter for validate
    public boolean isValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public Role getRole() {
        return role;
    }

    public void setOr(Organisation employee) {
        this.organisation = organisation;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Organisation getOrgantisation() {
        return organisation;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
            public ArrayList<String> getHistoryPass() {
        return historyPass;
    }

    public void setHistoryPass(ArrayList<String> historyPass) {
        this.historyPass = historyPass;
    }
    
    
        public boolean isPasswordValid(String newPassword) {
        String hashedPassword = hashPassword(newPassword);
        if (historyPass.contains(hashedPassword)) {
            return false; // Password has been used before
        }
        historyPass.add(hashedPassword);
        return true;
    }
    
        public boolean login(String enteredPassword) {
        if (historyPass.isEmpty()) {
            return false; 
        }

        String hashedEnteredPassword = hashPassword(enteredPassword);
        String latestPasswordHash = historyPass.get(historyPass.size() - 1);
       
        return latestPasswordHash.equals(hashedEnteredPassword);
    }
    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hashBytes) {
                hexHash.append(String.format("%02x", b));
            }
       
            
            return hexHash.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return username;
    }

}