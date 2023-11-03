package mci.se1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Cloneable {
    public enum Gender {Unknown, Male, Female}
    private String name;
    private int group;
    private int proficiencyInJava;
    private int studentId;
    private Gender gender = Gender.Unknown;
    private static int totalNumberOfStudents = 0;
    private List<CourseGrade> courseGrades = new ArrayList<CourseGrade>();

    public Student(){
       Student.totalNumberOfStudents++;
       printNewStudent();
    }


    /** Full constructor
     * @param name Full name of the student
     * @param group group number
     * @param proficiencyInJava An integer from 1 - 10
     * @param gender One of the enum value of Gender
     * @param studentId studentId
     */
    public Student(String name, int group, int proficiencyInJava, int studentId, Gender gender) {
        this();

        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentId = studentId;
        this.gender = gender;
    }

    /**
     * Useful Constructor for this assignment, without StudentId
     * @param name Full name of the student
     */
    public Student(String name, int group, int proficiencyInJava, Gender gender) {
        this();

        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.gender = gender;
        this.studentId = 0;
    }


    /**
     * Create readable representation of this object
     * @return String representation of this Student
     */
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

    private void printNewStudent(){
        System.out.println("New Student added! There are a total of " + Student.totalNumberOfStudents +  " students");
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