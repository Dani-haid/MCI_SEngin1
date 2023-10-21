package sheet1.exercise1;

/*
Create a class TestStudent to test the class Student.
TestStudent will contain the public static void main() method.
In this latter method, create 5 Student objects,
set different values for the data fields of the single objects,
print out each of them, and generally experiment
with the methods applied to single objects
*/

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Daniela", 3, "beginner", 23, "female");
        Student s2 = new Student("Hans", 2, "advanced", 24, "male");
        Student s3 = new Student("Sarah", 3, "intermediate", 25, "female");
        Student s4 = new Student("Mike", 3, "beginner", 26, "male");
        Student s5 = new Student("Peter", 2, "experienced", 27, "male");

        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();
        s5.printStudent();

        s1.setProficiencyInJava("advanced");
        s4.setGroup(2);

        s1.printStudent();
        s4.printStudent();
    }
}
