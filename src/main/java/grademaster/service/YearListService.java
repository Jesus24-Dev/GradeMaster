/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.service;

import grademaster.models.YearList;
import grademaster.repository.YearListRepository;
import grademaster.utils.StudyEnums.SectionStudy;
import grademaster.utils.StudyEnums.YearStudy;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class YearListService {
    private final YearListRepository yearListRepository;
    private final Connection conn;

    public YearListService(YearListRepository yearListRepository, Connection conn) {
        this.yearListRepository = yearListRepository;
        this.conn = conn;
    }
    
    public ArrayList<YearList> getList(YearStudy yearStudy, SectionStudy sectionStudy){
        return yearListRepository.getYearList(conn, yearStudy, sectionStudy);
    }
    
    public void addStudentToList(YearList yearList){
        yearListRepository.addStudentToList(conn, yearList);
    }
    
    public void updateList(YearList yearList){
        yearListRepository.updateList(conn, yearList);
    }
    
    public void deleteFromList(String id){
        yearListRepository.deleteFromList(conn, id);
    }
}
