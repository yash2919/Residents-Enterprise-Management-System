
package business;

import business.Organisation.Organisation;
import business.Enterprise.AdminOrganization;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.PackagingTeamEnterprise;
import business.Enterprise.PestControlEnterprise;
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
        
        Organisation organisation = new Organisation();
        organisation.setName("Team Titans");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.isPasswordValid("admin");
        account.setRole(new AdminRole());
        account.setEmployee(organisation);
        
        adminOrganization.getOrganisationDirectory().getOrganisationList().add(organisation);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        // Creating a new Building Organisation and Users
        
        
        
        BuildingTeamEnterprise buildingOrg= new BuildingTeamEnterprise();
        business.getOrganizationDirectory().getOrganizationList().add(buildingOrg);
        Organisation org2 = new Organisation();
        org2.setName("JVue");
        buildingOrg.getOrganisationDirectory().getOrganisationList().add(org2);
        buildingOrg.getUserAccountDirectory().createUserAccount("Lease1","Lease1",org2,new LeasingTeam());         
        buildingOrg.getUserAccountDirectory().createUserAccount("Lease2","Lease2",org2,new LeasingTeam());
        buildingOrg.getUserAccountDirectory().createUserAccount("Lease3","Lease3",org2,new LeasingTeam());
        buildingOrg.getUserAccountDirectory().createUserAccount("Concierge1","Concierge1",org2,new ConciergeRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Concierge2","Concierge2",org2,new ConciergeRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Concierge3","Concierge3",org2,new ConciergeRole());         
        buildingOrg.getUserAccountDirectory().createUserAccount("Resident1","Resident1",org2,new ResidentRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Resident2","Resident2",org2,new ResidentRole());
        buildingOrg.getUserAccountDirectory().createUserAccount("Resident3", "Resident3", org2, new ResidentRole());
        
        
        
        
        // Creating a new Pest Control and Users
        
        PestControlEnterprise pestControl=new PestControlEnterprise();
        business.getOrganizationDirectory().getOrganizationList().add(pestControl);
        Organisation org3 = new Organisation();
        org3.setName("Pest Control");
        pestControl.getOrganisationDirectory().getOrganisationList().add(org3);
        pestControl.getUserAccountDirectory().createUserAccount("Insect1","Insect1",org3,new InsectisidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Insect2","Insect2",org3,new InsectisidesTeamRole()); 
        pestControl.getUserAccountDirectory().createUserAccount("Insect3","Insect3",org3,new InsectisidesTeamRole()); 
//        MiticidesTeamRole
        pestControl.getUserAccountDirectory().createUserAccount("Mite1","Mite1",org3,new MiticidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Mite2","Mite2",org3,new MiticidesTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Mite3","Mite3",org3,new MiticidesTeamRole());
        
        // MicrobialTeamRole
        pestControl.getUserAccountDirectory().createUserAccount("Micro1","Micro1",org3,new MicrobialTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Micro2","Micro2",org3,new MicrobialTeamRole());
        pestControl.getUserAccountDirectory().createUserAccount("Micro3","Micro3",org3,new MicrobialTeamRole());
        
        
        
        MaintenanceTeamEnterprise maintenance=new MaintenanceTeamEnterprise();
        business.getOrganizationDirectory().getOrganizationList().add(maintenance);
        Organisation org4 = new Organisation();
        org4.setName("Maintenance");
        maintenance.getOrganisationDirectory().getOrganisationList().add(org4);
        maintenance.getUserAccountDirectory().createUserAccount("Electric1","Electric1",org4,new ElectricianTeamRole());
        maintenance.getUserAccountDirectory().createUserAccount("Electric2","Electric2",org4,new ElectricianTeamRole());
        maintenance.getUserAccountDirectory().createUserAccount("Electric3","Electric3",org4,new ElectricianTeamRole());
        //PlumbingRole
        maintenance.getUserAccountDirectory().createUserAccount("Plumb1","Plumb1",org4,new PlumbingRole());
        maintenance.getUserAccountDirectory().createUserAccount("Plumb2","Plumb2",org4,new PlumbingRole());
        maintenance.getUserAccountDirectory().createUserAccount("Plumb3","Plumb3",org4,new PlumbingRole());
        //CleaningRole
        maintenance.getUserAccountDirectory().createUserAccount("Clean1","Clean1",org4,new CleaningRole());
        maintenance.getUserAccountDirectory().createUserAccount("Clean2","Clean2",org4,new CleaningRole());
        maintenance.getUserAccountDirectory().createUserAccount("Clean3","Clean3",org4,new CleaningRole());
        
        
        // Creating PackagingTeamOrganization and users
        
        PackagingTeamEnterprise packingTeam = new PackagingTeamEnterprise();
        business.getOrganizationDirectory().getOrganizationList().add(packingTeam);
        Organisation org5 = new Organisation();
        org5.setName("Maintenance Employer");
        packingTeam.getOrganisationDirectory().getOrganisationList().add(org5);
        packingTeam.getUserAccountDirectory().createUserAccount("Supervisor1","Supervisor1",org5,new Supervisor());
        packingTeam.getUserAccountDirectory().createUserAccount("Supervisor2","Supervisor2",org5,new Supervisor());
        packingTeam.getUserAccountDirectory().createUserAccount("Supervisor3","Supervisor3",org5,new Supervisor());
        
       //DeliveryGuy
       packingTeam.getUserAccountDirectory().createUserAccount("Deli1","Deli1",org5,new DeliveryGuy());
       packingTeam.getUserAccountDirectory().createUserAccount("Deli2","Deli2",org5,new DeliveryGuy());
       packingTeam.getUserAccountDirectory().createUserAccount("Deli3","Deli3",org5,new DeliveryGuy());
            
    return business;
    }
    
}
