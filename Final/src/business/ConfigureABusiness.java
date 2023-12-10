
package business;


import business.Enterprise.AdminEnt;
import business.Role.AdminRole;
import business.UserAccount.UserAccount;
import business.Enterprise.BuildingTeamEnterprise;
import business.Enterprise.MaintenanceTeamEnterprise;
import business.Enterprise.PackagingTeamEnterprise;
import business.Enterprise.PestControlEnterprise;
import business.Organisation.Organisation;
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
        
        AdminEnt adminent=new AdminEnt();
        business.getEnterpriseDirectory().getEnterpriseList().add(adminent);

        Organisation organisation = new Organisation();
        organisation.setName("Team Titans");
        
        adminent.getOrganisationDirectory().getOrganisationList().add(organisation);
//        UserAccount account = new UserAccount();
//        account.setUsername("admin");
//        account.isPasswordValid("admin");
//        account.setRole(new AdminRole());
//        account.setOrganisation(organisation);
        organisation.getUserAccountDirectory().createUserAccount("admin","admin",organisation,new AdminRole()); 
        
      //  organisation.getUserAccountDirectory().getUserAccountList().add(account);
        // Creating a new Building Enterprise and Users
        
        
        
        BuildingTeamEnterprise buildingEnt= new BuildingTeamEnterprise();
        business.getEnterpriseDirectory().getEnterpriseList().add(buildingEnt);
        Organisation org2 = new Organisation();
        org2.setName("JVue");
        buildingEnt.getOrganisationDirectory().getOrganisationList().add(org2);
        
        
        
        
        org2.getUserAccountDirectory().createUserAccount("Lease1","Lease1",org2,new LeasingTeam());         
        org2.getUserAccountDirectory().createUserAccount("Lease2","Lease2",org2,new LeasingTeam());
        org2.getUserAccountDirectory().createUserAccount("Lease3","Lease3",org2,new LeasingTeam());
        org2.getUserAccountDirectory().createUserAccount("Concierge1","Concierge1",org2,new ConciergeRole());
        org2.getUserAccountDirectory().createUserAccount("Concierge2","Concierge2",org2,new ConciergeRole());
        org2.getUserAccountDirectory().createUserAccount("Concierge3","Concierge3",org2,new ConciergeRole());         

        org2.getUserAccountDirectory().createResAccount("Resident1", "Resident1",1, org2, new ResidentRole());
        org2.getUserAccountDirectory().createResAccount("Resident2", "Resident2",2, org2, new ResidentRole());
        org2.getUserAccountDirectory().createResAccount("Resident3", "Resident3",3, org2, new ResidentRole());


        
        
              //  org2.getUserAccountDirectory().getUserAccountList().add(account);

        
        
        // Creating a new Pest Control and Users
        
        PestControlEnterprise pestControl=new PestControlEnterprise();
        business.getEnterpriseDirectory().getEnterpriseList().add(pestControl);
        Organisation org3 = new Organisation();
        org3.setName("Pest Control");
                //buildingEnt.getOrganisationDirectory().getOrganisationList().add(org3);

        pestControl.getOrganisationDirectory().getOrganisationList().add(org3);
        org3.getUserAccountDirectory().createUserAccount("Insect1","Insect1",org3,new InsectisidesTeamRole());
        org3.getUserAccountDirectory().createUserAccount("Insect2","Insect2",org3,new InsectisidesTeamRole()); 
        org3.getUserAccountDirectory().createUserAccount("Insect3","Insect3",org3,new InsectisidesTeamRole()); 
//        MiticidesTeamRole
        org3.getUserAccountDirectory().createUserAccount("Mite1","Mite1",org3,new MiticidesTeamRole());
        org3.getUserAccountDirectory().createUserAccount("Mite2","Mite2",org3,new MiticidesTeamRole());
        org3.getUserAccountDirectory().createUserAccount("Mite3","Mite3",org3,new MiticidesTeamRole());
        
        // MicrobialTeamRole
        org3.getUserAccountDirectory().createUserAccount("Micro1","Micro1",org3,new MicrobialTeamRole());
        org3.getUserAccountDirectory().createUserAccount("Micro2","Micro2",org3,new MicrobialTeamRole());
        org3.getUserAccountDirectory().createUserAccount("Micro3","Micro3",org3,new MicrobialTeamRole());
        
        
        
        MaintenanceTeamEnterprise maintenance=new MaintenanceTeamEnterprise();
        business.getEnterpriseDirectory().getEnterpriseList().add(maintenance);
        Organisation org4 = new Organisation();
        org4.setName("Maintenance");
        maintenance.getOrganisationDirectory().getOrganisationList().add(org4);
        org4.getUserAccountDirectory().createUserAccount("Electric1","Electric1",org4,new ElectricianTeamRole());
        org4.getUserAccountDirectory().createUserAccount("Electric2","Electric2",org4,new ElectricianTeamRole());
        org4.getUserAccountDirectory().createUserAccount("Electric3","Electric3",org4,new ElectricianTeamRole());
        //PlumbingRole
        org4.getUserAccountDirectory().createUserAccount("Plumb1","Plumb1",org4,new PlumbingRole());
        org4.getUserAccountDirectory().createUserAccount("Plumb2","Plumb2",org4,new PlumbingRole());
        org4.getUserAccountDirectory().createUserAccount("Plumb3","Plumb3",org4,new PlumbingRole());
        //CleaningRole
        org4.getUserAccountDirectory().createUserAccount("Clean1","Clean1",org4,new CleaningRole());
        org4.getUserAccountDirectory().createUserAccount("Clean2","Clean2",org4,new CleaningRole());
        org4.getUserAccountDirectory().createUserAccount("Clean3","Clean3",org4,new CleaningRole());
        
        
        // Creating PackagingTeamOrganization and users
        
        PackagingTeamEnterprise packingTeam = new PackagingTeamEnterprise();
        business.getEnterpriseDirectory().getEnterpriseList().add(packingTeam);
        Organisation org5 = new Organisation();
        org5.setName("Maintenance Employer");
        
        packingTeam.getOrganisationDirectory().getOrganisationList().add(org5);
        org5.getUserAccountDirectory().createUserAccount("Supervisor1","Supervisor1",org5,new Supervisor());
        org5.getUserAccountDirectory().createUserAccount("Supervisor2","Supervisor2",org5,new Supervisor());
        org5.getUserAccountDirectory().createUserAccount("Supervisor3","Supervisor3",org5,new Supervisor());
        
       //DeliveryGuy
       org5.getUserAccountDirectory().createUserAccount("Deli1","Deli1",org5,new DeliveryGuy());
       org5.getUserAccountDirectory().createUserAccount("Deli2","Deli2",org5,new DeliveryGuy());
       org5.getUserAccountDirectory().createUserAccount("Deli3","Deli3",org5,new DeliveryGuy());
            
    return business;
    }
    
}
