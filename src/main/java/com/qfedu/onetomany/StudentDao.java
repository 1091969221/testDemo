package com.qfedu.onetomany;

import com.qfedu.onetomany.Student;

import java.util.List;

public interface StudentDao {
    public  Student findCourseByS_id(Integer id);
}
