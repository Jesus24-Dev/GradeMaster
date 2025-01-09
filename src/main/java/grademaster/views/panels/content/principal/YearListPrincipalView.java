/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grademaster.views.panels.content.principal;

import grademaster.GradeMaster;
import grademaster.models.YearList;
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
public class YearListPrincipalView extends javax.swing.JPanel {

    private StudyEnums.YearStudy yearStudy;
    private StudyEnums.SectionStudy sectionStudy;
    String id;
    
    public YearListPrincipalView() {
        initComponents();
        fillComboBoxEnums();
        currentSectionStudy();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        yearListTable = new javax.swing.JTable();
        yearStudyList = new javax.swing.JComboBox<>();
        sectionList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addStudentToListButton = new javax.swing.JButton();
        editListButton = new javax.swing.JButton();
        deleteFromListButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        yearListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "YEAR STUDY", "SECTION", "ID", "NAME", "LASTNAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yearListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(yearListTable);
        if (yearListTable.getColumnModel().getColumnCount() > 0) {
            yearListTable.getColumnModel().getColumn(0).setResizable(false);
            yearListTable.getColumnModel().getColumn(1).setResizable(false);
            yearListTable.getColumnModel().getColumn(2).setResizable(false);
            yearListTable.getColumnModel().getColumn(4).setResizable(false);
        }

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
        jLabel1.setText("Year Study");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Section");

        addStudentToListButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addStudentToListButton.setText("Add student");
        addStudentToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentToListButtonActionPerformed(evt);
            }
        });

        editListButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        editListButton.setText("Edit list");
        editListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editListButtonActionPerformed(evt);
            }
        });

        deleteFromListButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deleteFromListButton.setText("Delete");
        deleteFromListButton.setEnabled(false);
        deleteFromListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addStudentToListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteFromListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(addStudentToListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sectionList, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearStudyList, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteFromListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentToListButtonActionPerformed
        WindowFunctions.startListForm();
    }//GEN-LAST:event_addStudentToListButtonActionPerformed

    private void deleteFromListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromListButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null,"Are you sure to remove the student from the list?");
        if (option == 0){
            GradeMaster.yearListController.deleteFromList(id);
            JOptionPane.showMessageDialog(null, "Student removed from list");
        }
        deleteFromListButton.setEnabled(false);
        fillTable();
    }//GEN-LAST:event_deleteFromListButtonActionPerformed

    private void editListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editListButtonActionPerformed

    private void yearStudyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearStudyListActionPerformed
        currentYearStudy();
        fillTable();
        deleteFromListButton.setEnabled(false);
    }//GEN-LAST:event_yearStudyListActionPerformed

    private void sectionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionListActionPerformed
        currentSectionStudy();
        fillTable();
        deleteFromListButton.setEnabled(false);
    }//GEN-LAST:event_sectionListActionPerformed

    private void yearListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearListTableMouseClicked
        int row = yearListTable.getSelectedRow();
        id = (String) yearListTable.getValueAt(row, 2);
        deleteFromListButton.setEnabled(true);
    }//GEN-LAST:event_yearListTableMouseClicked
    
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
    
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) yearListTable.getModel();
        model.setRowCount(0);
        
        ArrayList<YearList> yearList = GradeMaster.yearListController.getList(yearStudy, sectionStudy);
        
        if (yearList != null){
            for (YearList yl : yearList){
                String yearStudy = yl.getYearStudy().toString();
                String sectionStudy = yl.getSection().toString();
                String studentId = yl.getStudentId();
                String name = yl.getNameStudent();
                String lastname = yl.getLastnameStudent();
                
                Object[] newRow = {yearStudy, sectionStudy, studentId, name, lastname};
                model.addRow(newRow);
            }
        }
    }
    
    private void currentSectionStudy(){
        sectionStudy = StudyEnums.SectionStudy.valueOf((String) sectionList.getSelectedItem());
    }
    
    private void currentYearStudy(){
        yearStudy = StudyEnums.YearStudy.valueOf((String) yearStudyList.getSelectedItem());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentToListButton;
    private javax.swing.JButton deleteFromListButton;
    private javax.swing.JButton editListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sectionList;
    private javax.swing.JTable yearListTable;
    private javax.swing.JComboBox<String> yearStudyList;
    // End of variables declaration//GEN-END:variables
}
