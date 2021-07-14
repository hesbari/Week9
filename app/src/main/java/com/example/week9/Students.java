package com.example.week9;

import java.io.Serializable;
import java.util.Arrays;

public class Students implements Serializable {

    private String id;
    private String name;
    private String email;
    private float[] marks;

    public Students(String id, String name, String email, float[] marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getAverage(){
            float sum = 0;
        for (float mark : marks)
            sum +=mark;

        return (sum/marks.length);

    }

    @Override
    public String toString() {
        return "Students " +
                "id='" + id + '\n' +
                ", name='" + name + '\n' +
                ", email='" + email + '\n' +
                ", marks=" + Arrays.toString(marks) + '\n'+
                ", average="+String.valueOf(getAverage()) +
                '}';
    }
}
