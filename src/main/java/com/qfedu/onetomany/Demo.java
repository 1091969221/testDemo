package com.qfedu.onetomany;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Demo {
    private static SqlSessionFactory factory = null;
    static {
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(resourceAsReader);

    }
    public static void findCourseByS_id(){
        SqlSession session = factory.openSession();
        StudentDao mapper = session.getMapper(StudentDao.class);
        Student student = mapper.findCourseByS_id(1);
        List<Course> course = student.getCourseList();
        for (Course course1 : course) {
            System.out.println(course1);
        }
//        List<Score> scores = student.getScores();
//        List<Student> courseByS_id = mapper.findCourseByS_id(1);
//        for (Student student : courseByS_id) {
//            System.out.println(student);
//        }
//        for (Score score : scores) {
//            System.out.println(score);
//        }
        session.commit();
        session.close();
    }
    public static void main(String[] args) {
        findCourseByS_id();
    }
}
