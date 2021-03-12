package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Cat;
import com.atguigu.boot.bean.Dog;
import com.atguigu.boot.bean.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author xuzhong
 * @data 2021/3/12 - 14:37
 */

/*
1.配置类里面使用@Bean标注在方法上给容器注册组件，默认也是但实例的
2.配置类本身也是组件
3.proxyBeanMethods:代理bean的方法
           Full(proxyBeanMethods=true)、
           Lite(proxyBeanMethods=false)
           组件依赖

4.@Import({User.class,DBHelper.class})
           给容器中自动创建出这两个类型的组件,默认组件名字为该类的全类路径名

5.@ImportResource("classpath:beans.xml")导入spring的配置文件
 */
@Configuration(proxyBeanMethods = true)//这个值表示这个配置类作为代理类，这是一个配置类==配置文件
//@Import({Person.class, DBHelper.class})
//@ConditionalOnBean(name="dog02")//如果没有组件dog01，那么全部都失效
//@ConditionalOnMissingBean(name="dog02")
@EnableConfigurationProperties(Person.class)//@EnableConfigurationProperties+@ConfigurationProperties
//1.开启Person配置绑定功能（application.properties）
//2.把这个Person这个组件自动注册到容器中
public class MyConfig {


   // @Bean//给容器中添加组件，以方法名作为组件ID，返回类型就是组件类型。返回的值就是组件在容器中的实例
    public Dog dog01(){
        return new Dog("欧迪",3);
    }

    //@Bean
    public Dog dog02(){
        return new Dog("欧迪",4);
    }

   // @ConditionalOnBean(name="dog01")//如果没有组件dog01，那么cat组件将失效
    //@Bean("cat")
    public Cat cat01(){
        return new Cat("加菲",4,dog01());
    }
}
