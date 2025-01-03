/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.service;

import java.sql.Connection;
import grademaster.repository.GradesRepository;
import grademaster.models.Grades;
import grademaster.utils.StudyEnums.Period;
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
    
    public ArrayList<Grades> getGrades(YearStudy yearStudy, Period period){
        return gradesRepository.getGrades(conn, yearStudy, period);
    }
    
    public ArrayList<Grades> getGradesByStudent(String id){
        return gradesRepository.getGradesByStudent(conn, id);
    }
    
    public ArrayList<Grades> getGradesBySubject(String subjectName, YearStudy yearStudy, Period period, SectionStudy sectionStudy){
        return gradesRepository.getGradesBySubject(conn, subjectName, yearStudy, period, sectionStudy);
    }
    
    public void addGrades(Grades grade, String subject){
        gradesRepository.addGrades(conn, grade, subject);
    }
    
    public void updateGrades(Grades grade, String subject){
        gradesRepository.updateGrades(conn, grade, subject);
    }
    
    public void deleteGrades(Grades grade, String subject){
        gradesRepository.deleteGrades(conn, grade, subject);
    }
    
    public ArrayList<Grades> getGradesBySubjectTeacher(String subjectName, YearStudy yearStudy, SectionStudy sectionStudy){
        return gradesRepository.getGradesBySubjectTeacher(conn, subjectName, yearStudy, sectionStudy);
    }
}
