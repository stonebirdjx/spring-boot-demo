package com.example.spring_boot_demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_demo.entity.MybatisTest;
import com.example.spring_boot_demo.service.MybatisTestService;

@RestController
@MapperScan("com.yxjiang.staservice.mapper")
public class MybatisTestController {
  @Autowired
  private MybatisTestService mybatisTestService;

    @RequestMapping("/getMybatisInfo/{id}")
    public String getMybatisInfo(@PathVariable int id){
     return mybatisTestService.queryById(id).toString();
   }

    @RequestMapping("/saveMybatisInfo")
    public void saveMybatisInfo(@RequestBody MybatisTest mybatisTest){
        mybatisTestService.insert(mybatisTest);
    }
}

