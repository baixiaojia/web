package com;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by webrx on 2017-06-08.
 */
public class Hello {

    @Test
    public void yy(){
        Properties pro = new Properties();
        try {
            pro.load(Hello.class.getClassLoader().getResourceAsStream("db.properties"));
            System.out.println(pro.get("user"));
            System.out.println(pro.get("password"));
            System.out.println(pro.get("dbname"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
