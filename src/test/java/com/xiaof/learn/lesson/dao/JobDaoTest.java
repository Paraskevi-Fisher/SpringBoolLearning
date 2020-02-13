package com.xiaof.learn.lesson.dao;

import com.xiaof.learn.lesson.LessonApplication;
import com.xiaof.learn.lesson.entity.Job;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LessonApplication.class)
@WebAppConfiguration
class JobDaoTest {

    @Resource
    private JobDao jobDao;

    @Test
    void selectByJobNum() {
        List<Job> result = jobDao.selectByJobNum(0);
        Assert.assertEquals(3, result.size());
    }
}