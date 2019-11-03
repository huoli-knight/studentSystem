package com.suixingpay.model.services;

import com.suixingpay.model.po.S_grade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface CourseService {
    ArrayList<S_grade> selectCourseById(int id);
}
