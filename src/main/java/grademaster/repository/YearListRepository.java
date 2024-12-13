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
}
