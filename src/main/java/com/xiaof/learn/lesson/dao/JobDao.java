package com.xiaof.learn.lesson.dao;

import com.xiaof.learn.lesson.entity.Job;
import com.xiaof.learn.lesson.entity.JobExample;
import com.xiaof.learn.lesson.mapper.JobMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class JobDao {

    @Resource
    private JobMapper jobMapper;

    public List<Job> selectByJobNum(int num) {
        JobExample example = new JobExample();
        example.createCriteria().andJobNumEqualTo(num);
        return jobMapper.selectByExample(example);
    }
}
