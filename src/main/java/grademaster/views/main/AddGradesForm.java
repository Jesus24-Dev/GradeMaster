/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grademaster.views.main;

import grademaster.GradeMaster;
import grademaster.models.Subjects;
import grademaster.models.TeacherSubject;
import grademaster.models.YearList;
import grademaster.utils.StudyEnums;
import grademaster.views.panels.navbar.PrincipalNavbar;
import grademaster.views.panels.navbar.TeacherNavbar;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus24-Dev
 */
public class AddGradesForm extends javax.swing.JFrame {

    private StudyEnums.SectionStudy sectionStudy;
    private StudyEnums.YearStudy yearStudy;
    
    public AddGradesForm() {
        initComponents();
        fillComboBoxEnums();
        fillSubjectComboBox();
        currentSection();
        currentYearStudy();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentsList = new javax.swing.JScrollPane();
        studentList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        yearStudyList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sectionList = new javax.swing.JComboBox<>();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        periodList = new javax.swing.JComboBox<>();
        testList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gradeField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        subjectList = new javax.swing.JComboBox<>();
        closeBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        studentList.setBackground(new java.awt.Color(255, 255, 255));
        studentList.setForeground(new java.awt.Color(0, 0, 0));
        studentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "LASTNAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
        });
        studentsList.setViewportView(studentList);
        if (studentList.getColumnModel().getColumnCount() > 0) {
            studentList.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Year Study");

        yearStudyList.setBackground(new java.awt.Color(255, 255, 255));
        yearStudyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearStudyListActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Section");

        sectionList.setBackground(new java.awt.Color(255, 255, 255));
        sectionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionListActionPerformed(evt);
            }
        });

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student ID");

        periodList.setBackground(new java.awt.Color(255, 255, 255));
        periodList.setForeground(new java.awt.Color(0, 0, 0));

        testList.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Test");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Period");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Grade");

        gradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Add new grade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Subject");

        subjectList.setBackground(new java.awt.Color(255, 255, 255));
        subjectList.setForeground(new java.awt.Color(0, 0, 0));

        closeBtn.setBackground(new java.awt.Color(0, 255, 255));
        closeBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(0, 0, 0));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(subjectList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(periodList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(studentsList, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subjectList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(periodList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(testList, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentsList, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearStudyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearStudyListActionPerformed
        currentYearStudy();
        idField.setText("");
        fillTable();
    }//GEN-LAST:event_yearStudyListActionPerformed

    private void sectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionListActionPerformed
        currentSection();
        idField.setText("");
        fillTable();
    }//GEN-LAST:event_sectionListActionPerformed

    private void gradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            String studentId = idField.getText();
            String subject = (String) subjectList.getSelectedItem();
            String yearStudy = (String) yearStudyList.getSelectedItem();
            String period = (String) periodList.getSelectedItem();
            String test = (String) testList.getSelectedItem();        
            float grade = Float.parseFloat(gradeField.getText());
            
            if (grade < 1 || grade > 20){
                JOptionPane.showMessageDialog(null, "The school grade must be between values 1 and 20");
            } else {
                int value = GradeMaster.gradesController.createGrade(studentId,
                    StudyEnums.YearStudy.valueOf(yearStudy),
                    StudyEnums.Test.valueOf(test),
                    StudyEnums.Period.valueOf(period), 
                    grade, 
                    subject);
                if(value == 1){
                    JOptionPane.showMessageDialog(null, "New grade register succesfully.");
                } else if (value == 0){
                    JOptionPane.showMessageDialog(null, "Already exists a grade register with this form.");
                } else if (value == -1){
                    JOptionPane.showMessageDialog(null, "ID field can't be empty");
                }
            }            
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Grade field need to be a number");
        }
        
        if(GradeMaster.user.getRole() == 1){
            PrincipalNavbar.grades_teacher_view.updateTable();
        } else {
            TeacherNavbar.grades_teacher_view.updateTable();
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked
        int row = studentList.getSelectedRow();
        String studentId = (String) studentList.getValueAt(row, 0);
        idField.setText(studentId);
    }//GEN-LAST:event_studentListMouseClicked

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddGradesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGradesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGradesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGradesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGradesForm().setVisible(true);
            }
        });
    }
    
    private void fillComboBoxEnums(){
        StudyEnums.YearStudy yearStudy[] = StudyEnums.YearStudy.values();
        StudyEnums.SectionStudy sectionStudy[] = StudyEnums.SectionStudy.values();
        StudyEnums.Period periodStudy[] = StudyEnums.Period.values();
        StudyEnums.Test testGrade[] = StudyEnums.Test.values();
        String yearStudyArr[] = new String[5];
        String sectionStudyArr[] = new String[4];
        String periodArr[] = new String[3];
        String testArr[] = new String[5];
        
        for(int i = 0; i < 5; i++){
            yearStudyArr[i] = yearStudy[i].toString();
            testArr[i] = testGrade[i].toString();
        }
        for(int i = 0; i < 4; i++){
            sectionStudyArr[i] = sectionStudy[i].toString();
        }
        for(int i = 0; i < 3; i++){
            periodArr[i] = periodStudy[i].toString();
        }
        
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(yearStudyArr);
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(sectionStudyArr);
        DefaultComboBoxModel<String> model3 = new DefaultComboBoxModel<>(periodArr);
        DefaultComboBoxModel<String> model4 = new DefaultComboBoxModel<>(testArr);
        yearStudyList.setModel(model1);
        sectionList.setModel(model2);
        periodList.setModel(model3);
        testList.setModel(model4);
    }
    
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) studentList.getModel();
        model.setRowCount(0);
        
        ArrayList<YearList> yearList = GradeMaster.yearListController.getList(yearStudy, sectionStudy);
        
        if (yearList != null){
            for (YearList yl : yearList){
                String studentId = yl.getStudentId();
                String name = yl.getNameStudent();
                String lastname = yl.getLastnameStudent();
                
                Object[] newRow = {studentId, name, lastname};
                model.addRow(newRow);
            }
        }
    }
    
    private void fillSubjectComboBox(){
        ArrayList<TeacherSubject> subjects = GradeMaster.teacherSubjectController.getTeacherBySubject(GradeMaster.user.getId());
        if (!subjects.isEmpty()){
            String subjectArr[] = new String[subjects.size()];
            int i = 0;
            
            for(TeacherSubject s : subjects){
                subjectArr[i] = s.getNameSubject();
                i++;
            }
            DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(subjectArr);
            subjectList.setModel(model1);
        } else if(subjects.isEmpty()  && GradeMaster.user.getRole() == 1) {
            ArrayList<Subjects> subjects2  = GradeMaster.subjectController.getSubjects();
            String subjectArr[] = new String[subjects2.size()];
            int i = 0;
            for(Subjects s : subjects2){
                subjectArr[i] = s.getName();
                i++;
            }
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(subjectArr);
            subjectList.setModel(model);
        }
    }
    
    private void currentSection(){
        sectionStudy = StudyEnums.SectionStudy.valueOf((String) sectionList.getSelectedItem());
    }
    
    private void currentYearStudy(){
        yearStudy = StudyEnums.YearStudy.valueOf((String) yearStudyList.getSelectedItem());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField gradeField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> periodList;
    private javax.swing.JComboBox<String> sectionList;
    private javax.swing.JTable studentList;
    private javax.swing.JScrollPane studentsList;
    private javax.swing.JComboBox<String> subjectList;
    private javax.swing.JComboBox<String> testList;
    private javax.swing.JComboBox<String> yearStudyList;
    // End of variables declaration//GEN-END:variables
}
