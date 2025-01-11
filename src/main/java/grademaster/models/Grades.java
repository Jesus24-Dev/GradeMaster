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
    private String nameSubject;
    private SectionStudy section;
    private YearStudy yearStudy;
    private Test activity;
    private Period period;
    private float grade;

    public Grades(String studentId, YearStudy yearStudy, Test activity, Period period, float grade) {
        this.studentId = studentId;
        this.yearStudy = yearStudy;
        this.activity = activity;
        this.period = period;
        this.grade = grade;
    }

    public Grades(String studentId, String nameStudent, String lastnameStudent, String nameSubject, YearStudy yearStudy, Test activity, Period period, float grade) {
        this.studentId = studentId;
        this.nameStudent = nameStudent;
        this.lastnameStudent = lastnameStudent;
        this.nameSubject = nameSubject;
        this.yearStudy = yearStudy;
        this.activity = activity;
        this.period = period;
        this.grade = grade;
    }

    public Grades(String studentId, String nameStudent, String lastnameStudent, String nameSubject, SectionStudy section, YearStudy yearStudy, Test activity, Period period, float grade) {
        this.studentId = studentId;
        this.nameStudent = nameStudent;
        this.lastnameStudent = lastnameStudent;
        this.nameSubject = nameSubject;
        this.section = section;
        this.yearStudy = yearStudy;
        this.activity = activity;
        this.period = period;
        this.grade = grade;
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

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getNameSubject() {
        return nameSubject;
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

    public SectionStudy getSection() {
        return section;
    }

    public void setSection(SectionStudy section) {
        this.section = section;
    }
    
    
}
