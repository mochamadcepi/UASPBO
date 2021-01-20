/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwel.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class config {
    
    private static Connection MySQLConfig;
    private static Connection configDB()throws SQLException{
        try{
            String url = "jdbc.mysql://localhost:3306/tubespbo";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database gagal" + e.getMessage());
        }
        return MySQLConfig;
     }
}
