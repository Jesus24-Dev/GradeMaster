/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.service;

import java.sql.Connection;
import grademaster.repository.GradesRepository;
import grademaster.models.Grades;
import grademaster.utils.StudyEnums.SectionStudy;
import grademaster.utils.StudyEnums.YearStudy;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class GradesService {
    private final GradesRepository gradesRepository;
    private final Connection conn;
    
    public GradesService(GradesRepository gradesRepository, Connection conn){
        this.gradesRepository = gradesRepository;
        this.conn = conn;
    }
    
    public ArrayList<Grades> getGrades(Connection conn, YearStudy yearStudy, SectionStudy sectionStudy){
        return gradesRepository.getGrades(conn, yearStudy, sectionStudy);
    }
    
    public ArrayList<Grades> getGradesByStudent(Connection conn, String id){
        return gradesRepository.getGradesByStudent(conn, id);
    }
    
    public ArrayList<Grades> getGradesBySubject(Connection conn, String subjectName){
        return gradesRepository.getGradesBySubject(conn, subjectName);
    }
    
    public void addGrades(Connection conn, Grades grade, String subject){
        gradesRepository.addGrades(conn, grade, subject);
    }
    
    public void updateGrades(Connection conn, Grades grade, String subject){
        gradesRepository.updateGrades(conn, grade, subject);
    }
    
    public void deleteGrades(Connection conn, Grades grade, String subject){
        gradesRepository.deleteGrades(conn, grade, subject);
    }
}
