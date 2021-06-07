package za.ac.cput;

/**
 *
 * @author 220126283 Ethan Swart
 */
public class Manager 
{

private String name;
private String lastName;
private String cellPhone;
private String email;
private int monthlySalary;

    public Manager() {
    }

    public Manager(String name, String lastName, String cellPhone, String email, int monthlySalary) {
        this.name = name;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
        this.email = email;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", lastName=" + lastName + ", cellPhone=" + cellPhone + ", email=" + email + ", monthlySalary=" + monthlySalary + '}';
    }
    
}
