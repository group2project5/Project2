package za.ac.cput.project2;

/**
 *
 * @author ethan 220126283
 */

public class Role 
{
    private int RoleID;
    private String RoleName;

    public Role() 
    {
    }

    public Role(int RoleID, String RoleName) 
    {
        this.RoleID = RoleID;
        this.RoleName = RoleName;
    }

    public int getRoleID() 
    {
        return RoleID;
    }

    public String getRoleName() 
    {
        return RoleName;
    }

    public void setRoleID(int RoleID) 
    {
        this.RoleID = RoleID;
    }

    public void setRoleName(String RoleName) 
    {
        this.RoleName = RoleName;
    }
 
}
