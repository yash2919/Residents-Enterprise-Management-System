
package business.Role;

import business.Business;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {

    public enum RoleType {
        
        Admin("Admin"),
        
        //Buidling Team
        LeasingTeam("Leasing Team"),
        Concierge("Concierge"),
        Residents("Residents"),
        
        //Maintainence Team
         
        Electrician("Electrician Team"),
        Plumbing("Plumbing Team"),
        Cleaning("Cleaning Team"),
       
        //Pest Control Team 
        
        InsectisidesTeam("Insectisides Team"),
        MiticidesTeam("Miticides Team"),
        MicrobialTeam("Microbial Team"),
        
        // Packaging Team
        
        Superviser("Superviser Packaging Team"),
        DeliveryGuy("Delivery Employee");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }

}
