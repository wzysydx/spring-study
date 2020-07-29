package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//代表这是一个配置类。就和我们之前看的beans.xml是一样的
@ComponentScan("com.kuang.pojo")//如果没有这句，就不能换成user
//@Import()
public class MyConfig {

    //注册一个bean，就相当于我们之前写的bean
    //这个方法的名字就相当于bean标签中的id属性
    //方法的返回值相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User();//就是返回要注入的对象
    }
}
