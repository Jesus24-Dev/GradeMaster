/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.Users;
import grademaster.service.UsersService;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class UsersController {
    private final UsersService usersService;
    private final Connection conn;
    
    public UsersController(UsersService usersService, Connection conn){
        this.usersService = usersService;
        this.conn = conn;
    }
    
    public void createUser(Connection conn, String id, String name, String lastname, String password, Date birthday, String address, String gender, int role){
        Users user = new Users(id, name, lastname, password, birthday, address, gender, role, true);
        usersService.createUser(conn, user);
    }
    
    public ArrayList<Users> getStudents(Connection conn, boolean status){
        return usersService.getUsers(conn, 3, status);
    }
    
    public ArrayList<Users> getTeachers(Connection conn, boolean status){
        return usersService.getUsers(conn, 2, status);
    }
    
    public Users getUser(String id){
        return usersService.getUser(id);
    }
    
    public void updateUser(Connection conn, String id, String name, String lastname, String password, Date birthday, String address, String gender, int role, boolean status){
        Users user = new Users(id, name, lastname, password, birthday, address, gender, role, status);
        usersService.updateUser(conn, user, status);
    }
    
    public void deleteUser(Connection conn, String id, boolean newStatus){
        usersService.deleteUser(conn, id, newStatus);
    }
}
