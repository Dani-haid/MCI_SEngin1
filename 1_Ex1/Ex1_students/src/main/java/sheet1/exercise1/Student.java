package sheet1.exercise1;

/*
Create a class Student with data fields name, group,
proficiencyInJava, studentID and gender.
Implement a few constructors for the class,
the getter and setter methods, and the toString() method
*/

public class Student {
    private String name;
    private int group;
    private String proficiencyInJava;
    private int studentId;
    private String gender;

    //default constructor
    Student(){
        //System.out.println("Please insert more values.\n");
    }

    //constructor
    Student(String name, int group){
        this.name = name;
        this.group = group;
    }

    //full constructor
    Student(String name, int group, String prof, int Id, String gender){
        this.name = name;
        this.group = group;
        proficiencyInJava = prof;
        studentId = Id;
        this.gender = gender;
    }

    // getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public String getProficiencyInJava() {
        return proficiencyInJava;
    }

    public void setProficiencyInJava(String proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString(){
        return "Name:"+ name + ", Group: " + group + ", profInJava: "
                + proficiencyInJava + ", StudentId: " + studentId + ", Gender: " + gender;
    }
}

