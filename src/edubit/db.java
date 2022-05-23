/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edubit;

/**
 *
 * @author Hyrex
 */
import java.sql.*;
import javax.swing.*;
public class db {

    private static Connection conn=null;
    public static Connection java_db(){
        
        try{
            
             String username="root";
             String password="";
             String url="jdbc:mysql://localhost:3306/rpems";
             conn=DriverManager.getConnection(url, username, password);
       
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return conn;
        
    }
}