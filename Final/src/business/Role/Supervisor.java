
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.Organization.PackagingTeamOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PackagingTeam.SupervisorWorkArea;

/**
 *
 * 
 */
public class Supervisor extends Role {

    public Supervisor() {
        this.type = Role.RoleType.Superviser;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = Role.RoleType.Superviser;
        
        return new SupervisorWorkArea(userProcessContainer, account, (PackagingTeamOrganization) organization, business);
    }

}
