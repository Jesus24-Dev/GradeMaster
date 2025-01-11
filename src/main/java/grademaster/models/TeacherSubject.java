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
    private String nameSubject;
    private String teacherName;
    private String teacherLastname;

    public TeacherSubject(String teacherId, String nameSubject) {
        this.teacherId = teacherId;
        this.nameSubject = nameSubject;
    }

    public TeacherSubject(String teacherId, String nameSubject, String teacherName, String teacherLastname) {
        this.teacherId = teacherId;
        this.nameSubject = nameSubject;
        this.teacherName = teacherName;
        this.teacherLastname = teacherLastname;
    }
     
     public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
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
        return "TeacherSubject{" + "teacherId=" + teacherId + ", nameSubject=" + nameSubject + ", teacherName=" + teacherName + ", teacherLastname=" + teacherLastname + '}';
    }
    
    
}
