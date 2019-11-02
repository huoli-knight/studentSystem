package com.suixingpay.model.mapper;


/*
*@作者：周波
* 日期：2019.11.2
* 内容：管理员账号接口
 */

import com.suixingpay.model.po.Administrator;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface AdministratorMapper {

    @Select("select a.id,a.username,a.password from administrator a where username = #{username}")
    public Administrator getAdminData(String username);

    @Insert("insert into administrator(username, password) values (#{username}, #{password})")
    public int addAdminData(Administrator admin);
}
