/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Enterprise.Enterprise.Type;
import business.Role.ElectricianTeamRole;
import business.Role.Supervisor;
import java.util.ArrayList;

/**
 *
 * 
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> organizationList;

    public EnterpriseDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getOrganizationList() {
        return organizationList;
    }
    
    public Enterprise createOrganization(Type type){
        Enterprise organization = null;
        if (type.getValue().equals(Type.Building_Team.getValue())){
            organization = new BuildingTeamEnterprise();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pest_Control_Organisation.getValue())){
            organization = new PestControlEnterprise();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Maintenance_Team.getValue())){
            organization = new MaintenanceTeamEnterprise();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Packaging_Team.getValue())){
            organization = new PackagingTeamEnterprise();
            organizationList.add(organization);
        }
        return organization;
    }
}