package com.xiaof.learn.lesson.entity;

public class Machine extends MachineKey {
    private Integer jobNum;

    private Integer partNum;

    private Integer time;

    private Integer startTime;

    public Machine(Integer machNum, Integer jobOrder, Integer jobNum, Integer partNum, Integer time, Integer startTime) {
        super(machNum, jobOrder);
        this.jobNum = jobNum;
        this.partNum = partNum;
        this.time = time;
        this.startTime = startTime;
    }

    public Machine() {
        super();
    }

    public Integer getJobNum() {
        return jobNum;
    }

    public void setJobNum(Integer jobNum) {
        this.jobNum = jobNum;
    }

    public Integer getPartNum() {
        return partNum;
    }

    public void setPartNum(Integer partNum) {
        this.partNum = partNum;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
}