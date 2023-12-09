
package business;

import business.Enterprise.EnterpriseDirectory;

/**
 *
 * 
 */
public class Business {

    private static Business business;
    private EnterpriseDirectory organizationDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        organizationDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
