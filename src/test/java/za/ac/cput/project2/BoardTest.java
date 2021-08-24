package za.ac.cput.project2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author tyrique 219089345
 * @author ethan 220126283
 */
public class BoardTest 
{
    
    public BoardTest() 
    {
    }

    /**
     * Test of getBoardID method.
     */
    @Test
    public void testGetBoardID() 
    {
        System.out.println("getBoardID");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getBoardID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBMember method.
     */
    @Test
    public void testGetMember() 
    {
        System.out.println("getBMember");
        Board instance = new Board();
        Member expResult = null;
        Member result = instance.getBMember();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBoardFunction method.
     */
    @Test
    public void testGetBoardFunction() 
    {
        System.out.println("getBoardFunction");
        Board instance = new Board();
        String expResult = null;
        String result = instance.getBoardFunction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBoardID method.
     */
    @Test
    public void testSetBoardID() 
    {
        System.out.println("setBoardID");
        int BoardID = 0;
        Board instance = new Board();
        instance.setBoardID(BoardID);
    }

    /**
     * Test of setBMember method.
     */
    @Test
    public void testSetBMember() 
    {
        System.out.println("setBMember");
        Member BMember = null;
        Board instance = new Board();
        instance.setBMember(BMember);
    }

    /**
     * Test of setBoardFunction method.
     */
    @Test
    public void testSetBoardFunction() 
    {
        System.out.println("setBoardFunction");
        String BoardFunction = "";
        Board instance = new Board();
        instance.setBoardFunction(BoardFunction);
    }
    
}
