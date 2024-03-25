/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demoapp;

import com.nth.pojo.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class DemoApp {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //B1: Nap driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //B2: Mo ket noi
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/englishdb", "root", "Admin@123");
        //B3: Thuc thi truy van
        Statement stm = conn.createStatement();
        //Try van van
        ResultSet rs = stm.executeQuery("SELECT * FROM Category");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.printf("%d - %s\n", id, name);
        }
        //Dinh nghia
//        stm.executeUpdate("INSERT INTO Category(name) VALUES ('Stress')");
        //B4: Dong ket noi
        conn.close();
    }
}
