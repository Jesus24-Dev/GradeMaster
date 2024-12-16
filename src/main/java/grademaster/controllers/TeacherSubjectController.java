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
    private final Connection conn;
    
    public TeacherSubjectController(TeacherSubjectService teacherSubjectService, Connection conn){
        this.teacherSubjectService = teacherSubjectService;
        this.conn = conn;
    }
    
    public ArrayList<TeacherSubject> getTeachers(Connection conn){
        return teacherSubjectService.getTeachers(conn);
    }
    
    public void addTeacherForSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.addTeacherForSubject(conn, teacherSubject);
    }
    
    public void updateTeacherSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.updateTeacherSubject(conn, teacherSubject);
    }
    
    public void deleteTeacherSubject(String id, String nameSubject){
        TeacherSubject teacherSubject = new TeacherSubject(id, nameSubject);        
        teacherSubjectService.deleteTeacherSubject(conn, teacherSubject);
    }
    
}
