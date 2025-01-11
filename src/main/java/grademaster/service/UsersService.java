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
    
    public void createUser(Users user){
        usersRepository.addUser(conn, user);
    }
    
    public ArrayList<Users> getUsers(int role, boolean status){
        return usersRepository.getUsers(conn, role, status);
    }
    
    public Users getUser(String id){
        return usersRepository.getUser(conn, id);
    }
    
    public void updateUser(Users user, boolean status, String oldId){
        usersRepository.updateUser(conn, user, status, oldId);
    }
    
    public void deleteUser(String id, boolean newStatus){
        usersRepository.deleteUser(conn, id, newStatus);
    }
    
    public int authenticateUser(String id, String password){   
        if(id.equals("") || password.equals("")){
            return -2;
        } else{
            Users userToAuthenticate = usersRepository.getUser(conn, id);
            if(userToAuthenticate == null){               
                return 0;
            } else if(userToAuthenticate.getPassword().equals(password) && userToAuthenticate.getId().equals(id)){
                return userToAuthenticate.getRole();
            } else {
                return -1;
            }
        }           
    }
}
