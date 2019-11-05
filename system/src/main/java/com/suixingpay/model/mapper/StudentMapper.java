package com.suixingpay.model.mapper;

import com.suixingpay.model.po.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;

public interface StudentMapper {

    @Delete(" delete from student where sudentId = #{sudentId} ")
    public int deleteById(Student student);

    @Select("SELECT id,sudentId,name,sex,age,address,email from student WHERE sudentId = #{sudentId};")
    Student selectStudentById(Student student);

    @Select("SELECT id,sudentId,name,sex,age,address,email from student")
    ArrayList<Student> selectStudent();

    @Insert("INSERT into student set sudentId=#{sudentId},name=#{name},sex=#{sex},age=#{age},address=#{address},email=#{email}")
    int addStudent(Student student);

    @Update("<script>" +
            "UPDATE student" +
            "<set>" +
            "<if test = 'name != null'> name = #{name},</if>" +
            "<if test = 'sex != null'> sex = #{sex},</if>" +
            "<if test = 'age != null'> age = #{age},</if>" +
            "<if test = 'address != null'> address = #{address},</if>" +
            "<if test = 'email != null'> email = #{email}</if>" +
            "</set>" +
            "where sudentId = #{sudentId}" +
            "</script>")
    public int alert(Student student);
}
