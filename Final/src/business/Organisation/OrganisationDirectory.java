/*
 *
 */
package business.Organisation;

import java.util.ArrayList;

/**
 *
 * 
 */
public class OrganisationDirectory {
    
    private ArrayList<Organisation> OrganisationList;

    public OrganisationDirectory() {
        OrganisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return OrganisationList;
    }
    
    public Organisation createEmployee(String name){
        Organisation employee = new Organisation();
        employee.setName(name);
        OrganisationList.add(employee);
        return employee;
    }
}