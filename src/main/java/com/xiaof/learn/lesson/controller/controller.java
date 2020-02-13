package com.xiaof.learn.lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class controller {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String answer() {
        return "hello World";
    }
}
