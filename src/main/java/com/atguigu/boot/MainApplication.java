package com.atguigu.boot;

import com.atguigu.boot.bean.Cat;
import com.atguigu.boot.bean.Dog;
import com.atguigu.boot.bean.Person;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication：这是一个springboot应用
 * @author xuzhong
 * @data 2021/3/12 - 10:43
 */
@SpringBootApplication(scanBasePackages = "com.atguigu")
/*
@SpringBootConfiguration//代表当前是一个配置类
@EnableAutoConfiguration//利用Register给容器导入一系列组件，将指定一个包下所有的组件导入进来：main程序所在包下的所有组件
@ComponentScan//要扫描哪些包，spring注解
 */
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run= SpringApplication.run(MainApplication.class,args);
        String[] names =run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        /*Cat cat1=run.getBean("cat",Cat.class);
        Cat cat2=run.getBean("cat",Cat.class);
        System.out.println("组件："+(cat1==cat2));
        MyConfig bean=run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法，springboot总会检查这个组件是否在容器中有
        //保持组件但实例
        Cat cat3=bean.cat01();
        Cat cat4=bean.cat01();
        System.out.println(cat3==cat4);

        Cat cat=run.getBean("cat",Cat.class);
        Dog dog=run.getBean("dog01",Dog.class);
        System.out.println("用户的宠物："+(cat.getDog()==dog));

        System.out.println("===================================");
        String[] ns=run.getBeanNamesForType(Person.class);
        for (String n : ns) {
            System.out.println(n);
        }

        Person person=run.getBean("com.atguigu.boot.bean.Person",Person.class);
        System.out.println(person);*/

        boolean existDog02=run.containsBean("dog02");
        System.out.println("容器中dog02组件："+existDog02);

        boolean existDog=run.containsBean("dog01");
        System.out.println("容器中dog01组件："+existDog);

        boolean existCat=run.containsBean("cat");
        System.out.println("容器中cat组件："+existCat);

        int count=run.getBeanDefinitionCount();
        System.out.println(count);


    }

}
