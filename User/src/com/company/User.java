package com.company;

import java.util.Set;

public class User {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String username, String password, int age, Set<Integer> orderIDs) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.orderIDs = orderIDs;
    }
}
