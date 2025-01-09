/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grademaster.views.panels.content.principal;

import grademaster.GradeMaster;
import grademaster.models.Users;
import grademaster.utils.WindowFunctions;
import grademaster.views.main.usersForm;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus24-Dev
 */
public class UsersPrincipalView extends javax.swing.JPanel {

    boolean status = true;
    int rol;
    String userIdSelected;
    boolean statusSelected;
    Users user;
    
    public UsersPrincipalView() {
        initComponents();
        setRol();
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

        jLabel1 = new javax.swing.JLabel();
        userRol = new javax.swing.JComboBox<>();
        statusUser = new javax.swing.JCheckBox();
        userID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchByID = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        userToInactiveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Viewing Now");

        userRol.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Teachers" }));
        userRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRolActionPerformed(evt);
            }
        });

        statusUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        statusUser.setText("Inactive");
        statusUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusUserActionPerformed(evt);
            }
        });

        userID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Search by ID");

        searchByID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchByID.setText("Search");
        searchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIDActionPerformed(evt);
            }
        });

        editUserButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        editUserButton.setText("Edit user");
        editUserButton.setEnabled(false);
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        addUserButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addUserButton.setText("Register new User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        userToInactiveButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userToInactiveButton.setText("Change status");
        userToInactiveButton.setEnabled(false);
        userToInactiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userToInactiveButtonActionPerformed(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "LASTNAME", "BIRTHDAY", "ADDRESS", "GENDER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userRol, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(userToInactiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByID))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userID)
                    .addComponent(userRol, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userToInactiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchByID)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRolActionPerformed
        setRol();
        fillTable();
        editUserButton.setEnabled(false);
        userToInactiveButton.setEnabled(false);
    }//GEN-LAST:event_userRolActionPerformed

    private void statusUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusUserActionPerformed
        status = !status;
        fillTable();
        editUserButton.setEnabled(false);
        userToInactiveButton.setEnabled(false);
    }//GEN-LAST:event_statusUserActionPerformed

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

    private void searchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIDActionPerformed
        editUserButton.setEnabled(false);
        userToInactiveButton.setEnabled(false);
        String id = userID.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "This field can't be empty");
        } else {
            Users user = GradeMaster.userController.getUser(id);
            if(user == null){
                JOptionPane.showMessageDialog(null, "Wrong ID or User doesn't exist");
            } else {
                DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
                model.setRowCount(0);
                String idUser = user.getId();
                String name = user.getName();
                String lastname = user.getLastname();
                Date birthday = user.getBirthday();
                String address = user.getAddress();
                String gender = user.getGender();
                String status = user.isStatus() ? "ACTIVE" : "INACTIVE";

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = format.format(birthday);

                Object[] newRow = {id, name, lastname, dateString, address, gender, status};
                model.addRow(newRow);
            }
        }
    }//GEN-LAST:event_searchByIDActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        editUserButton.setEnabled(true);
        userToInactiveButton.setEnabled(true);
        int row = usersTable.getSelectedRow();
        userIdSelected = (String) usersTable.getValueAt(row, 0);
        String userStatus = (String) usersTable.getValueAt(row, 6);        
        statusSelected = userStatus.equals("ACTIVE"); 
    }//GEN-LAST:event_usersTableMouseClicked

    private void userToInactiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userToInactiveButtonActionPerformed
        GradeMaster.userController.deleteUser(userIdSelected, !statusSelected);
        String message = !statusSelected ? "ACTIVE" : "INACTIVE";
        JOptionPane.showMessageDialog(null, "Status updated to " + message);
        fillTable();
    }//GEN-LAST:event_userToInactiveButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        WindowFunctions.startUserForm();
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        usersForm userForm = new usersForm();
        user = GradeMaster.userController.getUser(userIdSelected);
        userForm.setOldId(userIdSelected);
        userForm.setIsRegister(false);
        userForm.fillFields(user.getId(), 
                user.getName(), 
                user.getLastname(), 
                user.getPassword(), 
                user.getAddress(), 
                user.getBirthday(),
                user.getGender(),
                user.getRole(),
                user.isStatus());
        userForm.setTitle("GRADEMASTER - Users Form");
        userForm.setVisible(true);
        userForm.setLocationRelativeTo(null);      
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void fillTable(){
        ArrayList<Users> users;
        if(rol == 3){
            users = GradeMaster.userController.getStudents(status);
        } else {
            users = GradeMaster.userController.getTeachers(status);
        }
        
        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        model.setRowCount(0);
        
        for(Users u : users){
            String id = u.getId();
            String name = u.getName();
            String lastname = u.getLastname();
            Date birthday = u.getBirthday();
            String address = u.getAddress();
            String gender = u.getGender();
            String status = u.isStatus() ? "ACTIVE" : "INACTIVE";
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = format.format(birthday);
            
            Object[] newRow = {id, name, lastname, dateString, address, gender, status};
            model.addRow(newRow);
        }
    }
    
    private void setRol(){
        String rolSelected = (String) userRol.getSelectedItem();        
        if (rolSelected.equals("Students")){
            rol = 3;
        } else {
            rol = 2;
        }
        fillTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchByID;
    private javax.swing.JCheckBox statusUser;
    private javax.swing.JTextField userID;
    private javax.swing.JComboBox<String> userRol;
    private javax.swing.JButton userToInactiveButton;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
