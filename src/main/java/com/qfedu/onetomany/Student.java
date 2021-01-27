package com.qfedu.onetomany;

import java.util.List;

public class Student {
    private Integer s_id;
    private String  s_name;
    private String  s_birth;
    private String  s_sex;
    private List<Course> courseList;
    private List<Score> scores;

    public Integer getS_id() {
        return s_id;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_birth() {
        return s_birth;
    }

    public void setS_birth(String s_birth) {
        this.s_birth = s_birth;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }



    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_birth='" + s_birth + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", courses=" + courseList +
                ", scores=" + scores +
                '}';
    }
}
