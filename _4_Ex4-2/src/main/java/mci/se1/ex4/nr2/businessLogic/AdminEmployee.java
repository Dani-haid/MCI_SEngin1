package mci.se1.ex4.nr2.businessLogic;

public class AdminEmployee extends AbstractStaff{
    private final int id;
    private String firstName;
    private String lastName;
    private String department;

    public AdminEmployee(int id, String firstName, String lastName, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void print() {
        System.out.println("Admin Employee with id " + id + ": "
                + firstName + " " + lastName + ", department " + department);
    }
}
