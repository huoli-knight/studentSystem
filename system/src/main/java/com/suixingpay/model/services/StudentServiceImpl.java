package com.suixingpay.model.services;

import com.suixingpay.model.mapper.StudentMapper;
import com.suixingpay.model.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectStudentById(int id){
        return studentMapper.selectStudentById(id);
    }

    @Override
    public ArrayList<Student> selectStudent() {
        return studentMapper.selectStudent();
    }
}
