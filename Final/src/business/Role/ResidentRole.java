
package business.Role;

import business.Business;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.Enterprise;
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
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        this.type = Role.RoleType.Residents;
        return new ResidentWorkArea(userProcessContainer, account, (BuildingTeamEnterprise) organization, business);
    }

}
