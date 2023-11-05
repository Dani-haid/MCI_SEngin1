package mci.se1.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student{
    public enum Degree {Unknown, Bachelor, Master, Doctor}
    private String name;
    private int group;
    private int proficiencyInJava; // 1-10
    private int studentId = 0;
    private Gender gender = Gender.UNKNOWN;
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
        } else{
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
            average += grade.getGrade();
        }
        return average/courseGrades.size() ;
    }

    public boolean hasSameFluencyInJavaAs(Student anotherStudent) {
        return getProficiencyInJava() == anotherStudent.getProficiencyInJava();
    }

    /**
     * prints new students, is called in constructor
     */
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