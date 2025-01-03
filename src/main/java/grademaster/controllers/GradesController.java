/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.Grades;
import grademaster.service.GradesService;
import grademaster.utils.StudyEnums.*;
import java.sql.Connection;
import java.util.ArrayList;
/**
 *
 * @author Jesus24-Dev
 */
public class GradesController {
    private final GradesService gradesService;
    
    public GradesController(GradesService gradesService){
        this.gradesService = gradesService;
    }
    
    public ArrayList<Grades> getGrades(YearStudy yearStudy, Period period){
        return gradesService.getGrades(yearStudy, period);
    }
    
    public ArrayList<Grades> getGradesByStudent(String id){
        return gradesService.getGradesByStudent(id);
    }
    
    public ArrayList<Grades> getGradesBySubject(String subjectName, YearStudy yearStudy, Period period, SectionStudy section){
        return gradesService.getGradesBySubject(subjectName, yearStudy, period, section);
    }
    
    public void createGrade(String studentId, YearStudy yearStudy, Test activity, Period period, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period,gradeN);
        gradesService.addGrades(grade, nameSubject);
    }
    
    public void updateGrade(String studentId, YearStudy yearStudy, Test activity, Period period, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period, gradeN);
        gradesService.updateGrades(grade, nameSubject);
    }
    
    public void deleteGrade(String studentId, YearStudy yearStudy, Test activity, Period period, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period, gradeN);
        gradesService.deleteGrades(grade, nameSubject);
    }
    
    public ArrayList<Grades> getGradesBySubjectTeacher(String subjectName, YearStudy yearStudy, SectionStudy sectionStudy){
        return gradesService.getGradesBySubjectTeacher(subjectName, yearStudy, sectionStudy);
    }
}
