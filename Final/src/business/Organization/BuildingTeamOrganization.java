
package business.Organization;

import business.Role.ConciergeRole;
import business.Role.LeasingTeam;
import business.Role.ResidentRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class BuildingTeamOrganization extends Organization{

    public BuildingTeamOrganization() {
        super(Organization.Type.Building_Team.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LeasingTeam());
        roles.add(new ConciergeRole());
        roles.add(new ResidentRole());
        
        return roles;
    }
     
}