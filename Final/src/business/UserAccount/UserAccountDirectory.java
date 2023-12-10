
package business.UserAccount;

import business.Organisation.Organisation;
import business.Role.ResidentRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.login(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Organisation org, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.isPasswordValid(password);
        userAccount.setOrganisation(org);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createResAccount(String username, String password, Integer id, Organisation org, Role role){
        
                UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.isPasswordValid(password);
        userAccount.setOrganisation(org);
        userAccount.setRole(role);
        userAccount.setId(id);
        userAccountList.add(userAccount);
        return userAccount;
          }
}
