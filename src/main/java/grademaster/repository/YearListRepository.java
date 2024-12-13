/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.repository;

import grademaster.models.YearList;
import grademaster.utils.StudyEnums.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */

public class YearListRepository {
    public ArrayList<YearList> getYearList(Connection conn, YearStudy yearStudy, SectionStudy sectionStudy){
        ArrayList<YearList> list = new ArrayList<>();
        String sql = """
                     SELECT a.id, a.name, a.lastname, b.yearstudy, b.section
                     FROM yearlist b
                     LEFT JOIN users a on a.id = b.studentid
                     WHERE yearstudy = ? AND section = ?""";
        
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, yearStudy.toString());
            pstm.setString(2, sectionStudy.toString());
            
            
            try(ResultSet rs = pstm.executeQuery()){
                if(rs.next()){
                    do {
                        YearList student = new YearList(
                                rs.getString("id"),                            
                                YearStudy.valueOf(rs.getString("yearstudy")),
                                SectionStudy.valueOf(rs.getString("section")),
                                rs.getString("name"),
                                rs.getString("lastname")
                        );
                        list.add(student);
                    } while (rs.next());
                }
            }           
            return list;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }      
    }
    
    public void addStudentToList(Connection conn, YearList student){
        String sql = "INSERT INTO yearlist (studentid, yearstudy, section) VALUES (?, ?, ?)";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, student.getStudentId());
            pstm.setString(2, student.getYearStudy().toString());
            pstm.setString(3, student.getSection().toString());
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void updateList(Connection conn, YearList student){
        String sql = "UPDATE yearlist SET yearstudy = ?, section = ? WHERE studentid = ?";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){     
            pstm.setString(1, student.getYearStudy().toString());
            pstm.setString(2, student.getSection().toString());
            pstm.setString(3, student.getStudentId());
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void deleteFromList(Connection conn, String id){
        String sql = "DELETE FROM yearlist WHERE studentid = ?";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){     
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
