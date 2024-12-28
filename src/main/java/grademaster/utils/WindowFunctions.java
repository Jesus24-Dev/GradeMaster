
package grademaster.utils;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class WindowFunctions {
    public static void changePanel(JPanel panelMain, JPanel panelToChange){
        panelMain.removeAll();
        panelMain.add(panelToChange, BorderLayout.CENTER);
        panelMain.revalidate();
        panelMain.repaint();
    }
}
