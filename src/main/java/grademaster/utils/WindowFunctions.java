
package grademaster.utils;

import grademaster.views.main.LoginForm;
import grademaster.views.main.WindowForm;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class WindowFunctions {
    private static WindowForm windowForm;
    private static JPanel content;
    private static JPanel navbar;
    public static LoginForm loginForm; 
    
    private static void initializeWindowForm() {
        if (windowForm == null) {
            windowForm = new WindowForm();
            content = windowForm.getContent();
            navbar = windowForm.getNavbar();
        }
    }
    
    public static void changeContent(JPanel panelToChange){
        initializeWindowForm();
        content.removeAll();
        content.add(panelToChange, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public static void changeNavbar(JPanel navbarToChange){
        initializeWindowForm();
        navbar.removeAll();
        navbar.add(navbarToChange, BorderLayout.CENTER);
        navbar.revalidate();
        navbar.repaint();
    }
    
    public static void changeTitle(String title){
        initializeWindowForm();
        windowForm.setTitle(title);
    }
    
    public static void setWindowVisible(){
        initializeWindowForm();
        windowForm.setVisible(true);
        windowForm.setLocationRelativeTo(null);
    }
    
    public static void closeWindow(){
        if (windowForm != null) {
            windowForm.dispose();
            windowForm = null;
        }
    }
    
    public static void startLogin(){
        loginForm = new LoginForm();  
        loginForm.setTitle("GRADEMASTER - Login");
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
    }
    
    public static void closeLogin(){
         if (loginForm != null) {
            loginForm.dispose();
            loginForm = null;
        }
    }
}
