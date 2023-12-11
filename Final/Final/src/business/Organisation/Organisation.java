/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.UserAccount.UserAccountDirectory;

/**
 * 
 *
 * 
 */
public class Organisation {
    
    private String name;
    private int id;
    private static int count = 1;
    private UserAccountDirectory userAccountDirectory;
    

    public Organisation() {
         userAccountDirectory = new UserAccountDirectory();
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
        public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
