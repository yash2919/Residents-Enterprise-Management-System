
package business;

import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Organization.BuildingTeamOrganization;
import business.Role.ConciergeRole;
import business.Role.LeasingTeam;

/**
 *
 * 
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Employee employee = new Employee();
        employee.setName("Team Titans");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.isPasswordValid("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        // Creating a new Building
        BuildingTeamOrganization buildingOrg= new BuildingTeamOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(buildingOrg);
        Employee employee2 = new Employee();
        employee2.setName("Building Employer");
         UserAccount account2 = new UserAccount();
         account2.setUsername("Build1");
         account2.isPasswordValid("Build1");
         account2.setRole(new LeasingTeam());
         account2.setEmployee(employee2);
         buildingOrg.getEmployeeDirectory().getEmployeeList().add(employee2);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account2);
   
         UserAccount account3 = new UserAccount();
         account3.setUsername("Build2");
         account3.isPasswordValid("Build2");
         account3.setRole(new LeasingTeam());
         account3.setEmployee(employee2);
         
         UserAccount account4 = new UserAccount();
         account4.setUsername("Build3");
         account4.isPasswordValid("Build3");
         account4.setRole(new LeasingTeam());
         account4.setEmployee(employee2);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account3);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account4);
         
         
         
         UserAccount account5 = new UserAccount();
         account5.setUsername("Build4");
         account5.isPasswordValid("Build4");
         account5.setRole(new ConciergeRole());
         account5.setEmployee(employee2);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account5);
         
         
         UserAccount account6 = new UserAccount();
         account6.setUsername("Build5");
         account6.isPasswordValid("Build5");
         account6.setRole(new ConciergeRole());
         account6.setEmployee(employee2);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account6);
         
         
         UserAccount account7 = new UserAccount();
         account7.setUsername("Build6");
         account7.isPasswordValid("Build6");
         account7.setRole(new ConciergeRole());
         account7.setEmployee(employee2);
         buildingOrg.getUserAccountDirectory().getUserAccountList().add(account7);
        
         
         
         
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        
        return business;
    }
    
}
