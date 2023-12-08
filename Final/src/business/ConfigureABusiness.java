
package business;

import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;

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
        account.setPassword("admin");
        account.setRole(new AdminRole());
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return business;
    }
    
}
