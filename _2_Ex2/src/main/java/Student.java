//package edu.mci.sweng1.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amdrea
 */
public class Student implements Cloneable {
    public enum Gender {Unknown, Male, Female}

    private String name;
    private int group;
    private int proficiencyInJava;
    private String cprNumber;
    private Gender gender = Gender.Unknown;

    private static int studentCount = 0;
    private List<CourseGrade> courseGrades = new ArrayList<CourseGrade>();

    public Student() {
        System.out.println("New Student added! There are a total of " + (++studentCount ) + " students");
    }

    /** Full constructor
     * @param name Full name of the student
     * @param group group number
     * @param proficiencyInJava An integer from 1 - 10
     * @param gender One of the enum value of Gender
     * @param cprNumber The CPR number
     */
    public Student(String name, int group, int proficiencyInJava, String cprNumber, Gender gender) {
        this();

        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.cprNumber = cprNumber;
        this.gender = gender;
    }

   /**
     * Useful Constructor for this assignment, without CPR number
     * @param name Full name of the student
     */
    public Student(String name, int group, int proficiencyInJava, Gender gender) {
        this();

        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.gender = gender;
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
        builder.append(", cprNumber=" + cprNumber);
        builder.append(", gender=" + gender);
        builder.append('}');
        return builder.toString();
    }

    /**
     * Test for equality with another student
     * @param object The other student
     * @return true, if the objects equal one another
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (! (object instanceof Student) ) return false;
        Student anotherStudent = (Student)object;

        // Only name, cpr and gender define the students identitiy
        // Name matches only if both are null or they equals each other
        if (getName() == null) {
            if(anotherStudent.getName() != null) return false;
        } else if(!getName().equals(anotherStudent.getName())) return false;

        // CPR number matches only if both are null or they equals each other
        if (getCprNumber() == null) {
            if (anotherStudent.getCprNumber() != null) 
                return false;
        } else if(!getCprNumber().equals(anotherStudent.getCprNumber())) return false;
        
        return getGender() == anotherStudent.getGender();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 89 * hash + this.group;
        hash = 89 * hash + this.proficiencyInJava;
        hash = 89 * hash + (this.cprNumber != null ? this.cprNumber.hashCode() : 0);
        hash = 89 * hash + (this.gender != null ? this.gender.hashCode() : 0);
        hash = 89 * hash + (this.courseGrades != null ? this.courseGrades.hashCode() : 0);
        return hash;
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
                myClone.cprNumber = this.cprNumber;
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

    /** Getter
     * @return  */
    public String getCprNumber() {
        return cprNumber;
    }

    /** Setter
     * @param cprNumber */
    public void setCprNumber(String cprNumber) {
        this.cprNumber = cprNumber;
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
