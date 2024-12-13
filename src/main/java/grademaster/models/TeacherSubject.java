/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grademaster.models;

/**
 *
 * @author Jesus24-Dev
 */
public class TeacherSubject {
    private String teacherId;
    private int subjectId;
    private String teacherName;
    private String teacherLastname;

    public TeacherSubject(String teacherId, int subjectId) {
        this.teacherId = teacherId;
        this.subjectId = subjectId;
    }

    public TeacherSubject(String teacherId, int subjectId, String teacherName, String teacherLastname) {
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.teacherName = teacherName;
        this.teacherLastname = teacherLastname;
    }
     
     public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherLastname() {
        return teacherLastname;
    }

    public void setTeacherLastname(String teacherLastname) {
        this.teacherLastname = teacherLastname;
    }

    @Override
    public String toString() {
        return "TeacherSubject{" + "teacherId=" + teacherId + ", subjectId=" + subjectId + ", teacherName=" + teacherName + ", teacherLastname=" + teacherLastname + '}';
    }
    
    
}
