package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, Integer studentId, Integer credits, Double GPA) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = credits;
        this.gpa = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentID(Integer anID) {
        studentId = anID;
    }

    public Integer getCredits() {
        return numberOfCredits;
    }

    public void setCredits(Integer credits) {
        numberOfCredits = credits;
    }

    public Double getGPA() {
        return gpa;
    }

    public void setGPA(Double newGPA) {
        gpa = newGPA;
    }

}