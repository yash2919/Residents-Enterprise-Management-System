
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.Organization.PestControlOrganization;
import business.UserAccount.UserAccount;
import ui.PestControlTeam.InsectisidesTeamWorkArea;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class InsectisidesTeamRole extends Role {

    public InsectisidesTeamRole() {
        this.type = RoleType.InsectisidesTeam;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.InsectisidesTeam;
        return new InsectisidesTeamWorkArea(userProcessContainer, account,(PestControlOrganization) organization, business);
    }

}
