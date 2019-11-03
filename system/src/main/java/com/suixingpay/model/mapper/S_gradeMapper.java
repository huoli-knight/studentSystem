package com.suixingpay.model.mapper;

import com.suixingpay.model.po.S_grade;

import org.apache.ibatis.annotations.Update;

public interface S_gradeMapper {

    //修改学生成绩
    @Update("UPDATE s_grade s  SET s.grade=#{grade} WHERE s.s_id =#{s_id} AND s.c_id=#{c_id};")
    public int alert(S_grade s_grade);
}
