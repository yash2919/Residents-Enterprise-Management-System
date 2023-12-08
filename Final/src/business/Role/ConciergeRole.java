package business.Role;

import business.Business;
import business.Organization.BuildingTeamOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BuildingTeam.ConciergeWorkArea;

public class ConciergeRole extends Role {

    public ConciergeRole() {
        this.type = Role.RoleType.Concierge;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = Role.RoleType.Concierge;
        return new ConciergeWorkArea(userProcessContainer, account, (BuildingTeamOrganization) organization, business);
    }

}
