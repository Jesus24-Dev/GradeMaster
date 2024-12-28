
package grademaster.utils;

import grademaster.views.main.WindowForm;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class WindowFunctions {
    private static WindowForm windowForm = new WindowForm();
    private static JPanel content = windowForm.getContent();
    private static JPanel navbar = windowForm.getNavbar();
    
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
    }
}
