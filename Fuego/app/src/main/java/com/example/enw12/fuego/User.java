package com.example.enw12.fuego;

import java.util.HashMap;

/**
 * Created by enw12 on 11/2/2017.
 */

public class User {
    // Attributes of Customer object
    String myFirst;
    String myLast;
    String myUsername;
    String myPassword;
    String myEmail;
    int myPhone;

    HashMap<String, User> userList = new HashMap<>();

    // Constructor
    public User(String first, String last, String username, String password) {
        myFirst = first;
        myLast = last;
        myUsername = username;
        myPassword = password;
    }

    // Checks if there is already a User with same username
    public boolean checkExists() {
        if (! userList.containsKey(this.myUsername)) {
            userList.put(this.myUsername, this);
            return false;
        } else {
            return true;
        }
    }
}
