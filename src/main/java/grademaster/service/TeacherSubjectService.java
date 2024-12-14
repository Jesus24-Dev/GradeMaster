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
    
    public ArrayList<TeacherSubject> getTeachers(Connection conn){
        return teacherSubjectRepository.getTeachers(conn);
    }
    
    public void addTeacherForSubject(Connection conn, TeacherSubject teacherSubject){
        teacherSubjectRepository.addTeacherForSubject(conn, teacherSubject);
    }
    
    public void updateTeacherSubject(Connection conn, TeacherSubject teacherSubject){
        teacherSubjectRepository.updateTeacherSubject(conn, teacherSubject);
    }
    
    public void deleteTeacherSubject(Connection conn, TeacherSubject teacherSubject){
        teacherSubjectRepository.deleteTeacherSubject(conn, teacherSubject);
    }
}
