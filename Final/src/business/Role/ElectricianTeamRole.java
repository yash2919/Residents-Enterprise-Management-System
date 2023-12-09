
package business.Role;

import business.Business;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.Enterprise;
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
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        this.type = Role.RoleType.Electrician;
        return new ElectricianWorkArea(userProcessContainer, account, (MaintenanceTeamEnterprise) organization, business);
    }

}
