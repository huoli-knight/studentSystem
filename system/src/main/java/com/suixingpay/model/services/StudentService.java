package com.suixingpay.model.services;

import com.suixingpay.model.po.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface StudentService {
    Student selectStudentById(int id);
    ArrayList<Student> selectStudent();

    public int alertStudent(Student student);
}
