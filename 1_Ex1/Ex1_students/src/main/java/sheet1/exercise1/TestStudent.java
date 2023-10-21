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

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());

        s1.setProficiencyInJava("advanced");
        s4.setGroup(2);

        System.out.println(s1.toString());
        System.out.println(s4.toString());

        s5.hasSameFluencyInJava(s1);

        s2.hasSameFluencyInJava(s1);
    }
}
