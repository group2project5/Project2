/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author senzo 219345406
 */
public class Member {
    
    private int MemberID;
    private String MFName;
    private String MLName;
    private int MPhone;
    private String MEmail;

    public Member() 
    {
        this.MemberID = 0;
        this.MFName = "";
        this.MLName = "";
        this.MPhone = 0;
        this.MEmail = "";
    }

    public Member(int MemberID, String MFName, String MLName, int MPhone, String MEmail) 
    {
        this.MemberID = MemberID;
        this.MFName = MFName;
        this.MLName = MLName;
        this.MPhone = MPhone;
        this.MEmail = MEmail;
    }

    public int getMemberID() 
    {
        return MemberID;
    }

    public String getMFName() 
    {
        return MFName;
    }

    public String getMLName() 
    {
        return MLName;
    }
    
    public int getMPhone() 
    {
        return MPhone;
    }
    
    public String getMEmail() 
    {
        return MEmail;
    }
    public void setMemberID(int MemberID) 
    {
        this.MemberID = MemberID;
    }

    public void setMFName(String MFName) 
    {
        this.MFName = MFName;    
}
    
public void setMLName(String MLName) 
    {
        this.MLName = MLName;    
}

public void setMPhone(int MPhone) 
    {
        this.MPhone = MPhone;    
}

public void setMEmail(String MEmail) 
    {
        this.MEmail = MEmail;    
}
}
