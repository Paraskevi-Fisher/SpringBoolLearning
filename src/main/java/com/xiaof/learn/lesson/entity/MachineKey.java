package com.xiaof.learn.lesson.entity;

public class MachineKey {
    private Integer machNum;

    private Integer jobOrder;

    public MachineKey(Integer machNum, Integer jobOrder) {
        this.machNum = machNum;
        this.jobOrder = jobOrder;
    }

    public MachineKey() {
        super();
    }

    public Integer getMachNum() {
        return machNum;
    }

    public void setMachNum(Integer machNum) {
        this.machNum = machNum;
    }

    public Integer getJobOrder() {
        return jobOrder;
    }

    public void setJobOrder(Integer jobOrder) {
        this.jobOrder = jobOrder;
    }
}