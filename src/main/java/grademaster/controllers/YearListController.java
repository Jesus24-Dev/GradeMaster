/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.controllers;

import grademaster.models.YearList;
import grademaster.service.YearListService;
import grademaster.utils.StudyEnums.SectionStudy;
import grademaster.utils.StudyEnums.YearStudy;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class YearListController {
    private final YearListService yearListService;
    
    public YearListController(YearListService yearListService){
        this.yearListService = yearListService;
    }
    
    public ArrayList<YearList> getList(YearStudy yearStudy, SectionStudy sectionStudy){
        return yearListService.getList(yearStudy, sectionStudy);
    }
    
    public void addStudentToList(String id, YearStudy yearStudy, SectionStudy sectionStudy){
        YearList yearList = new YearList(id, yearStudy, sectionStudy);
        yearListService.addStudentToList(yearList);
    }
    
    public void updateList(String id, YearStudy yearStudy, SectionStudy sectionStudy){
        YearList yearList = new YearList(id, yearStudy, sectionStudy);
        yearListService.updateList(yearList);
    }
    
    public void deleteFromList(String id){
        yearListService.deleteFromList(id);
    }
}
