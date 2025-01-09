/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.service;

import grademaster.models.TeacherSubject;
import grademaster.repository.TeacherSubjectRepository;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class TeacherSubjectService {
    private final TeacherSubjectRepository teacherSubjectRepository;
    private final Connection conn;

    public TeacherSubjectService(TeacherSubjectRepository teacherSubjectRepository, Connection conn) {
        this.teacherSubjectRepository = teacherSubjectRepository;
        this.conn = conn;
    }
    
    public ArrayList<TeacherSubject> getTeachers(){
        return teacherSubjectRepository.getTeachers(conn);
    }
    
    public void addTeacherForSubject(TeacherSubject teacherSubject){
        teacherSubjectRepository.addTeacherForSubject(conn, teacherSubject);
    }
    
    public void updateTeacherSubject(TeacherSubject teacherSubject){
        teacherSubjectRepository.updateTeacherSubject(conn, teacherSubject);
    }
    
    public void deleteTeacherSubject(TeacherSubject teacherSubject){
        teacherSubjectRepository.deleteTeacherSubject(conn, teacherSubject);
    }
    
    public ArrayList<TeacherSubject> getTeacherBySubject(String id){
        return teacherSubjectRepository.getTeacherBySubject(id, conn);
    }
    
    public ArrayList<TeacherSubject> getTeacherWithoutSubjects(){
        return teacherSubjectRepository.getTeacherWithoutSubjects(conn);
    }
}
