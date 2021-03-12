package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzhong
 * @data 2021/3/12 - 10:47
 */
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person getPerson(){
        return person;
    }

    @RequestMapping("/hello")
    public String handle01(@RequestParam("name" )String name){
        return "Hello, Springboot Boot 2!"+name;
    }
}
