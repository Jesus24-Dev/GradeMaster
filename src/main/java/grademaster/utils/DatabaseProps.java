/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.utils;

import java.util.Properties;

/**
 *
 * @author Jesus24-Dev
 */
public class DatabaseProps {
    public String getUrl(){
        String url = "jdbc:postgresql://localhost/grademaster";
        return url;
    }
    public Properties getProps(){
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "123456");
        return props;
    }
}
