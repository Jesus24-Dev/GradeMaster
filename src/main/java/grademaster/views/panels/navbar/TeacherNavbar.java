/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grademaster.views.panels.navbar;


import grademaster.utils.WindowFunctions;
import grademaster.views.panels.content.teacher.*;
import javax.swing.JPanel;

/**
 *
 * @author Jesus24-Dev
 */
public class TeacherNavbar extends javax.swing.JPanel {

    /**
     * Creates new form TeacherNavbar
     */
    public TeacherNavbar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listTeacherButton = new javax.swing.JButton();
        gradeTeacherButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 0, 0));

        listTeacherButton.setBackground(new java.awt.Color(255, 255, 255));
        listTeacherButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        listTeacherButton.setForeground(new java.awt.Color(0, 0, 0));
        listTeacherButton.setText("Year Lists");
        listTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTeacherButtonActionPerformed(evt);
            }
        });

        gradeTeacherButton.setBackground(new java.awt.Color(255, 255, 255));
        gradeTeacherButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        gradeTeacherButton.setForeground(new java.awt.Color(0, 0, 0));
        gradeTeacherButton.setText("Grades");
        gradeTeacherButton.setPreferredSize(new java.awt.Dimension(125, 40));
        gradeTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeTeacherButtonActionPerformed(evt);
            }
        });

        signOutButton.setBackground(new java.awt.Color(255, 255, 255));
        signOutButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        signOutButton.setForeground(new java.awt.Color(0, 0, 0));
        signOutButton.setText("Sign out");
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(signOutButton)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradeTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(listTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(gradeTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addComponent(signOutButton)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTeacherButtonActionPerformed
        listTeacherView list_teacher_view = new listTeacherView();
        WindowFunctions.changeContent(list_teacher_view);
    }//GEN-LAST:event_listTeacherButtonActionPerformed

    private void gradeTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTeacherButtonActionPerformed
        gradesTeacherView grades_teacher_view = new gradesTeacherView();
        WindowFunctions.changeContent(grades_teacher_view);
    }//GEN-LAST:event_gradeTeacherButtonActionPerformed

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        WindowFunctions.closeWindow();
        WindowFunctions.startLogin();
    }//GEN-LAST:event_signOutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gradeTeacherButton;
    private javax.swing.JButton listTeacherButton;
    private javax.swing.JButton signOutButton;
    // End of variables declaration//GEN-END:variables
}
