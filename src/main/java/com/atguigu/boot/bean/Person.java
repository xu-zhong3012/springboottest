package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xuzhong
 * @data 2021/3/12 - 15:20
 */
/*
1.只有在容器中的组件，才会拥有SpringBoot提供的强大功能

 */
@Data
@Getter
@Setter
@AllArgsConstructor
//@Component
@ConfigurationProperties(prefix = "person")//
public class Person {
    public String name;
    public int age;
    public Cat cat;
    public Person(){}
}
