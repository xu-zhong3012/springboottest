package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuzhong
 * @data 2021/3/12 - 14:23
 */
@RestController
public class WorldController {
    @RequestMapping("/w")
    public String world(){
        return "World";
    }
}
