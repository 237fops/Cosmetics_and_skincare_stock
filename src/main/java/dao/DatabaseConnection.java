/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author FOPA TSEUTCHOUA
 */
public class DatabaseConnection {
    public static Connection getconn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement?useSSL=false", "root","");
            return conn;
        }
    catch(Exception e){
        System.out.println(e);
        return null;
    }
    
}}
