
package business;

import business.Employee.Employee;
import business.Organization.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Organization.BuildingTeamOrganization;
import business.Organization.MaintenanceTeamOrganization;
import business.Organization.PackagingTeamOrganization;
import business.Organization.PestControlOrganization;
import business.Role.CleaningRole;
import business.Role.ConciergeRole;
import business.Role.DeliveryGuy;
import business.Role.ElectricianTeamRole;
import business.Role.InsectisidesTeamRole;
import business.Role.LeasingTeam;
import business.Role.MicrobialTeamRole;
import business.Role.MiticidesTeamRole;
import business.Role.PlumbingRole;
import business.Role.ResidentRole;
import business.Role.Supervisor;

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
        // Creating a new Building Organisation and Users
        
        
        
        BuildingTeamOrganization buildingOrg= new BuildingTeamOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(buildingOrg);
        Employee employee2 = new Employee();
        employee2.setName("Building Employer");
        buildingOrg.getEmployeeDirectory().getEmployeeList().add(employee2);
        buildingOrg.getUserAccountDirectory().createUserAccount("Build1","Build1",employee2,new LeasingTeam());         
        buildingOrg.getUserAccountDirectory().createUserAccount("Build2","Build2",employee2,new LeasingTeam());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build3","Build3",employee2,new LeasingTeam());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build4","Build4",employee2,new ConciergeRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build5","Build5",employee2,new ConciergeRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build6","Build6",employee2,new ConciergeRole());         
        buildingOrg.getUserAccountDirectory().createUserAccount("Build7","Build7",employee2,new ResidentRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build8","Build8",employee2,new ResidentRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Build9", "Build9", employee2, new ResidentRole());
        
        
        
        
        // Creating a new Pest Control and Users
        
        PestControlOrganization pestControl=new PestControlOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(pestControl);
        Employee employee3 = new Employee();
        employee3.setName("Pest Control Employer");
        pestControl.getEmployeeDirectory().getEmployeeList().add(employee3);
        pestControl.getUserAccountDirectory().createUserAccount("Pest1","Pest1",employee3,new InsectisidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Pest2","Pest2",employee3,new InsectisidesTeamRole()); 
        pestControl.getUserAccountDirectory().createUserAccount("Pest3","Pest3",employee3,new InsectisidesTeamRole()); 
//        MiticidesTeamRole
        pestControl.getUserAccountDirectory().createUserAccount("Pest4","Pest4",employee3,new MiticidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Pest5","Pest5",employee3,new MiticidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Pest6","Pest6",employee3,new MiticidesTeamRole());
        
        // MicrobialTeamRole
        pestControl.getUserAccountDirectory().createUserAccount("Pest7","Pest7",employee3,new MicrobialTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Pest8","Pest8",employee3,new MicrobialTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Pest9","Pest9",employee3,new MicrobialTeamRole());
        
        
        
        MaintenanceTeamOrganization maintenance=new MaintenanceTeamOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(maintenance);
        Employee employee4 = new Employee();
        employee4.setName("Maintenance Employer");
        maintenance.getEmployeeDirectory().getEmployeeList().add(employee4);
        maintenance.getUserAccountDirectory().createUserAccount("Main1","Main1",employee4,new ElectricianTeamRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main2","Main2",employee4,new ElectricianTeamRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main3","Main3",employee4,new ElectricianTeamRole());
        //PlumbingRole
        maintenance.getUserAccountDirectory().createUserAccount("Main4","Main4",employee4,new PlumbingRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main5","Main5",employee4,new PlumbingRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main6","Main6",employee4,new PlumbingRole());
        //CleaningRole
        maintenance.getUserAccountDirectory().createUserAccount("Main7","Main7",employee4,new CleaningRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main8","Main8",employee4,new CleaningRole());
        maintenance.getUserAccountDirectory().createUserAccount("Main8","Main8",employee4,new CleaningRole());
        
        
        // Creating PackagingTeamOrganization and users
        
        PackagingTeamOrganization packingTeam = new PackagingTeamOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(packingTeam);
        Employee employee5 = new Employee();
        employee5.setName("Maintenance Employer");
        packingTeam.getEmployeeDirectory().getEmployeeList().add(employee5);
        packingTeam.getUserAccountDirectory().createUserAccount("Elec1","Elec1",employee5,new Supervisor());
        packingTeam.getUserAccountDirectory().createUserAccount("Elec2","Elec2",employee5,new Supervisor());
        packingTeam.getUserAccountDirectory().createUserAccount("Elec3","Elec3",employee5,new Supervisor());
        
       //DeliveryGuy
       packingTeam.getUserAccountDirectory().createUserAccount("Elec4","Elec4",employee5,new DeliveryGuy());
       packingTeam.getUserAccountDirectory().createUserAccount("Elec5","Elec5",employee5,new DeliveryGuy());
       packingTeam.getUserAccountDirectory().createUserAccount("Elec6","Elec6",employee5,new DeliveryGuy());
       
        
        
        
        
        
        
        
         
        
        
        
        
        
        
         
         
         
         
         
         
         
         
         
         
         
        
         
         
         
         
         
         
        
        
        
        
        
        
        
        
        
        
        
        
        return business;
    }
    
}
