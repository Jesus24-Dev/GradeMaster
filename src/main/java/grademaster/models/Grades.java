/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.models;

import grademaster.utils.StudyEnums.*;

/**
 *
 * @author Jesus24-Dev
 */
public class Grades {
    private String studentId;
    private String nameStudent;
    private String lastnameStudent;
    private int subjectId; 
    private String nameSubject;
    private YearStudy yearStudy;
    private Test activity;
    private Period period;
    private SectionStudy sectionStudy;
    private float grade;

    public Grades(String studentId, int subjectId, YearStudy yearStudy, Test activity, Period period, SectionStudy sectionStudy, float grade) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.yearStudy = yearStudy;
        this.activity = activity;
        this.period = period;
        this.sectionStudy = sectionStudy;
        this.grade = grade;
    }

    public Grades(String studentId, String nameStudent, String lastnameStudent, String nameSubject, YearStudy yearStudy, Test activity, Period period, SectionStudy sectionStudy, float grade) {
        this.studentId = studentId;
        this.nameStudent = nameStudent;
        this.lastnameStudent = lastnameStudent;
        this.nameSubject = nameSubject;
        this.yearStudy = yearStudy;
        this.activity = activity;
        this.period = period;
        this.sectionStudy = sectionStudy;
        this.grade = grade;
    }
    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public YearStudy getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(YearStudy yearStudy) {
        this.yearStudy = yearStudy;
    }

    public Test getActivity() {
        return activity;
    }

    public void setActivity(Test activity) {
        this.activity = activity;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public SectionStudy getSectionStudy() {
        return sectionStudy;
    }

    public void setSectionStudy(SectionStudy sectionStudy) {
        this.sectionStudy = sectionStudy;
    }
    

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    
    
}
