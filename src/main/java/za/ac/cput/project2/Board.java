package za.ac.cput.project2;

/**
 *
 * @author tyrique 219089345
 * @author ethan 220126283
 */
public class Board 
{
    private int BoardID;
    private Member BMember;
    private String BoardFunction;

    public Board(int BoardID, Member BMember, String BoardFunction) 
    {
        this.BoardID = BoardID;
        this.BMember = BMember;
        this.BoardFunction = BoardFunction;
    }

    public Board() 
    {
    }

    public int getBoardID() 
    {
        return BoardID;
    }

    public Member getBMember() 
    {
        return BMember;
    }

    public String getBoardFunction() 
    {
        return BoardFunction;
    }

    public void setBoardID(int BoardID) 
    {
        this.BoardID = BoardID;
    }

    public void setBMember(Member BMember) 
    {
        this.BMember = BMember;
    }

    public void setBoardFunction(String BoardFunction) 
    {
        this.BoardFunction = BoardFunction;
    }
    
    
}
