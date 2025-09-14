package com.example.spring_boot_demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.spring_boot_demo.entity.MybatisTest;

@Mapper
public interface MybatisTestMapper {
    @Select("select * from mybatis_test where id = #{id}")
    MybatisTest queryById(int id);

    @Insert("insert into mybatis_test(name, phone, email) values(#{name}, #{phone}, #{email})")
    int insert(MybatisTest mybatisTest);
}
