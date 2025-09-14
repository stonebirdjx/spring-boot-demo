package com.example.spring_boot_demo.entity;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class MybatisTest {
    @Autowired
    private Integer id;

    @Autowired
    private String name;
    
    @Autowired
    private String phone;
    
    @Autowired
    private String email;
}
