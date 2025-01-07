/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grademaster;

import grademaster.controllers.GradesController;
import grademaster.controllers.SubjectsController;
import grademaster.controllers.TeacherSubjectController;
import grademaster.utils.WindowFunctions;
import grademaster.views.panels.content.principal.PrincipalView;
import grademaster.views.panels.content.student.StudentView;
import grademaster.views.panels.content.teacher.TeacherView;
import grademaster.views.panels.navbar.PrincipalNavbar;
import grademaster.views.panels.navbar.StudentNavbar;
import grademaster.views.panels.navbar.TeacherNavbar;
import grademaster.repository.UsersRepository;
import grademaster.service.UsersService;
import grademaster.controllers.UsersController;
import grademaster.controllers.YearListController;
import grademaster.models.Database;
import grademaster.models.Users;
import grademaster.models.YearList;
import grademaster.repository.GradesRepository;
import grademaster.repository.SubjectsRepository;
import grademaster.repository.TeacherSubjectRepository;
import grademaster.repository.YearListRepository;
import grademaster.service.GradesService;
import grademaster.service.SubjectsService;
import grademaster.service.TeacherSubjectService;
import grademaster.service.YearListService;
import grademaster.utils.DatabaseProps;
import java.sql.Connection;

/**
 *
 * @author Jesus24-Dev
 */
public class GradeMaster {   
    public static DatabaseProps databaseProps = new DatabaseProps();
    public static Database db = new Database(databaseProps.getUrl(), databaseProps.getProps());
    public static Connection conn = db.createConnection();
    public static UsersRepository userRepository = new UsersRepository();
    public static UsersService userService = new UsersService(userRepository, conn);
    public static UsersController userController = new UsersController(userService);
    public static YearListRepository yearListRepository = new YearListRepository();
    public static YearListService yearListService = new YearListService(yearListRepository, conn);
    public static YearListController yearListController = new YearListController(yearListService);
    public static SubjectsRepository subjectRepository = new SubjectsRepository();
    public static SubjectsService subjectService = new SubjectsService(subjectRepository, conn);
    public static SubjectsController subjectController = new SubjectsController(subjectService);
    public static GradesRepository gradesRepository = new GradesRepository();
    public static GradesService gradesService = new GradesService(gradesRepository, conn);
    public static GradesController gradesController = new GradesController(gradesService);
    public static TeacherSubjectRepository teacherSubjectRepository = new TeacherSubjectRepository();
    public static TeacherSubjectService teacherSubjectService = new TeacherSubjectService(teacherSubjectRepository, conn);
    public static TeacherSubjectController teacherSubjectController = new TeacherSubjectController(teacherSubjectService);
    public static Users user;
    public static YearList yearList;
    
    public static void main(String[] args) {  
        WindowFunctions.startLogin();
    }
    
    public static void getWindow(int rol){   
        if (rol == 1){
            PrincipalView principalView = new PrincipalView();
            PrincipalNavbar principalNavbar = new PrincipalNavbar();
            WindowFunctions.changeTitle("GRADEMASTER - Principal");
            WindowFunctions.changeContent(principalView);
            WindowFunctions.changeNavbar(principalNavbar);    
        } else if (rol == 2){
            TeacherView teacherView = new TeacherView();
            TeacherNavbar teacherNavbar = new TeacherNavbar();
            WindowFunctions.changeTitle("GRADEMASTER - Teacher");
            WindowFunctions.changeContent(teacherView);
            WindowFunctions.changeNavbar(teacherNavbar);    
        } else if(rol == 3){
            StudentView studentView = new StudentView();
            StudentNavbar studentNavbar = new StudentNavbar();
            WindowFunctions.changeTitle("GRADEMASTER - Student");
            WindowFunctions.changeContent(studentView);
            WindowFunctions.changeNavbar(studentNavbar);         
        }
        WindowFunctions.closeLogin();
        WindowFunctions.setWindowVisible();
    }
    
}
