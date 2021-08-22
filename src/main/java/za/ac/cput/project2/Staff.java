package za.ac.cput.project2;

/**
 *
 * @author benjamin 219047022
 * @author ethan 220126283
 */
public class Staff extends Member
{
    private String SHomeAddress;
    private double SSalary;

    public Staff() 
    {
    }

    public Staff(String SHomeAddress, double SSalary) {
        this.SHomeAddress = SHomeAddress;
        this.SSalary = SSalary;
    }

    public Staff(String SHomeAddress, double SSalary, int MemberID, String MFName, String MLName, int MPhone, String MEmail, Role MRole) 
    {
        super(MemberID, MFName, MLName, MPhone, MEmail, MRole);
        this.SHomeAddress = SHomeAddress;
        this.SSalary = SSalary;
    }

    public String getHomeAddress() {
        return SHomeAddress;
    }

    public double getSalary() {
        return SSalary;
    }

    public void setHomeAddress(String SHomeAddress) {
        this.SHomeAddress = SHomeAddress;
    }

    public void setSalary(double SSalary) {
        this.SSalary = SSalary;
    }
    
    
}
