package com.example.spring_boot_demo.entity;

public class InstanceEntity {
    private String instanceId;

    public InstanceEntity(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}
