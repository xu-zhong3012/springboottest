package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author xuzhong
 * @data 2021/3/12 - 14:33
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@Component
public class Cat {
    private String name;
    private int age;
    private Dog dog;
    public Cat(){}
}
