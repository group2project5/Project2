package za.ac.cput.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author senzo 219345406
 * @author ethan 220126283
 */
public class MemberTest 
{
    
    public MemberTest() 
    {
    }

    /**
     * Test of getRole method.
     */
    @Test
    public void testGetRole() 
    {
        System.out.println("getRole");
        Member instance = new Member();
        Role expResult = null;
        Role result = instance.getRole();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemberID method.
     */
    @Test
    public void testGetMemberID() 
    {
        System.out.println("getMemberID");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getMemberID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFName method.
     */
    @Test
    public void testGetFName() 
    {
        System.out.println("getFName");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getFName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLName method.
     */
    @Test
    public void testGetLName() 
    {
        System.out.println("getLName");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getLName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhone method.
     */
    @Test
    public void testGetPhone() 
    {
        System.out.println("getPhone");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method,.
     */
    @Test
    public void testGetEmail() 
    {
        System.out.println("getEmail");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRole method.
     */
    @Test
    public void testSetRole() 
    {
        System.out.println("setRole");
        Role MRole = null;
        Member instance = new Member();
        instance.setRole(MRole);
    }

    /**
     * Test of setMemberID method.
     */
    @Test
    public void testSetMemberID() 
    {
        System.out.println("setMemberID");
        int MemberID = 0;
        Member instance = new Member();
        instance.setMemberID(MemberID);
    }

    /**
     * Test of setFName method.
     */
    @Test
    public void testSetFName() 
    {
        System.out.println("setFName");
        String MFName = "";
        Member instance = new Member();
        instance.setFName(MFName);
    }

    /**
     * Test of setLName method.
     */
    @Test
    public void testSetLName() 
    {
        System.out.println("setLName");
        String MLName = "";
        Member instance = new Member();
        instance.setLName(MLName);
    }

    /**
     * Test of setPhone method.
     */
    @Test
    public void testSetPhone() 
    {
        System.out.println("setPhone");
        int MPhone = 0;
        Member instance = new Member();
        instance.setPhone(MPhone);
    }

    /**
     * Test of setEmail method.
     */
    @Test
    public void testSetEmail() 
    {
        System.out.println("setEmail");
        String MEmail = "";
        Member instance = new Member();
        instance.setEmail(MEmail);
    }

    /**
     * Test of equals method.
     */
    @Test
    public void testEquals() 
    {
        System.out.println("equals");
        Object obj = null;
        Member instance = new Member();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

}
