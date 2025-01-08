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
    
    public int createGrade(String studentId, YearStudy yearStudy, Test activity, Period period, float gradeN, String nameSubject){
        Grades grade = new Grades(studentId, yearStudy, activity, period,gradeN);
        
        try{
            if(studentId == null){
                throw new RuntimeException("need id");
            }
            gradesService.addGrades(grade, nameSubject);
            return 1;
        } catch (RuntimeException e){
            if (e.getMessage().equals("need id")){
                return -1;
            }
            System.out.println(e.getMessage());
            return 0;
        }        
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
    
    public ArrayList<Grades> getGradesBySubjectStudent(String id, String subjectName, YearStudy yearStudy, Period period){
        return gradesService.getGradesBySubjectStudent(id, subjectName, yearStudy, period);
    }
            
    public ArrayList<Grades> getGradesStudent(String id, YearStudy yearStudy, Period period){
        return gradesService.getGradesStudent(id, yearStudy, period);
    }
    
    public ArrayList<Grades> getGradesPrincipal(YearStudy yearStudy, SectionStudy sectionStudy){
        return gradesService.getGradesPrincipal(yearStudy, sectionStudy);
    }
}
