
package business.Role;

import business.Business;
import business.Organization.MaintenanceTeamOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.MaintenanceTeam.ElectricianWorkArea;

/**
 *
 * 
 */
public class ElectricianTeamRole extends Role {

    public ElectricianTeamRole() {
        this.type = Role.RoleType.Electrician;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = Role.RoleType.Electrician;
        return new ElectricianWorkArea(userProcessContainer, account, (MaintenanceTeamOrganization) organization, business);
    }

}
