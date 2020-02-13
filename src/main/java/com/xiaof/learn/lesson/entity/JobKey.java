package com.xiaof.learn.lesson.entity;

public class JobKey {
    private Integer jobNum;

    private Integer partNum;

    public JobKey(Integer jobNum, Integer partNum) {
        this.jobNum = jobNum;
        this.partNum = partNum;
    }

    public JobKey() {
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
}