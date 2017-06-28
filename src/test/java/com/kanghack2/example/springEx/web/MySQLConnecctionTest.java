package com.kanghack2.example.springEx.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by hankanghak on 2017. 6. 28..
 */
public class MySQLConnecctionTest {


    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";

    private static final String USER = "root";

    private static final String PW = "gksrkd4572";


    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
