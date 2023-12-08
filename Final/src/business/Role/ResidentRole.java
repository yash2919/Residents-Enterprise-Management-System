
package business.Role;

import business.Business;
import business.Organization.BuildingTeamOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BuildingTeam.ResidentWorkArea;

/**
 *
 * 
 */
public class ResidentRole extends Role {

    public ResidentRole() {
        this.type = Role.RoleType.Residents;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = Role.RoleType.Residents;
        return new ResidentWorkArea(userProcessContainer, account, (BuildingTeamOrganization) organization, business);
    }

}
