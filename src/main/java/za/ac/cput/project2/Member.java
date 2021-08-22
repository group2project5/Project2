package za.ac.cput.project2;

import java.util.Objects;

/**
 *
 * @author senzo 219345406
 * @author ethan 220126283
 */
public class Member 
{
    
    private int MemberID;
    private String MFName;
    private String MLName;
    private int MPhone;
    private String MEmail;
    private Role MRole;

    public Member() 
    {
        this.MemberID = 0;
        this.MFName = "";
        this.MLName = "";
        this.MPhone = 0;
        this.MEmail = "";
        this.MRole = new Role();
    }

    //Constructor
    public Member(int MemberID, String MFName, String MLName, int MPhone, String MEmail, Role MRole) 
    {
        this.MemberID = MemberID;
        this.MFName = MFName;
        this.MLName = MLName;
        this.MPhone = MPhone;
        this.MEmail = MEmail;
        this.MRole = MRole;
    }

    public Role getRole() 
    {
        return MRole;
    }

    public int getMemberID() 
    {
        return MemberID;
    }

    public String getFName() 
    {
        return MFName;
    }

    public String getLName() 
    {
        return MLName;
    }
    
    public int getPhone() 
    {
        return MPhone;
    }
    
    public String getEmail() 
    {
        return MEmail;
    }

    public void setRole(Role MRole) 
    {
        this.MRole = MRole;
    }
    
    public void setMemberID(int MemberID) 
    {
        this.MemberID = MemberID;
    }

    public void setFName(String MFName) 
    {
        this.MFName = MFName;    
    }
    
public void setLName(String MLName) 
    {
        this.MLName = MLName;    
    }

public void setPhone(int MPhone) 
    {
        this.MPhone = MPhone;    
    }

public void setEmail(String MEmail) 
    {
        this.MEmail = MEmail;    
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Member other = (Member) obj;
        if (this.MemberID != other.MemberID) {
            return false;
        }
        if (this.MPhone != other.MPhone) {
            return false;
        }
        if (!Objects.equals(this.MFName, other.MFName)) {
            return false;
        }
        if (!Objects.equals(this.MLName, other.MLName)) {
            return false;
        }
        if (!Objects.equals(this.MEmail, other.MEmail)) {
            return false;
        }
        if (!Objects.equals(this.MRole, other.MRole)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Member{" + "MemberID=" + MemberID + ", MFName=" + MFName + ", MLName=" + MLName + ", MPhone=" + MPhone + ", MEmail=" + MEmail + ", MRole=" + MRole + '}';
    }

    
}
