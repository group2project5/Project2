/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 * THABO SYDWELL TASANA
 * @author 218335725
 */
public class Volunteer {
    
    private long VolunteerID;
    private String IdNumber;
    private String Surname;
    private String FirstName;
    private String MaidenName;
    private String Age;
    private String Gender;
    private String Citizenship;
    private String MaritalStatus;
    private String CellNumber;
    
    public Volunteer(long VolunteerID, String IdNumber, String Surname, String FirstName, String MaidenName, String Age, String Gender, String Citizenship, String MaritalStatus, String CellNumber) {
        
        this.VolunteerID = VolunteerID;
        this.IdNumber = IdNumber;
        this.Surname = Surname;
        this.FirstName = FirstName;
        this.MaidenName = MaidenName;
        this.Age = Age;
        this.Gender = Gender;
        this.Citizenship = Citizenship;
        this.MaritalStatus = MaritalStatus;
        this.CellNumber = CellNumber;
        
    }
    public long getVolunteerID(){
        return VolunteerID;
    }
    public void setVolunteerID(long VolunteerID){
        this.VolunteerID = VolunteerID;
    }
    public String getIdNumber(){
        return IdNumber;
    }
    public void setIdnumber(String IdNumber){
        this.IdNumber = IdNumber;
    }
    public String getSurname(){
        return Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getMaidenName(){
        return MaidenName;
    }
    public void setMaidenName(String MaidenName){
        this.MaidenName = MaidenName;
    }
    public String getAge(){
        return Age;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public String getGender(){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getCitizenship(){
        return Citizenship;
    }
    public void setCitizenship(String Citizenship){
        this.Citizenship = Citizenship;
    }
    public String getMaritalStatus(){
        return MaritalStatus;
    }
    public void setMaritalStatus(String MaritalStatus){
        this.MaritalStatus = MaritalStatus;
    }
    public String getCellNumber(){
      return CellNumber;  
    }
    public void setCellNumber(String CellNumber){
        this.CellNumber = CellNumber;
    }
    
    @Override
    public String toString(){
        return "Volunteer{" + "VolunteerID=" + VolunteerID +",IdNumber=" + IdNumber +",Surname=" + Surname +",FirstName=" + FirstName +",MaidenName=" + MaidenName +",Age=" + Age +",Gender=" + Gender +",Citizenship=" + Citizenship +",MaritalStatus=" + MaritalStatus +",CellNumber=" + CellNumber +"}";
    }
}
