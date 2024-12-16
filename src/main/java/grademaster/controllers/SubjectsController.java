/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.Subjects;
import grademaster.service.SubjectsService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class SubjectsController {
    private final SubjectsService subjectsService;
    private final Connection conn;
    
    public SubjectsController(SubjectsService subjectsService, Connection conn){
        this.subjectsService = subjectsService;
        this.conn = conn;
    }
    
    public ArrayList<Subjects> getSubjects(){
        return subjectsService.getSubjects(conn);
    }
    
    public void createSubject(String nameSubject){
        Subjects subject = new Subjects(nameSubject);
        subjectsService.createSubject(conn, subject);
    }
    
    public void deleteSubject(String nameSubject){
        subjectsService.deleteSubject(conn, nameSubject);
    }
}
