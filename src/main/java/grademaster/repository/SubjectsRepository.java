package grademaster.repository;

import grademaster.models.Subjects;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */

public class SubjectsRepository {
    public ArrayList<Subjects> getSubjects(Connection conn){
        String sql = "SELECT namesubject FROM SUBJECT";
        ArrayList<Subjects> subjects = new ArrayList<>();
        try(Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                do {
                    Subjects subject = new Subjects(
                            rs.getString("namesubject")
                    );
                    subjects.add(subject);
                } while (rs.next());
            }
            return subjects;
        } catch (SQLException e){
            return null;
        }    
    }
}
