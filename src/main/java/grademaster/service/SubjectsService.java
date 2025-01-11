
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
    
    public ArrayList<Subjects> getSubjects(){
        return subjectsRepository.getSubjects(conn);
    }
    
    public void createSubject(Subjects subject){
        subjectsRepository.createSubject(conn, subject);
    }
    
    public void deleteSubject(String subject){
        subjectsRepository.deleteSubject(conn, subject);
    }
}
