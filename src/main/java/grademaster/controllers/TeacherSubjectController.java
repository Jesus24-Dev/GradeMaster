/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.TeacherSubject;
import grademaster.service.TeacherSubjectService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class TeacherSubjectController {
    private final TeacherSubjectService teacherSubjectService;
    
    public TeacherSubjectController(TeacherSubjectService teacherSubjectService){
        this.teacherSubjectService = teacherSubjectService;
    }
    
    public ArrayList<TeacherSubject> getTeachers(){
        return teacherSubjectService.getTeachers();
    }
    
    public void addTeacherForSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.addTeacherForSubject(teacherSubject);
    }
    
    public void updateTeacherSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.updateTeacherSubject(teacherSubject);
    }
    
    public void deleteTeacherSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.deleteTeacherSubject(teacherSubject);
    }
    
    public ArrayList<TeacherSubject> getTeacherBySubject(String id){
        return teacherSubjectService.getTeacherBySubject(id);
    }
    
}
