package com.example.spring_boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_demo.service.InstanceService;

@RestController
public class Instance {
    @Autowired
    private InstanceService instanceService;

    @RequestMapping("/instance")
    public String getInstance() {
        return instanceService.get();
    }
    
}
