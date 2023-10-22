import java.util.HashMap;
import java.util.Map;

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

import java.util.Map;
import java.util.Objects;

enum proficencyLevel {
    BEGINNER,
    ADVANCED,
    INTERMEDIATE,
    EXPERIENCED
}

public class Student {
    private static int totalNumberOfStudents = 0;
    private String name;
    private int group;
    private proficencyLevel proficiencyInJava;
    private int studentId;
    private String gender;
    //private int[] grades; //stetting grades is static, to be optimized
    private Map<String, Integer> grades = new HashMap<>(); // string = course, Integer = grade

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

    //full constructor
    Student(String name, int group, proficencyLevel prof, int id, String gender){
        this(name, group);
        proficiencyInJava = prof;
        studentId = id;
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
    public proficencyLevel getProficiencyInJava() {
        return proficiencyInJava;
    }

    public void setProficiencyInJava(proficencyLevel proficiencyInJava) {
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

    public void addGrade(String course, int grade){
        grades.put(course, grade);
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

        // check if object ist an instance of student
        if(!(obj instanceof Student)){
            return false;
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
        if(grades.size()!= 0) {
            System.out.println("Printing all grades for student " + name);
            for (Map.Entry<String, Integer> elements : grades.entrySet()){
                String course = elements.getKey();
                int grade = elements.getValue();
                System.out.println(course + ": " + grade);
            }
        }
    }

    public float averageNote(){
        int numberOfGrades = grades.size();
        if(numberOfGrades <= 0){
            System.out.println("No grades found.\n");
            return 0;
        }

        float average = 0;
        int sum = 0;
        for (int element: grades.values()) {
            sum += element;
        }

        average = sum / numberOfGrades;
        System.out.println("Average Grade for student " + name + ": " + average);
        return average;
    }

    private void printNewStudent(){
        System.out.println("New Student added! There are a total of " + Student.totalNumberOfStudents +  " students");
    }



}

