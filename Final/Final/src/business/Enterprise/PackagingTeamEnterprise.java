
package business.Enterprise;


import business.Role.DeliveryGuy;
import business.Role.Supervisor;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class PackagingTeamEnterprise extends Enterprise{

    public PackagingTeamEnterprise() {
        super(Type.Packaging_Team.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Supervisor());
        roles.add(new DeliveryGuy());
        
        return roles;
    }
     
   
    
    
}
