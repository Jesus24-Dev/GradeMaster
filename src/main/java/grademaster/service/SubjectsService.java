
package grademaster.service;

import grademaster.models.Subjects;
import grademaster.repository.SubjectsRepository;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jesus24-Dev
 */
public class SubjectsService {
    private final SubjectsRepository subjectsRepository;
    private final Connection conn;

    public SubjectsService(SubjectsRepository subjectsRepository, Connection conn) {
        this.subjectsRepository = subjectsRepository;
        this.conn = conn;
    }
    
    public ArrayList<Subjects> getSubjects(Connection conn){
        return subjectsRepository.getSubjects(conn);
    }
    
    public void createSubject(Connection conn, Subjects subject){
        subjectsRepository.createSubject(conn, subject);
    }
    
    public void deleteSubject(Connection conn, String subject){
        subjectsRepository.deleteSubject(conn, subject);
    }
}
