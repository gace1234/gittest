package com.jwj.factory;

import com.jwj.pojo.User;

public class UserFactory {

    public static User getBean() {
        return new User("asc", "aaaa");
    }

    public User getBean2() {
        return new User("abc", "abcd");
    }

}
