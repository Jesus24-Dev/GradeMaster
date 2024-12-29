
package grademaster.utils;

import grademaster.views.main.LoginForm;
import grademaster.views.main.WindowForm;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class WindowFunctions {
    private static WindowForm windowForm = new WindowForm();
    private static JPanel content = windowForm.getContent();
    private static JPanel navbar = windowForm.getNavbar();
    public static LoginForm loginForm; 
    
    public static void changeContent(JPanel panelToChange){
        content.removeAll();
        content.add(panelToChange, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public static void changeNavbar(JPanel navbarToChange){
        navbar.removeAll();
        navbar.add(navbarToChange, BorderLayout.CENTER);
        navbar.revalidate();
        navbar.repaint();
    }
    
    public static void changeTitle(String title){
        windowForm.setTitle(title);
    }
    
    public static void setWindowVisible(){
        windowForm.setVisible(true);
        windowForm.setLocationRelativeTo(null);
    }
    
    public static void closeWindow(){
        windowForm.dispose();
    }
    
    public static void startLogin(){
        loginForm = new LoginForm();  
        loginForm.setTitle("GRADEMASTER - Login");
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
    }
    
    public static void closeLogin(){
        loginForm.dispose();
    }
}
