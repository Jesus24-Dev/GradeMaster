/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.Grades;
import grademaster.service.GradesService;
import grademaster.utils.StudyEnums.*;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
/**
 *
 * @author Jesus24-Dev
 */
public class GradesController {
    private final GradesService gradesService;
    private final Connection conn;
    
    public GradesController(GradesService gradesService, Connection conn){
        this.gradesService = gradesService;
        this.conn = conn;
    }
    
    public ArrayList<Grades> getGrades(Connection conn, YearStudy yearStudy, SectionStudy sectionStudy){
        return gradesService.getGrades(conn, yearStudy, sectionStudy);
    }
    
    public ArrayList<Grades> getGradesByStudent(Connection conn, String id){
        return gradesService.getGradesByStudent(conn, id);
    }
    
    public ArrayList<Grades> getGradesBySubject(Connection conn, String subjectName){
        return gradesService.getGradesBySubject(conn, subjectName);
    }
    
    public void createGrade(String studentId, YearStudy yearStudy, Test activity, Period period, SectionStudy sectionStudy, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period, sectionStudy, gradeN);
        gradesService.addGrades(conn, grade, nameSubject);
    }
    
    public void updateGrade(String studentId, YearStudy yearStudy, Test activity, Period period, SectionStudy sectionStudy, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period, sectionStudy, gradeN);
        gradesService.updateGrades(conn, grade, nameSubject);
    }
    
    public void deleteGrade(String studentId, YearStudy yearStudy, Test activity, Period period, SectionStudy sectionStudy, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period, sectionStudy, gradeN);
        gradesService.deleteGrades(conn, grade, nameSubject);
    }
}
