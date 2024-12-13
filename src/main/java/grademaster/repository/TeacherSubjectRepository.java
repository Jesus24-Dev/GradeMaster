
package grademaster.repository;

import grademaster.models.TeacherSubject;
import grademaster.utils.StudyEnums.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class TeacherSubjectRepository {
    public ArrayList<TeacherSubject> getTeachers(Connection conn){
        ArrayList<TeacherSubject> teacherList = new ArrayList<>();
        String sql = """
                     SELECT a.id, a.name, a.lastname, b.namesubject
                     FROM teacher_subject c
                     LEFT JOIN users a ON a.id = c.teacherid
                     LEFT JOIN subject b ON b.id = c.subjectid""";
        
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            try(ResultSet rs = pstm.executeQuery()){
                if (rs.next()){
                    do{
                        TeacherSubject teacher = new TeacherSubject(
                                rs.getString("id"),
                                rs.getString("namesubject"),
                                rs.getString("name"),
                                rs.getString("lastname")
                        );
                    teacherList.add(teacher);
                    } while(rs.next());
                }
            }          
            return teacherList;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }   
    }
    
    public void addTeacherForSubject(Connection conn, TeacherSubject teacherSubject){
        String sql = "INSERT INTO teacher_subject (teacherid, subjectid) VALUES " +
                "(?, (SELECT id FROM subject WHERE namesubject = ?))";
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, teacherSubject.getTeacherId());
            pstm.setString(2, teacherSubject.getNameSubject());
            
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
