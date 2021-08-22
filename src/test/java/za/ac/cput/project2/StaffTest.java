package za.ac.cput.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author benjamin 219047022
 * @author ethan 220126283
 */
public class StaffTest 
{
    
    public StaffTest() 
    {
    }

    /**
     * Test of getHomeAddress method.
     */
    @Test
    public void testGetHomeAddress() 
    {
        System.out.println("getHomeAddress");
        Staff instance = new Staff();
        String expResult = null;
        String result = instance.getHomeAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalary method.
     */
    @Test
    public void testGetSalary() 
    {
        System.out.println("getSalary");
        Staff instance = new Staff();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHomeAddress method.
     */
    @Test
    public void testSetHomeAddress() 
    {
        System.out.println("setHomeAddress");
        String SHomeAddress = "";
        Staff instance = new Staff();
        instance.setHomeAddress(SHomeAddress);
    }

    /**
     * Test of setSalary method.
     */
    @Test
    public void testSetSalary() 
    {
        System.out.println("setSalary");
        double SSalary = 0.0;
        Staff instance = new Staff();
        instance.setSalary(SSalary);
    }
    
}
