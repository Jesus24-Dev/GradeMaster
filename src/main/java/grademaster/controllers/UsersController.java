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
    
    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }
    
    public int createUser(String id, String name, String lastname, String password, Date birthday, String address, String gender, int role){
        Users user = new Users(id, name, lastname, password, birthday, address, gender, role, true);
        try {
            usersService.createUser(user);
            return 1;
        } catch (RuntimeException e){
            return -1;
        }        
    }
    
    public ArrayList<Users> getStudents(boolean status){
        return usersService.getUsers(3, status);
    }
    
    public ArrayList<Users> getTeachers(boolean status){
        return usersService.getUsers(2, status);
    }
    
    public Users getUser(String id){
        return usersService.getUser(id);
    }
    
    public void updateUser(String id, String name, String lastname, String password, Date birthday, String address, String gender, int role, boolean status){
        Users user = new Users(id, name, lastname, password, birthday, address, gender, role, status);
        usersService.updateUser(user, status);
    }
    
    public void deleteUser(String id, boolean newStatus){
        usersService.deleteUser(id, newStatus);
    }
    
    public int authenticate(String id, String password){
        return usersService.authenticateUser(id, password);
    }
}
