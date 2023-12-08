
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.Organization.PestControlOrganization;
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
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        
        this.type = Role.RoleType.MicrobialTeam;
        return new MicrobialTeamWorkArea(userProcessContainer, account,(PestControlOrganization) organization, business);
    }

}
