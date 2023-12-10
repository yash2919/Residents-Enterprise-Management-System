
package business.Role;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.PestControlEnterprise;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PestControlTeam.MiticidesTeamWorkArea;

/**
 *
 * 
 */
public class MiticidesTeamRole extends Role {

    public MiticidesTeamRole() {
        this.type = Role.RoleType.MiticidesTeam;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        
        this.type = Role.RoleType.MiticidesTeam;
        return new MiticidesTeamWorkArea(userProcessContainer, account,(PestControlEnterprise) organization, business);
    }

}
