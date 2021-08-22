package za.ac.cput.project2;

/**
 *
 * @author robyn 217243576
 * @author ethan 220126283
 */
public class Volunteer extends Member 
{
    private boolean VisActive;

    public Volunteer(boolean VActive, int MemberID, String MFName, String MLName, int MPhone, String MEmail, Role MRole) 
    {
        super(MemberID, MFName, MLName, MPhone, MEmail, MRole);
        this.VisActive = VActive;
    }
    
    public Volunteer()
    {       
    }

    public boolean getisActive() 
    {
        return VisActive;
    }

    public void setisActive(boolean VActive) 
    {
        this.VisActive = VActive;
    }
    
    
    
}
