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
    
    public ArrayList<Users> getUsers(Connection conn, int role){
        String query = "SELECT id, name, lastname, birthday, address, gender, rol, status FROM users WHERE rol = ? AND status = ?";
        ArrayList<Users> users = new ArrayList<>();
        try(PreparedStatement statement = conn.prepareStatement(query)){
            statement.setInt(1, role);
            statement.setBoolean(2, true);
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
}
