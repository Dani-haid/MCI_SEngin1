package mci.se1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student implements Cloneable {
    public enum Gender {unknown, male, female}
    public enum Degree {Unknown, Bachelor, Master, Doctor}
    private String name;
    private int group;
    private int proficiencyInJava; // 1-10
    private int studentId = 0;
    private Gender gender = Gender.unknown;
    private static int totalNumberOfStudents = 0;
    private List<CourseGrade> courseGrades = new ArrayList<CourseGrade>();
    public static final int MAX_GROUP_NUMBER = 99;

    // Full constructor
    public Student(String name, int group, int proficiencyInJava, int studentId, Gender gender) {
        this(name, group, proficiencyInJava, gender);
        this.studentId = studentId;
    }

    public Student(String name, int group, int proficiencyInJava, Gender gender) {
        this(name);
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.gender = gender;
    }

    public Student(String name){
        this.name = name;
        Student.totalNumberOfStudents++;
        printNewStudent();
    }

    public Student(){
        Student.totalNumberOfStudents++;
        printNewStudent();
    }

    public Student(Scanner scanner){
        System.out.println("New Student will be added, please insert the following values:\n");
        System.out.println("Name of the Student: ");
        this.name = scanner.nextLine();

        System.out.println("Group [0-" + MAX_GROUP_NUMBER + "]: ");
        while(true){
            String tempGroupString = scanner.nextLine();
            try{
                int tempGroup = Integer.parseInt(tempGroupString);
                if(tempGroup >= 0 && tempGroup <= MAX_GROUP_NUMBER){
                    this.group = tempGroup;
                    break;
                }else{
                    System.out.println("Please insert a group number between 0 and " + MAX_GROUP_NUMBER);
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a group number between 0 and " + MAX_GROUP_NUMBER);
            }
        }

        System.out.println("Proficency in Java [1-10]: ");
        while(true){
            String tempProficencyString = scanner.nextLine();
            try{
                int tempProficency = Integer.parseInt(tempProficencyString);
                if(tempProficency >= 1 && tempProficency <= 10){
                    this.proficiencyInJava = tempProficency;
                    break;
                }else{
                    System.out.println("Please insert a proficency value between 1 and 10.");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a proficency value between 1 and 10.");
            }
        }

        System.out.println("Student Id: ");
        while(true){
            String tempStudentIdString = scanner.nextLine();
            try{
                int tempStudentId = Integer.parseInt(tempStudentIdString);
                if(tempStudentId > 0){
                    this.studentId = tempStudentId;
                    break;
                }else{
                    System.out.println("Please insert a StudentId > 0.");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please insert a StudentId > 0.");
            }
        }

        System.out.println("Gender [Unknown | Male | Female]: ");
        String tempGender = scanner.nextLine();
        tempGender = tempGender.toLowerCase();

        try {
            this.gender = Gender.valueOf(tempGender);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender input. Setting to Unknown.");
            this.gender = Gender.unknown;
        }

        scanner.nextLine();

        Student.totalNumberOfStudents++;
        printNewStudent();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Student:{");
        builder.append("Name=" + name);
        builder.append(", group=" + group);
        builder.append(", proficiencyInJava=" + proficiencyInJava);
        builder.append(", studentId=" + studentId);
        builder.append(", gender=" + gender);
        builder.append('}');
        return builder.toString();
    }

    /**
     * Test for equality with another student
     */
    @Override
    public boolean equals(Object obj) {
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

        if (getName() == null) {
            if(anotherStudent.getName() != null) return false;
        } else if(!getName().equals(anotherStudent.getName())) return false;

        if(getStudentId() != 0 && anotherStudent.getStudentId() != 0){
            if(!Objects.equals(getStudentId(), anotherStudent.getStudentId())){
                System.out.println("Ids are not the same");
                return false;
            }
        }else{
            System.out.println("No StudentId defined");
            return false;
        }

        return getGender() == anotherStudent.getGender();
    }

    /**
     * @return average of course grades
     */
    public float averageNote() {
        float average = 0.0f;
        for(CourseGrade grade : courseGrades) {
            average += (float)grade.getGrade() / courseGrades.size();
        }
        return average;
    }


    /**
     * Clone student with a deep copy
     * @return The student clone
     * @throws java.lang.CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {

        try {
            Student myClone = new Student();
            super.clone();
            myClone.name = this.name;
            myClone.group = this.group;
            myClone.proficiencyInJava = this.proficiencyInJava;
            myClone.gender = this.gender;
            myClone.studentId = this.studentId;
            return(myClone);
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError(ex.toString());
        }

    }

    /**
     * Test if this student equals another student with regards to fluency
     * @param anotherStudent The other student
     * @return True if the proficiencies are equal
     */
    public boolean hasSameFluencyInJavaAs(Student anotherStudent) {
        return getProficiencyInJava() == anotherStudent.getProficiencyInJava();
    }

    protected void printNewStudent(){
        System.out.println("New Student " + this.name + " added! There are a total of " + Student.totalNumberOfStudents +  " students");
    }

    /** Getter
     * @return  */
    public int getStudentId() {
        return studentId;
    }

    /** Setter
     * @param studentId */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /** Getter
     * @return  */
    public Gender getGender() {
        return gender;
    }

    /** Setter
     * @param gender */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /** Getter
     * @return  */
    public int getGroup() {
        return group;
    }

    /** Setter
     * @param group */
    public void setGroup(int group) {
        this.group = group;
    }

    /** Getter
     * @return  */
    public String getName() {
        return name;
    }

    /** Setter
     * @param name */
    public void setName(String name) {
        this.name = name;
    }

    /** Getter
     * @return  */
    public int getProficiencyInJava() {
        return proficiencyInJava;
    }

    /** Setter
     * @param proficiencyInJava */
    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    /** Getter
     * @return  */
    public List<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    /** Setter
     * @param courseGrades */
    public void setCourseGrades(List<CourseGrade> courseGrades) {
        this.courseGrades = courseGrades;
    }
}