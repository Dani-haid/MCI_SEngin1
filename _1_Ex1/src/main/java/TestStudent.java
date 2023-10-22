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
        Student s1 = new Student("Daniela", 3, proficencyLevel.BEGINNER, 23, "female");
        s1.addGrade("Science", 5);
        s1.addGrade("Math", 1);
        Student s2 = new Student("Hans", 2, proficencyLevel.ADVANCED, 24, "male");
        s2.addGrade("Math", 3);
        s2.addGrade("History", 1);
        s2.addGrade("Music", 5);
        Student s3 = new Student("Sarah", 3, proficencyLevel.INTERMEDIATE, 25, "female");
        Student s4 = new Student("Mike", 3, proficencyLevel.BEGINNER, 26, "male");
        Student s5 = new Student("Peter", 2, proficencyLevel.EXPERIENCED, 27, "male");
        s5.addGrade("Art", 2);
        s5.addGrade("Economics", 1);
        Student s6 = new Student("Peter", 2, proficencyLevel.EXPERIENCED, 27, "male");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());

        s1.setProficiencyInJava(proficencyLevel.ADVANCED);
        s4.setGroup(2);

        System.out.println(s1.toString());
        System.out.println(s4.toString());

        s5.hasSameFluencyInJava(s1);
        s2.hasSameFluencyInJava(s1);

        s4.equals(s3);
        s5.equals(s6);
        s5.equals(s5);

        s1.printGrades();
        s1.averageNote();
        s2.averageNote();
        s5.averageNote();
        s6.averageNote();
    }
}
