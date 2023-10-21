package sheet1.exercise1;

/*
Create a class Student with data fields name, group,
proficiencyInJava, studentID and gender.
Implement a few constructors for the class,
the getter and setter methods, and the toString() method
*/

/*
In Student class,add a method boolean hasSameFluencyInJavaAs(Student anotherStudent)
that checks whether two students have the same
proficiency in Java.Test it in the TestStudent class
*/

/*
In Student class, implement a method that checks
whether two students are the same student.
To do so, you must override the equals() method in class Student.
Test your method equals() in the main() in TestStudent
*/

import java.util.Objects;

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

    public boolean hasSameFluencyInJava(Student anotherStudent){
        // if sout should be in main
        //return this.proficiencyInJava.equals(anotherStudent.proficiencyInJava);

        if(this.proficiencyInJava.equals(anotherStudent.proficiencyInJava)){
            System.out.println(this.name + " has same fluency in Java than " + anotherStudent.name + ". Fluency of both is " + this.proficiencyInJava);
            return true;
        }
        System.out.println("Fluency in Java is NOT the same! " + this.name + ": " + this.proficiencyInJava + ", " + anotherStudent.name + ": "+ anotherStudent.proficiencyInJava);
        return false;

    }

    @Override
    public boolean equals(Object obj){
        
        // Object is compared with itself
        if(this == obj){
            System.out.println("is the same object");
            return true;
        }

        // cast
        Student anotherStudent = (Student) obj;

        if(Objects.equals(this.name, anotherStudent.name) && this.studentId == anotherStudent.studentId){
            System.out.println("Name and Id are the same");
            return true;
        }
        System.out.println("Objects don't equals each other");
        return false;
    }


}

