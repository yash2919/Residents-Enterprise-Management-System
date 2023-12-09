
package business.Enterprise;

import business.Role.AdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * 
 */
public class AdminOrganization extends Enterprise{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}