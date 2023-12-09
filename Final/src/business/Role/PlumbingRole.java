
package business.Role;

import business.Business;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.Enterprise;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.MaintenanceTeam.PlumberWorkArea;

/**
 *
 * 
 */
public class PlumbingRole extends Role {

    public PlumbingRole() {
        this.type = Role.RoleType.Plumbing;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        this.type = Role.RoleType.Plumbing;
        return new PlumberWorkArea(userProcessContainer, account, (MaintenanceTeamEnterprise) organization, business);
    }

}
