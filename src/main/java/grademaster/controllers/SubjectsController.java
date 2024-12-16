/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.Subjects;
import grademaster.service.SubjectsService;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class SubjectsController {
    private final SubjectsService subjectsService;
    
    public SubjectsController(SubjectsService subjectsService){
        this.subjectsService = subjectsService;
    }
    
    public ArrayList<Subjects> getSubjects(){
        return subjectsService.getSubjects();
    }
    
    public void createSubject(String nameSubject){
        Subjects subject = new Subjects(nameSubject);
        subjectsService.createSubject(subject);
    }
    
    public void deleteSubject(String nameSubject){
        subjectsService.deleteSubject(nameSubject);
    }
}
