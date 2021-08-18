//220126283
//Ethan Swart
package za.ac.cput.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 220126283
 */
public class RoleTest {
    
    public RoleTest() {
    }

    /**
     * Test of getRoleID
     */
    @Test
    public void testGetRoleID() {
        System.out.println("getRoleID");
        Role instance = new Role();
        int expResult = 0;
        int result = instance.getRoleID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRoleName
     */
    @Test
    public void testGetRoleName() {
        System.out.println("getRoleName");
        Role instance = new Role();
        String expResult = "";
        String result = instance.getRoleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoleID method
     */
    @Test
    public void testSetRoleID() {
        System.out.println("setRoleID");
        int RoleID = 0;
        Role instance = new Role();
        instance.setRoleID(RoleID);
    }

    /**
     * Test of setRoleName method
     */
    @Test
    public void testSetRoleName() {
        System.out.println("setRoleName");
        String RoleName = "";
        Role instance = new Role();
        instance.setRoleName(RoleName);
    }
    
}
