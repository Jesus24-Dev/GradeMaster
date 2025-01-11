/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.models;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Jesus24-Dev
 */
public class Database {
    private Connection conn = null;
    private String url;
    private Properties props;

    public Database(String url, Properties props) {
        this.url = url;
        this.props = props;
    }
      
    public Connection createConnection(){
        try { 
            conn = DriverManager.getConnection(url, props);
        } catch (SQLException e){}
        return conn;
    }
    
}
