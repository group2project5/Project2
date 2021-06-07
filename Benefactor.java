/*
 * A benefactor is a person who gives some form of help to benefit a person, 
 * group or organization, often gifting a monetary contribution in the form of 
 * an endowment to help a cause.
 */
package za.ac.cput;

/**
 * @author Benjamin Steyn
 * Student Number 219047022
 */
public class Benefactor {
    
    private String bName;
    private String bLastName;
    private String bEmail;
    private String bCellPhone;
    private double bEndowment;
    
    public Benefactor(String bName, String bLastName, String bEmail, String bCellPhone, double bEndowment){
        this.bName = bName;
        this.bLastName = bLastName;
        this.bEmail = bEmail;
        this.bCellPhone = bCellPhone;
        this.bEndowment = bEndowment;
    }
    
    public String getbName() {
        return bName;
    }
    
    public String getbLastName() {
        return bLastName;
    }
    
    public String getbEmail() {
        return bEmail;
    }
    
    public String getbCellPhone() {
        return bCellPhone;
    }
    
    public double getbEndowment() {
        return bEndowment;
    }
    
    public void setbName(String bName) {
        this.bName = bName;
    }
    
    public void setbLastName(String bLastName) {
        this.bLastName = bLastName;
    }
    
    public void setbEmail(String bEmail) {
        this.bEmail = bEmail;
    }
    
    public void setbCellPhone(String bCellPhone) {
        this.bCellPhone = bCellPhone;
    }
    
    public void setbEndowment(double bEndowmente) {
        this.bEndowment = bEndowment;
    }
    
    @Override
    public String toString() {
        return "Benefactor{" + "bName=" + bName + ", bLastName=" + bLastName + ", bEmail=" + bEmail + ", bCellPhone=" + bCellPhone + ", bEndowment=" + bEndowment + '}';
    }
      
}
