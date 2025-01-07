/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grademaster.views.panels.content.teacher;

import grademaster.GradeMaster;
import grademaster.models.Grades;
import grademaster.models.TeacherSubject;
import grademaster.utils.StudyEnums;
import grademaster.utils.WindowFunctions;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus24-Dev
 */
public class gradesTeacherView extends javax.swing.JPanel {

    private String subjectName;
    private StudyEnums.SectionStudy sectionStudy;
    private StudyEnums.YearStudy yearStudy;
    private Grades newGrade;
    private String subjectSelected;
    
    public gradesTeacherView() {
        initComponents();
        fillComboBoxEnums();
        fillSubjectComboBox();
        currentYearStudy();
        currentSection();
        currentSubject();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        studentGrades1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        subjectList = new javax.swing.JComboBox<>();
        yearStudyList = new javax.swing.JComboBox<>();
        sectionList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        studentGrades1.setBackground(new java.awt.Color(255, 255, 255));
        studentGrades1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        studentGrades1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "LASTNAME", "SUBJECT", "YEAR STUDY", "SECTION", "TEST", "PERIOD", "GRADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentGrades1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentGrades1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentGrades1);
        if (studentGrades1.getColumnModel().getColumnCount() > 0) {
            studentGrades1.getColumnModel().getColumn(0).setResizable(false);
            studentGrades1.getColumnModel().getColumn(1).setResizable(false);
            studentGrades1.getColumnModel().getColumn(3).setResizable(false);
            studentGrades1.getColumnModel().getColumn(4).setResizable(false);
            studentGrades1.getColumnModel().getColumn(5).setResizable(false);
            studentGrades1.getColumnModel().getColumn(6).setResizable(false);
            studentGrades1.getColumnModel().getColumn(7).setResizable(false);
            studentGrades1.getColumnModel().getColumn(8).setResizable(false);
        }

        addButton.setText("Register new Grade");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit grade");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete grade");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        subjectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectListActionPerformed(evt);
            }
        });

        yearStudyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearStudyListActionPerformed(evt);
            }
        });

        sectionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Subject");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Year Study");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Section");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(189, 189, 189)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(subjectList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(170, 170, 170))
                        .addComponent(jScrollPane2))
                    .addGap(6, 6, 6)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subjectList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(45, 45, 45)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        WindowFunctions.startAddGradeForm();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
           float gradeValue = Float.parseFloat(JOptionPane.showInputDialog("Indicates the new school grade"));
           if (gradeValue < 1 || gradeValue > 20){
               throw new RuntimeException();
           }
           GradeMaster.gradesController.updateGrade(
                   newGrade.getStudentId(), 
                   newGrade.getYearStudy(),         
                   newGrade.getActivity(),
                   newGrade.getPeriod(),
                   gradeValue,
                subjectSelected
           );
           JOptionPane.showMessageDialog(null, "School Grade update succesfully!");
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Grade field need to be a number");
        } catch(NullPointerException e){
            
        } catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "The school grade must be between values 1 and 20");
        }
        
        
    }//GEN-LAST:event_editButtonActionPerformed

    private void subjectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectListActionPerformed
        currentSubject();
        fillTable();
        deleteButton.setEnabled(false);
        editButton.setEnabled(false);
    }//GEN-LAST:event_subjectListActionPerformed

    private void yearStudyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearStudyListActionPerformed
        currentYearStudy();
        fillTable();
        deleteButton.setEnabled(false);
        editButton.setEnabled(false);
    }//GEN-LAST:event_yearStudyListActionPerformed

    private void sectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionListActionPerformed
        currentSection();
        fillTable();
        deleteButton.setEnabled(false);
        editButton.setEnabled(false);
    }//GEN-LAST:event_sectionListActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String message = "Are you sure delete this grade? \nStudent id: " + newGrade.getStudentId() +
                "\nYear Study: " + newGrade.getYearStudy().toString() +
                "\nActivity: " + newGrade.getActivity().toString() +
                "\nPeriod: " + newGrade.getPeriod().toString() +
                "\nGrade: " +  newGrade.getGrade() +
                "\nSubject: " + subjectSelected;
        
        int option = JOptionPane.showConfirmDialog(null, message);
        if (option == 0){
            GradeMaster.gradesController.deleteGrade(newGrade.getStudentId(), 
                    newGrade.getYearStudy(),         
                    newGrade.getActivity(), 
                    newGrade.getPeriod(), 
                    newGrade.getGrade(), 
                    subjectSelected
            );
            JOptionPane.showMessageDialog(null, "School Grade Deleted Succesfully");
            fillTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void studentGrades1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentGrades1MouseClicked
        int row = studentGrades1.getSelectedRow();
        deleteButton.setEnabled(true);
        editButton.setEnabled(true);
        subjectSelected = (String) studentGrades1.getValueAt(row, 3);
        newGrade = new Grades(
                (String) studentGrades1.getValueAt(row, 0),
               StudyEnums.YearStudy.valueOf((String) studentGrades1.getValueAt(row, 4)),
               StudyEnums.Test.valueOf((String) studentGrades1.getValueAt(row, 6)),
               StudyEnums.Period.valueOf((String) studentGrades1.getValueAt(row, 7)),
               (Float) studentGrades1.getValueAt(row, 8)
        );
    }//GEN-LAST:event_studentGrades1MouseClicked

    private void fillComboBoxEnums(){
        StudyEnums.YearStudy yearStudy[] = StudyEnums.YearStudy.values();
        StudyEnums.SectionStudy sectionStudy[] = StudyEnums.SectionStudy.values();
        String yearStudyArr[] = new String[5];
        String sectionStudyArr[] = new String[4];
        
        for(int i = 0; i < 5; i++){
            yearStudyArr[i] = yearStudy[i].toString();
        }
        for(int i = 0; i < 4; i++){
            sectionStudyArr[i] = sectionStudy[i].toString();
        }
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(yearStudyArr);
        DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(sectionStudyArr);
        yearStudyList.setModel(model1);
        sectionList.setModel(model2);
    }
    
    private void fillSubjectComboBox(){
        ArrayList<TeacherSubject> subjects = GradeMaster.teacherSubjectController.getTeacherBySubject(GradeMaster.user.getId());
        if (subjects != null){
            String subjectArr[] = new String[subjects.size()];
            int i = 0;
            
            for(TeacherSubject s : subjects){
                subjectArr[i] = s.getNameSubject();
                i++;
            }
            DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(subjectArr);
            subjectList.setModel(model1);
        } 
    }
    
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) studentGrades1.getModel();
        model.setRowCount(0);
        ArrayList<Grades> grades = GradeMaster.gradesController.getGradesBySubjectTeacher(subjectName, yearStudy, sectionStudy);
        if(grades != null){       
            for (Grades grade : grades) {
                String id = grade.getStudentId();
                String name = grade.getNameStudent();
                String lastname = grade.getLastnameStudent();
                String subject = grade.getNameSubject();  
                String yearStudy = grade.getYearStudy().toString();  
                String section = grade.getSection().toString();
                String activity = grade.getActivity().toString(); 
                String period = grade.getPeriod().toString();                     
                float gradeValue = grade.getGrade(); 

                Object[] newRow = {id, name, lastname, subject, yearStudy,  section, activity, period, gradeValue};
                model.addRow(newRow);
            }
        }
    }
    
    private void currentSection(){
        sectionStudy = StudyEnums.SectionStudy.valueOf((String) sectionList.getSelectedItem());
    }
    
    private void currentYearStudy(){
        yearStudy = StudyEnums.YearStudy.valueOf((String) yearStudyList.getSelectedItem());
    }
    
    private void currentSubject(){
        subjectName = (String) subjectList.getSelectedItem();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> sectionList;
    private javax.swing.JTable studentGrades1;
    private javax.swing.JComboBox<String> subjectList;
    private javax.swing.JComboBox<String> yearStudyList;
    // End of variables declaration//GEN-END:variables
}
