package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于bean id= class=
@Component
@Scope("singleton")
public class User {

    //相当于<property id="name" value="kuangshen">
    @Value("hanhan")
    public String name;

    //效果相同
    @Value("kuansghe")
    public void setName(String name) {
        this.name = name;
    }
}
