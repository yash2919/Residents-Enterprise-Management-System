/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.InsectisidesTeamRole;
import business.Role.MicrobialTeamRole;
import business.Role.MiticidesTeamRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PestControlOrganization extends Organization{

    public PestControlOrganization() {
        super(Organization.Type.Pest_Control_Organisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsectisidesTeamRole());
        roles.add(new MiticidesTeamRole());
        roles.add(new MicrobialTeamRole());
      
        return roles;
    }
     
   
    
    
}
