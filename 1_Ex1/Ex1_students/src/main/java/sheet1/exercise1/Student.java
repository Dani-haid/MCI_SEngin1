package sheet1.exercise1;
import java.util.Arrays;

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

/*
In Student class, add data members to store all the grades
for all the courses taken by a student. Also implement
a method float averageNote() that returns the average
grade over all courses taken by a student
*/

/*
Add a static field in class Student to keep track of the number
of Student objects created. Anytime you create a new Student object,
you should print out a message like e.g. “New Student added!
There are a total of 6 students” when the sixth Student object is created
*/

import java.util.Objects;

public class Student {
    private static int totalNumberOfStudents = 0;
    private String name;
    private int group;
    private String proficiencyInJava;
    private int studentId;
    private String gender;
    private int[] grades; //stetting grades is static, to be optimized

    //default constructor
    Student(){
        Student.totalNumberOfStudents++;
        printNewStudent();
    }

    //constructor
    Student(String name, int group){
        this();
        this.name = name;
        this.group = group;
    }

    Student(String name, int group, String prof, int Id, String gender){
        this(name, group);
        proficiencyInJava = prof;
        studentId = Id;
        this.gender = gender;
    }

    //full constructor
    Student(String name, int group, String prof, int Id, String gender, int[] grades){
        this(name, group, prof, Id, gender);
        this.grades = grades;
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

    public int getGrades(int index) {
        if(grades.length != 0){
            return this.grades[index];
        }
        return 0;
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

    public void printGrades(){
        if(grades.length != 0) {
            for (int element : this.grades) {
                System.out.println("Grade: " + element);
            }
        }
    }

    public float averageNote(){
        if(grades == null || grades.length == 0){
            System.out.println("No grades found.\n");
            return 0;
        }
            float average = 0;
            float sum = 0;
            for (int element: this.grades) {
                sum += element;
            }
            average = sum / (this.grades.length);
            System.out.println("Average Grade: " + average);
            return average;
    }

    private void printNewStudent(){
        System.out.println("New Student added! There are a total of " + Student.totalNumberOfStudents +  " students");
    }



}

