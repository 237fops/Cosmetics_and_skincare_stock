/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author FOPA TSEUTCHOUA
 */
public class tables {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseConnection.getconn();

            st = conn.createStatement();
            // st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(255),mobileNumber varchar(50),email varchar(255),password varchar(50),address varchar(255),status varchar(50))");
            // st.executeUpdate("insert into appuser (userRole,name,mobileNumber,email,password,address,status) values('superAdmin','fops','658712381','fops@gmail.com','12345','cameroon','active')");
            //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(255));");
            // st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key,name varchar(255),quantity int,price int,description varchar(255),category_fk int)")
            st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,name varchar(255),mobileNumber varchar(50),email varchar(255))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                conn.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}
