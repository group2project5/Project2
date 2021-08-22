package za.ac.cput.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author robyn 217243576
 * @author ethan 220126283
 */
public class VolunteerTest 
{
    
    public VolunteerTest() 
    {
    }

    /**
     * Test of getisActive method.
     */
    @Test
    public void testGetisActive() 
    {
        System.out.println("getisActive");
        Volunteer instance = new Volunteer();
        boolean expResult = false;
        boolean result = instance.getisActive();
        assertEquals(expResult, result);
    }

    /**
     * Test of setisActive method.
     */
    @Test
    public void testSetisActive() 
    {
        System.out.println("setisActive");
        boolean VActive = false;
        Volunteer instance = new Volunteer();
        instance.setisActive(VActive);
    }
    
}
