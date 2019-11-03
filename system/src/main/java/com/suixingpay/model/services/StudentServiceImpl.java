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
    private StudentMapper studentMapper;

    @Override
    public Student selectStudentById(int sudentid){
        return studentMapper.selectStudentById(sudentid);
    }

    @Override
    public ArrayList<Student> selectStudent() {
        return studentMapper.selectStudent();
    }

    @Override
    public int alertStudent(Student student) {
        if(studentMapper.alert(student) > 0) {
            return 1;
        }
        return 0;
    }
}
