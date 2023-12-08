/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Organization.Organization.Type;
import business.Role.ElectricianTeamRole;
import business.Role.Supervisor;
import java.util.ArrayList;

/**
 *
 * 
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Building_Team.getValue())){
            organization = new BuildingTeamOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pest_Control_Organisation.getValue())){
            organization = new PestControlOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Maintenance_Team.getValue())){
            organization = new MaintenanceTeamOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Packaging_Team.getValue())){
            organization = new PackagingTeamOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}