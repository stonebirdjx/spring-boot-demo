package com.example.spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_demo.dao.InstanceDao;

@Service
public interface InstanceService {
    String get();
}
