//package edu.mci.sweng1.week1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A collection of students.
 *
 * @author andrea
 */
public class StudentCollection {

    /** Internal list if students   */
    private List<Student> students = new ArrayList<Student>();

    /**
     * Do not initialize with a set of students.
     * Students can be manipulated by studentCollection.getStudents.add(...) for
     * example.
     */
    public StudentCollection() {
    }

    /**
     * Initialize StudentCollection with an array of students
     * The student objects are not cloned.
     * @param students Array of students
     */
    public StudentCollection(Student[] students) {
        for(Student student : students) {
            this.students.add(student);
        }
    }

    /**
     * Unused in this assignment.
     * @param students
     */
    public StudentCollection(Collection<Student> students) {
        this.students.addAll(students);
    }

    /**
     * Print out list of students mathing a given proficency
     * @param proficiency The proficiency the student should match
     */

    public void studentsWithProficiency(int proficiency) {
        System.out.println("Students matching proficiency " + proficiency);
        for(Student student : students) {
            if(student.getProficiencyInJava() == proficiency) {
                System.out.println("\n\t" + student);
            }
        }
    }

    /**
     * Assignment 1, Exercise 6
     * Print out list of students mathing a given proficency
     * @param proficiency The proficiency the student should match
     */
    public Student[] studentsWithProficiencyArray(int proficiency) {
        List<Student> studentList = new ArrayList<Student>();
        for(Student student : students) {
            if(student.getProficiencyInJava() == proficiency) {
                // Note that this is not a copy - it is the same student object
                studentList.add(student);
            }
        }
        return studentList.toArray(new Student[0]);
    }

    /* Trivial getters and setters */
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}