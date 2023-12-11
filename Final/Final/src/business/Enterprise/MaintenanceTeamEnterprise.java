
package business.Enterprise;

import business.Role.CleaningRole;
import business.Role.ElectricianTeamRole;
import business.Role.PlumbingRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class MaintenanceTeamEnterprise extends Enterprise{

    public MaintenanceTeamEnterprise() {
        super(Type.Maintenance_Team.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ElectricianTeamRole());
        roles.add(new PlumbingRole());
        roles.add(new CleaningRole());
        return roles;
    }
     
}