package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {

    public class Course {
        private String courseName;
        private Integer courseNumber;
        private Integer semesterCredit;
        private String instructor;
        private ArrayList classRoster = new ArrayList();
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private Integer yearsTeaching;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String aName) {
            firstName = aName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String aName) {
            lastName = aName;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String aSubject) {
            subject = aSubject;
        }

        public Integer getYearsTeaching() {
            return yearsTeaching;
        }

        public void setStudentID(Integer years) {
            yearsTeaching = years;
        }

    }

    public static void main(String[] args) {
        Student Richard = new Student("Richard", 007, 1, 4.0);
    }
}
