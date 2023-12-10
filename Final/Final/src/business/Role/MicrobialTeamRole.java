
package business.Role;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.PestControlEnterprise;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PestControlTeam.MicrobialTeamWorkArea;

/**
 *
 * 
 */
public class MicrobialTeamRole extends Role {

    public MicrobialTeamRole() {
        this.type = Role.RoleType.MicrobialTeam;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        
        this.type = Role.RoleType.MicrobialTeam;
        return new MicrobialTeamWorkArea(userProcessContainer, account,(PestControlEnterprise) organization, business);
    }

}
