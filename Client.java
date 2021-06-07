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
public class Client {
    
    private long ClientID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String IDNumber;
    private String address;

    public Client(long ClientID, String FirstName, String LastName, String Gender, String IDNumber, String address) {
        this.ClientID = ClientID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.IDNumber = IDNumber;
        this.address = address;
    }

    public long getClientID() {
        return ClientID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        return Gender;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setClientID(long ClientID) {
        this.ClientID = ClientID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" + "ClientID=" + ClientID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender + ", IDNumber=" + IDNumber + ", address=" + address + '}';
    }
    
    
    
    
}
