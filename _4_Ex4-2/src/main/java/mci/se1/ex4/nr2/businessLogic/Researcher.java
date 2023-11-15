package mci.se1.ex4.nr2.businessLogic;

public class Researcher extends AbstractStaff{
    private final int id;
    private String firstName;
    private String lastName;
    private String department;
    private String researchField;

    public Researcher(int id, String firstName, String lastName, String department, String researchField) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.researchField = researchField;
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

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    @Override
    public void print() {
        System.out.println("Researcher with id " + id + ": "
                + firstName + " " + lastName + ", department " + department
                + ", research Field " + researchField);
    }
}
