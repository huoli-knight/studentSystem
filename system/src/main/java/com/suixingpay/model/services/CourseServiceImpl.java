package com.suixingpay.model.services;

import com.suixingpay.model.mapper.CourseMapper;
import com.suixingpay.model.po.S_grade;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;
    @Override
    public ArrayList<S_grade> selectCourseById(int id) {
        return courseMapper.selectCourseById(id);
    }
}