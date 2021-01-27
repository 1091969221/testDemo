package com.qfedu.onetomany;

public class Score {
    private String  s_id;
    private String  c_id;
    private Integer s_score;
    private Student student;
    private Course  course;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public Integer getS_score() {
        return s_score;
    }

    public void setS_score(Integer s_score) {
        this.s_score = s_score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Score{" +
                "s_id='" + s_id + '\'' +
                ", c_id='" + c_id + '\'' +
                ", s_score=" + s_score +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
