/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.repository;

import grademaster.models.Grades;
import grademaster.utils.StudyEnums.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class GradesRepository {
    public ArrayList<Grades> getGrades(Connection conn, YearStudy yearStudy, SectionStudy sectionStudy){
        ArrayList<Grades> grades = new ArrayList<>();
        String query = """
                       SELECT a.id, a.name, a.lastname, b.namesubject, c.yearstudy, c.activity, c.periodtest, c.sectionstudy, c.grade
                       FROM grades c
                       INNER JOIN  users a on c.studentid = a.id
                       INNER JOIN subject b on b.id = c.subjectid
                       WHERE c.yearstudy = ? AND c.sectionstudy = ?
                       """;
        try(PreparedStatement pstm = conn.prepareStatement(query)){
            pstm.setString(1, yearStudy.toString());
            pstm.setString(2, sectionStudy.toString());
            
            ResultSet rs = pstm.executeQuery();
                if(rs.next()){
                    do {
                    Grades grade = new Grades(
                            rs.getString("id"),
                            rs.getString("name"),
                            rs.getString("lastname"),
                            rs.getString("namesubject"),
                            YearStudy.valueOf(rs.getString("yearstudy")),
                            Test.valueOf(rs.getString("activity")),
                            Period.valueOf(rs.getString("periodtest")),
                            SectionStudy.valueOf(rs.getString("sectionstudy")),
                            rs.getFloat("grade")
                    ); 
                    grades.add(grade);
                } while(rs.next());
            }
            return grades;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList<Grades> getGradesByStudent(Connection conn, String id){
        ArrayList<Grades> grades = new ArrayList<>();
        String query = """
                       SELECT a.id, a.name, a.lastname, b.namesubject, c.yearstudy, c.activity, c.periodtest, c.sectionstudy, c.grade
                       FROM grades c
                       INNER JOIN  users a on c.studentid = a.id
                       INNER JOIN subject b on b.id = c.subjectid
                       WHERE c.studentid = ?
                       """;
        try(PreparedStatement pstm = conn.prepareStatement(query)){
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
                if(rs.next()){
                    do {
                    Grades grade = new Grades(
                            rs.getString("id"),
                            rs.getString("name"),
                            rs.getString("lastname"),
                            rs.getString("namesubject"),
                            YearStudy.valueOf(rs.getString("yearstudy")),
                            Test.valueOf(rs.getString("activity")),
                            Period.valueOf(rs.getString("periodtest")),
                            SectionStudy.valueOf(rs.getString("sectionstudy")),
                            rs.getFloat("grade")
                    ); 
                    grades.add(grade);
                } while(rs.next());
            }
            return grades;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public ArrayList<Grades> getGradesBySubject(Connection conn, String subjectName){
        ArrayList<Grades> grades = new ArrayList<>();
        String query = """
                       SELECT a.id, a.name, a.lastname, b.namesubject, c.yearstudy, c.activity, c.periodtest, c.sectionstudy, c.grade
                       FROM grades c
                       INNER JOIN  users a on c.studentid = a.id
                       INNER JOIN subject b on b.id = c.subjectid
                       WHERE c.subjectid = (SELECT id FROM subject WHERE namesubject = ?)
                       """;
        try(PreparedStatement pstm = conn.prepareStatement(query)){
            pstm.setString(1, subjectName);
            ResultSet rs = pstm.executeQuery();
                if(rs.next()){
                    do {
                    Grades grade = new Grades(
                            rs.getString("id"),
                            rs.getString("name"),
                            rs.getString("lastname"),
                            rs.getString("namesubject"),
                            YearStudy.valueOf(rs.getString("yearstudy")),
                            Test.valueOf(rs.getString("activity")),
                            Period.valueOf(rs.getString("periodtest")),
                            SectionStudy.valueOf(rs.getString("sectionstudy")),
                            rs.getFloat("grade")
                    ); 
                    grades.add(grade);
                } while(rs.next());
            }
            return grades;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public void addGrades(Connection conn, Grades grade, String subject){
        String sql = "INSERT INTO grades (studentid, subjectid, yearstudy, activity, periodtest, grade, sectionstudy)"
                + " VALUES (?, (SELECT id FROM subject WHERE namesubject = ?), ?, ?, ?, ?, ?)";
        try (PreparedStatement psmt = conn.prepareStatement(sql)){
            psmt.setString(1, grade.getStudentId());
            psmt.setString(2, subject);
            psmt.setString(3, grade.getYearStudy().toString());
            psmt.setString(4, grade.getActivity().toString());
            psmt.setString(5, grade.getPeriod().toString());
            psmt.setFloat(6, grade.getGrade());
            psmt.setString(7, grade.getSectionStudy().toString());
            psmt.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
