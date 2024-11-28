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

    public YearList(String studentId, YearStudy yearStudy, SectionStudy section) {
        this.studentId = studentId;
        this.yearStudy = yearStudy;
        this.section = section;
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
        
}
