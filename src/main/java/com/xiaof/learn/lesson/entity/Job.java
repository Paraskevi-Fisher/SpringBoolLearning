package com.xiaof.learn.lesson.entity;

public class Job extends JobKey {
    private Integer machNum;

    private Integer time;

    private Boolean isUrgent;

    public Job(Integer jobNum, Integer partNum, Integer machNum, Integer time, Boolean isUrgent) {
        super(jobNum, partNum);
        this.machNum = machNum;
        this.time = time;
        this.isUrgent = isUrgent;
    }

    public Job() {
        super();
    }

    public Integer getMachNum() {
        return machNum;
    }

    public void setMachNum(Integer machNum) {
        this.machNum = machNum;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Boolean isUrgent) {
        this.isUrgent = isUrgent;
    }
}