package com.jwj.test;

import com.jwj.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        User userFactory = (User) applicationContext.getBean("userFactory");
        System.out.println(userFactory);
        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user2);
        User user3 = (User) applicationContext.getBean("getUser");
        System.out.println(user3);

    }
}
