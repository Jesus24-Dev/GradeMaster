/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.models;

import grademaster.utils.StudyEnums.SectionStudy;
import grademaster.utils.StudyEnums.YearStudy;

/**
 *
 * @author Jesus24-Dev
 */
public class YearList {
    private String studentId;
    private YearStudy yearStudy;
    private SectionStudy section;
    private String nameStudent;
    private String lastnameStudent;

    public YearList(String studentId, YearStudy yearStudy, SectionStudy section) {
        this.studentId = studentId;
        this.yearStudy = yearStudy;
        this.section = section;
    }

    public YearList(String studentId, YearStudy yearStudy, SectionStudy section, String nameStudent, String lastnameStudent) {
        this.studentId = studentId;
        this.yearStudy = yearStudy;
        this.section = section;
        this.nameStudent = nameStudent;
        this.lastnameStudent = lastnameStudent;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public YearStudy getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(YearStudy yearStudy) {
        this.yearStudy = yearStudy;
    }

    public SectionStudy getSection() {
        return section;
    }

    public void setSection(SectionStudy section) {
        this.section = section;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastnameStudent() {
        return lastnameStudent;
    }

    public void setLastnameStudent(String lastnameStudent) {
        this.lastnameStudent = lastnameStudent;
    }
        
    
}
