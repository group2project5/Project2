/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author senzo
 */
public class MemberTest {
    
    public MemberTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMemberID method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testGetMemberID() {
        System.out.println("getMemberID");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getMemberID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMFName method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testGetMFName() {
        System.out.println("getMFName");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getMFName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMLName method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testGetMLName() {
        System.out.println("getMLName");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getMLName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMPhone method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testGetMPhone() {
        System.out.println("getMPhone");
        Member instance = new Member();
        int expResult = 0;
        int result = instance.getMPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMEmail method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testGetMEmail() {
        System.out.println("getMEmail");
        Member instance = new Member();
        String expResult = "";
        String result = instance.getMEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemberID method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testSetMemberID() {
        System.out.println("setMemberID");
        int MemberID = 0;
        Member instance = new Member();
        instance.setMemberID(MemberID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMFName method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testSetMFName() {
        System.out.println("setMFName");
        String MFName = "";
        Member instance = new Member();
        instance.setMFName(MFName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMLName method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testSetMLName() {
        System.out.println("setMLName");
        String MLName = "";
        Member instance = new Member();
        instance.setMLName(MLName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMPhone method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testSetMPhone() {
        System.out.println("setMPhone");
        int MPhone = 0;
        Member instance = new Member();
        instance.setMPhone(MPhone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMEmail method, of class Member.
     */
    @org.junit.jupiter.api.Test
    public void testSetMEmail() {
        System.out.println("setMEmail");
        String MEmail = "";
        Member instance = new Member();
        instance.setMEmail(MEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
