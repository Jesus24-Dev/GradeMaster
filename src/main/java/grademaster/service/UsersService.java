/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.service;

import grademaster.models.Users;
import grademaster.repository.UsersRepository;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class UsersService {
    private final UsersRepository usersRepository;
    private final Connection conn;

    public UsersService(UsersRepository usersRepository, Connection conn) {
        this.usersRepository = usersRepository;
        this.conn = conn;
    }
    
    public void createUser(Connection conn, Users user){
        usersRepository.addUser(conn, user);
    }
    
    public ArrayList<Users> getUsers(Connection conn, int role, boolean status){
        return usersRepository.getUsers(conn, role, status);
    }
    
    public Users getUser(String id){
        return usersRepository.getUser(conn, id);
    }
    
    public void updateUser(Connection conn, Users user, boolean status){
        usersRepository.updateUser(conn, user, true);
    }
    
    public void deleteUser(Connection conn, String id, boolean newStatus){
        usersRepository.deleteUser(conn, id, newStatus);
    }
}
