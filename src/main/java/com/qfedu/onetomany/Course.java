package com.qfedu.onetomany;

import java.util.List;

public class Course {
    private String  c_id;
    private String  c_name;
    private String  t_id;
    private List<Student> students;
    private List<Score> score;

    public List<Score> getScore() {
        return score;
    }

    public void setScore(List<Score> score) {
        this.score = score;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course(String c_id, String c_name, String t_id, List<Student> students, List<Score> score) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.t_id = t_id;
        this.students = students;
        this.score = score;
    }

    public Course(String c_id, String c_name, String t_id, List<Student> students) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.t_id = t_id;
        this.students = students;
    }
}
