
package business.Role;

import business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.PestControlEnterprise;
import business.UserAccount.UserAccount;
import ui.PestControlTeam.InsectisidesTeamWorkArea;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class InsectisidesTeamRole extends Role {

    public InsectisidesTeamRole() {
        this.type = RoleType.InsectisidesTeam;
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise organization, Business business) {
        this.type = RoleType.InsectisidesTeam;
        return new InsectisidesTeamWorkArea(userProcessContainer, account,(PestControlEnterprise) organization, business);
    }

}
