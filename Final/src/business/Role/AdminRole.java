
package business.Role;

import business.Business;
import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import ui.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class AdminRole extends Role{

    public AdminRole(){
        this.type = RoleType.Admin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        
        return new AdminWorkAreaJPanel(userProcessContainer, Business.getInstance());
    }

    
    
}
