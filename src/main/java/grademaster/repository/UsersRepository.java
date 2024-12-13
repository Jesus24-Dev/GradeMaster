/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.repository;

import grademaster.models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus24-Dev
 */
public class UsersRepository {
    
    public ArrayList<Users> getUsers(Connection conn, int role, boolean status){
        String query = "SELECT id, name, lastname, birthday, address, gender, rol, status FROM users WHERE rol = ? AND status = ?";
        ArrayList<Users> users = new ArrayList<>();
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setInt(1, role);
            statement.setBoolean(2, status);
            try(ResultSet resultset = statement.executeQuery()){
                while(resultset.next()){
                    Users user = new Users(
                            resultset.getString("id"),
                            resultset.getString("name"),
                            resultset.getString("lastname"),
                            "",
                            resultset.getDate("birthday"),
                            resultset.getString("address"),
                            resultset.getString("gender"),
                            resultset.getInt("rol"),
                            resultset.getBoolean("status")
                    );
                    users.add(user);
                }
            }
            return users;
        } catch(SQLException e){
            return null;
        }
    }
    
    public Users getUser(Connection conn, String id){
        String query = "SELECT id, name, lastname, birthday, address, gender, rol, status FROM users WHERE id = ?";
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setString(1, id);
            try(ResultSet resultset = statement.executeQuery()){
                if(resultset.next()){
                    return new Users(
                            resultset.getString("id"),
                            resultset.getString("name"),
                            resultset.getString("lastname"),
                            "",                          
                            resultset.getDate("birthday"),
                            resultset.getString("address"),
                            resultset.getString("gender"),
                            resultset.getInt("rol"),
                            resultset.getBoolean("status")
                    );
                }
            }
        } catch(SQLException e){
            return null;
        }
        return null;
    }
    
    public void addUser(Connection conn, Users user){
        String query = "INSERT INTO users (id, name, lastname, password, birthday, address, gender, rol, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setString(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getLastname());
            statement.setString(4, user.getPassword());
            statement.setDate(5, user.getBirthday());
            statement.setString(6, user.getAddress());
            statement.setString(7, user.getGender());
            statement.setInt(8, user.getRole());
            statement.setBoolean(9, true);
            
            statement.executeUpdate();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void updateUser(Connection conn, Users user, boolean status){
        String query = "UPDATE users SET id = ?, name = ?, lastname = ?, password = ?, birthday = ?, address = ?, gender = ?, rol = ?, status = ? WHERE id = ?";
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setString(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getLastname());
            statement.setString(4, user.getPassword());
            statement.setDate(5, user.getBirthday());
            statement.setString(6, user.getAddress());
            statement.setString(7, user.getGender());
            statement.setInt(8, user.getRole());
            statement.setBoolean(9, status);
            statement.setString(10, user.getId());
            
            statement.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
         }
    }
    
    public void deleteUser(Connection conn, String id){
        String sql = "UPDATE users SET status = false WHERE id = ?";
        try(PreparedStatement statement = conn.prepareStatement(sql)){
            statement.setString(1, id);
            statement.executeUpdate();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
