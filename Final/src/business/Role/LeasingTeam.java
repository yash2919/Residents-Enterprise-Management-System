
package business.Role;

import business.Business;
import business.Organization.BuildingTeamOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.BuildingTeam.LeasingTeamWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class LeasingTeam extends Role {

    public LeasingTeam() {
        this.type = RoleType.LeasingTeam;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.LeasingTeam;
        return new LeasingTeamWorkAreaJPanel(userProcessContainer, account, (BuildingTeamOrganization) organization, business);
    }

}
