
package business.Enterprise;

import business.Enterprise.EnterpriseDirectory;
import business.Organisation.OrganisationDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * 
 */
public abstract class Enterprise {

    private String name;
    private WorkQueue workQueue;
//    private EnterpriseDirectory EnterpriseDirectory;
    private OrganisationDirectory organisationDirectory;
    private int EnterpriseID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Enterprise") {

        },
        Building_Team("Building Enterprise"){

        },
        Pest_Control_Organisation("Pest Enterprise"){

        },
         Maintenance_Team("Maintainence Enterprise"){

        },
         Packaging_Team("Packaging Enterprise"){

        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }

    public Enterprise(String name) {
        this.name = name;
        workQueue = new WorkQueue();
//        EnterpriseDirectory = new EnterpriseDirectory();
//        userAccountDirectory = new UserAccountDirectory();
        organisationDirectory=new OrganisationDirectory();
        EnterpriseID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public int getEnterpriseID() {
        return EnterpriseID;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }
    
   
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
