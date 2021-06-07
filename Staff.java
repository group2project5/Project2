/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

/**
 *
 * @author Isaias Quizenge Francisco
 * Student Number 218180659
 */
public class Staff {
    
    private long StaffID;
    private String SFirstName;
    private String SLastName;
    private int SAge;
    private String SAddress;
    private String Services;
    private double Salary;

    public Staff(long StaffID, String SFirstName, String SLastName, int SAge, String SAddress, String Services, double Salary) {
        this.StaffID = StaffID;
        this.SFirstName = SFirstName;
        this.SLastName = SLastName;
        this.SAge = SAge;
        this.SAddress = SAddress;
        this.Services = Services;
        this.Salary = Salary;
    }

    public long getStaffID() {
        return StaffID;
    }

    public String getSFirstName() {
        return SFirstName;
    }

    public String getSLastName() {
        return SLastName;
    }

    public int getSAge() {
        return SAge;
    }

    public String getSAddress() {
        return SAddress;
    }

    public String getServices() {
        return Services;
    }

    public double getSalary() {
        return Salary;
    }

    public void setStuffID(long StuffID) {
        this.StaffID = StuffID;
    }

    public void setSFirstName(String SFirstName) {
        this.SFirstName = SFirstName;
    }

    public void setSLastName(String SLastName) {
        this.SLastName = SLastName;
    }

    public void setSAge(int SAge) {
        this.SAge = SAge;
    }

    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }

    public void setServices(String Services) {
        this.Services = Services;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Stuff{" + "StuffID=" + StaffID + ", SFirstName=" + SFirstName + ", SLastName=" + SLastName + ", SAge=" + SAge + ", SAddress=" + SAddress + ", Services=" + Services + ", Salary=" + Salary + '}';
    }
    
    
    
    
    
    
    
    
}
