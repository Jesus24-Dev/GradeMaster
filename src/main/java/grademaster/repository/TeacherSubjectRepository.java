
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
                     LEFT JOIN subject b ON b.id = c.subjectid
                     WHERE a.status = true""";
        
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
    
    public ArrayList<TeacherSubject> getTeacherBySubject(String id, Connection conn){
        ArrayList<TeacherSubject> subjects = new ArrayList<>();
        String sql = """
                     SELECT a.id, b.namesubject
                     FROM teacher_subject c
                     LEFT JOIN users a ON a.id = c.teacherid
                     LEFT JOIN subject b ON b.id = c.subjectid
                     WHERE a.id = ?
                     """;
        
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1, id);
            try(ResultSet rs = pstm.executeQuery()){
                if (rs.next()){
                    do{
                        TeacherSubject teacher = new TeacherSubject(
                                rs.getString("id"),
                                rs.getString("namesubject")
                        );
                    subjects.add(teacher);
                    } while(rs.next());
                }
            }          
            return subjects;
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
    
    public void updateTeacherSubject(Connection conn, TeacherSubject teacherSubject){
        String sql = "UPDATE teacher_subject SET subjectid = (SELECT id FROM subject WHERE namesubject = ?) WHERE teacherid = ?";              
        try(PreparedStatement pstm = conn.prepareStatement(sql)){          
            pstm.setString(1, teacherSubject.getNameSubject());
            pstm.setString(2, teacherSubject.getTeacherId());
            
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void deleteTeacherSubject(Connection conn, String teacherId){
        String sql = "DELETE FROM teacher_subject WHERE teacherid = ?";              
        try(PreparedStatement pstm = conn.prepareStatement(sql)){          
            pstm.setString(1, teacherId);           
            pstm.executeUpdate();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<TeacherSubject> getTeacherWithoutSubjects(Connection conn){
        ArrayList<TeacherSubject> subjects = new ArrayList<>();
        String sql = """
                     SELECT users.id, users.name, users.lastname
                     FROM users
                     LEFT JOIN teacher_subject ON teacher_subject.teacherid = users.id
                     WHERE teacher_subject.teacherid IS NULL AND users.rol = (SELECT id FROM rol WHERE rol_desc = 'TEACHER')
                     """;
        
        try(PreparedStatement pstm = conn.prepareStatement(sql)){
            try(ResultSet rs = pstm.executeQuery()){
                if (rs.next()){
                    do{
                        TeacherSubject teacher = new TeacherSubject(
                                rs.getString("id"),
                                "",
                                rs.getString("name"),
                                rs.getString("lastname")
                        );
                    subjects.add(teacher);
                    } while(rs.next());
                }
            }          
            return subjects;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        } 
    }
}
