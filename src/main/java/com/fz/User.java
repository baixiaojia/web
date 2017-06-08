package com.fz;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by webrx on 2017-06-08.
 */
public class User {
    public static void main(String[] args) {
        Properties pro = new Properties();
        try {
            pro.load(User.class.getClassLoader().getResourceAsStream("db.properties"));
            System.out.println(pro.get("user"));
            System.out.println(pro.get("password"));
            System.out.println(pro.get("dbname"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
