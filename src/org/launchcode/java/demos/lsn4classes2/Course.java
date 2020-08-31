package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public boolean equals(Object toBeCompared) {
        Boolean output = false;
        if (toBeCompared == this) { output = true; }
        if (toBeCompared == null) { output = false; }
        if (toBeCompared.getClass() != getClass()) { output = false; }
        return output;
    }

    public String toString (Object toString) {
        return "Class Name: " + topic + ", Instructor: " + instructor + ", Class Size: " +
                enrolledStudents.size() + ".";
    }

}
