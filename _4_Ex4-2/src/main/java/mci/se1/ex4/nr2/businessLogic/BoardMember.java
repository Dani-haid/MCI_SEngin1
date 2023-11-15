package mci.se1.ex4.nr2.businessLogic;

public class BoardMember extends AbstractStaff{
    private final int id;
    private String firstName;
    private String lastName;

    public BoardMember(int id, String firstName, String lastname){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
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

    @Override
    public void print() {
        System.out.println("Board Member with id " + id + ":  " + firstName + " " + lastName);
    }
}
