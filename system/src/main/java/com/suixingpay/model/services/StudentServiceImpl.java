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
    public Student selectStudentById(Student student){
        return studentMapper.selectStudentById(student);
    }

    @Override
    public ArrayList<Student> selectStudent() {
        return studentMapper.selectStudent();
    }

    @Override
    public int alertStudent(Student student) {
        try {
            if(studentMapper.alert(student) > 0) {
                return 1;
            }

        }catch (Exception e) {
            return 0;
        }
        return 0;
    }
    @Override
    public int delete(Student student) {
        try {
            if(studentMapper.deleteById(student) > 0){
                return 1;
            }

        }catch (Exception e) {
            return 0;
        }
        return 0;
    }

    @Override
    public int addStudent(Student student) {
        try {
            if(studentMapper.addStudent(student) > 0) {
                return 1;
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }

}
