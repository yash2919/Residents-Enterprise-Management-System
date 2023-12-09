/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

/**
 * 
 *
 * 
 */
public class Organisation {
    
    private String name;
    private int id;
    private static int count = 1;

    public Organisation() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
