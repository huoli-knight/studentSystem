package com.suixingpay.model.mapper;

import com.suixingpay.model.po.S_grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface CourseMapper {
    @Select("SELECT\n" +
            "\tstudent.NAME,\n" +
            "\tcourse.NAME,\n" +
            "\tgrade \n" +
            "FROM\n" +
            "\tstudent\n" +
            "\tRIGHT JOIN s_grade ON student.id = s_grade.s_id\n" +
            "\tLEFT JOIN course ON s_grade.c_id = course.id \n" +
            "WHERE\n" +
            "\ts_grade.s_id = #{id};")
    ArrayList<S_grade> selectCourseById(int id);

}
