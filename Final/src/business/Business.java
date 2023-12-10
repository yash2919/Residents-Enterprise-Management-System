
package business;

import business.Enterprise.EnterpriseDirectory;

/**
 *
 * 
 */
public class Business {

    private static Business business;
    private EnterpriseDirectory enterpriseDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    
}
