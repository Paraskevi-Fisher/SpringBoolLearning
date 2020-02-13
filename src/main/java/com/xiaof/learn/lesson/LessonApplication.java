package com.xiaof.learn.lesson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.xiaof.learn.lesson.mapper") //可以指定要扫描的Mapper类的包位置，不指定的话无法生成Bean
public class LessonApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(LessonApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Start Application");
        SpringApplication.run(LessonApplication.class, args);
    }
}
