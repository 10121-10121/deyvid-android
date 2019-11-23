package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;

    public static  Boolean passwordIsValid(String User, String Password) {

        for (Users i : getUsers()) {
            if (i.username.equals(User)) {
                if (i.password.equals(Password)){
                    return true;
                }
            }
        }
        return false;
    }



    public static List<Users> getUsers() {
        ArrayList<Users> List = new ArrayList<Users>();

        Users o = new Users();
        o.username = "bichito";
        o.password = "123456";
        List.add(o);

        Users t = new Users();
        t.username = "juanita";
        t.password = "123456";
        List.add(t);

        return List;
    }

}
