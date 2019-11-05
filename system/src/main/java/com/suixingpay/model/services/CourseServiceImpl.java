package com.suixingpay.model.services;

import com.suixingpay.model.mapper.CourseMapper;
import com.suixingpay.model.mapper.S_gradeMapper;
import com.suixingpay.model.po.S_grade;
import com.suixingpay.model.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    S_gradeMapper s_gradeMapper;
    @Override
    public ArrayList<S_grade> selectCourseById(int id) {
        return courseMapper.selectCourseById(id);
    }
    @Override
    public int alertCourseById(S_grade s_grade) {
        if(s_gradeMapper.alert(s_grade) > 0) {
            return 1;
        }
        return 0;
    }
}
