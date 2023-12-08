
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.Organization.PackagingTeamOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PackagingTeam.DeliveryGuyWorkArea;
import ui.PackagingTeam.SupervisorWorkArea;

/**
 *
 * 
 */
public class DeliveryGuy extends Role {

    public DeliveryGuy() {
        this.type = Role.RoleType.DeliveryGuy;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = Role.RoleType.DeliveryGuy;
        
        return new DeliveryGuyWorkArea(userProcessContainer, account, (PackagingTeamOrganization) organization, business);
    }

}
