/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.universitysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author DCN
 */
public class StudentUpdate extends javax.swing.JFrame {
    ArrayList<String> sList= new ArrayList<>();    
    ArrayList<Integer> idsList= new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();

    /**
     * Creates new form StudentUpdate
     */
    public StudentUpdate() {
        initComponents();
        fetchStudentList();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbStudent = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfFname = new javax.swing.JTextField();
        tfMname = new javax.swing.JTextField();
        tfDob = new javax.swing.JTextField();
        tfContact = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbRollNo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfClass_xii = new javax.swing.JTextField();
        tfClass_x = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lbError = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        cbCourse = new javax.swing.JComboBox<>();
        cbBranch = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(120, 137, 146));

        jPanel2.setBackground(new java.awt.Color(207, 207, 207));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 33, 45));
        jLabel2.setText("Update Student");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 33, 45));
        jLabel1.setText("Select student:");

        cbStudent.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        cbStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbStudentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbStudentMousePressed(evt);
            }
        });
        cbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStudentActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 33, 45));
        jLabel4.setText("Name");

        lbName.setFont(new java.awt.Font("Elephant", 0, 19)); // NOI18N
        lbName.setForeground(new java.awt.Color(41, 72, 89));
        lbName.setText(" ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 33, 45));
        jLabel5.setText("Father's name");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 33, 45));
        jLabel6.setText("Mother's name");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 33, 45));
        jLabel7.setText("Date of birth");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 33, 45));
        jLabel8.setText("Address");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 33, 45));
        jLabel9.setText("Contact number");

        tfFname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfFname.setText(" ");
        tfFname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFnameActionPerformed(evt);
            }
        });

        tfMname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfMname.setText(" ");
        tfMname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMnameActionPerformed(evt);
            }
        });

        tfDob.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfDob.setText(" ");
        tfDob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDobActionPerformed(evt);
            }
        });

        tfContact.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfContact.setText(" ");
        tfContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContactActionPerformed(evt);
            }
        });

        tfAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfAddress.setText(" ");
        tfAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 33, 45));
        jLabel10.setText("Roll number");

        lbRollNo.setFont(new java.awt.Font("Elephant", 0, 19)); // NOI18N
        lbRollNo.setForeground(new java.awt.Color(41, 72, 89));
        lbRollNo.setText(" ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 33, 45));
        jLabel13.setText("Class XII score");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(17, 33, 45));
        jLabel14.setText("Email");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 33, 45));
        jLabel15.setText("Class X score");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(17, 33, 45));
        jLabel16.setText("Password");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(17, 33, 45));
        jLabel17.setText("Course");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 33, 45));
        jLabel18.setText("Branch");

        tfPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfPassword.setText(" ");
        tfPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        tfClass_xii.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfClass_xii.setText(" ");
        tfClass_xii.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfClass_xii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClass_xiiActionPerformed(evt);
            }
        });

        tfClass_x.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfClass_x.setText(" ");
        tfClass_x.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfClass_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClass_xActionPerformed(evt);
            }
        });

        tfEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tfEmail.setText(" ");
        tfEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        lbError.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N
        lbError.setForeground(new java.awt.Color(193, 55, 55));

        btnSubmit.setBackground(new java.awt.Color(6, 20, 27));
        btnSubmit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Update");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubmit.setMaximumSize(new java.awt.Dimension(64, 18));
        btnSubmit.setMinimumSize(new java.awt.Dimension(64, 18));
        btnSubmit.setPreferredSize(new java.awt.Dimension(64, 18));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cbCourse.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "BBA", "MBA", "B.Tech", "M.Tech", "BCom", "MCom", "BA", "MA", " " }));
        cbCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        cbCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbBranch.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Electronics", "Mechanical", "Civil", "Accounting", "Buisness Analytics", "Finance", "Human Resources", "Entrepreneurship", "Marketing" }));
        cbBranch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));
        cbBranch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBranchActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(169, 169, 169));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setText("←");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 55, 69)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMname)
                    .addComponent(tfFname)
                    .addComponent(cbStudent, 0, 152, Short.MAX_VALUE)
                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDob)
                    .addComponent(tfAddress)
                    .addComponent(tfContact))
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(lbRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPassword)
                                    .addComponent(tfEmail)
                                    .addComponent(tfClass_x)
                                    .addComponent(tfClass_xii)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(90, 90, 90)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cbCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(11, 11, 11))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(262, 262, 262))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRollNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClass_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClass_xii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbStudentMouseClicked
        // TODO add your handling code here:
        lbError.setText("");
        Integer i = cbStudent.getSelectedIndex();
        int selectedId = idsList.get(i);
        String selectedName = nameList.get(i);
        String id = String.valueOf(selectedId);
        lbName.setText(selectedName);
        lbRollNo.setText(id);
        
        String sql = "select * from students where rollno = ?";
            
        Connection conn;
        try {
            conn = ConnectionUtil.getInstance();
            PreparedStatement  pst = conn.prepareStatement(sql);
            pst.setInt(1, selectedId);
            ResultSet rs = pst.executeQuery();
                
            if(rs.next())
            {
                String class_xii = rs.getString("class_xii");
//                String name = rs.getString("name");
                String fname = rs.getString("fname");
                String mname = rs.getString("mname");
                String dob = rs.getString("dob");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String course = rs.getString("course");
                String class_x = rs.getString("class_x");
                String branch = rs.getString("branch");   
                String contact = rs.getString("contact");
                
                cbCourse.setSelectedItem(course);
                tfFname.setText(fname);
                tfMname.setText(mname);
                tfDob.setText(dob);
                tfAddress.setText(address);
                tfEmail.setText(email);
                tfPassword.setText(password);
                tfClass_x.setText(class_x);
                cbBranch.setSelectedItem(branch);
                tfClass_xii.setText(class_xii);
                tfContact.setText(contact);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateFaculty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_cbStudentMouseClicked

    private void cbStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbStudentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStudentMousePressed

    private void cbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStudentActionPerformed

    private void tfFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFnameActionPerformed

    private void tfMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMnameActionPerformed

    private void tfDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDobActionPerformed

    private void tfContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContactActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfClass_xiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClass_xiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClass_xiiActionPerformed

    private void tfClass_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClass_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClass_xActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Connection conn;
        try {
            conn = ConnectionUtil.getInstance();
            String sql2 = "update students set fname = ?, mname = ?, dob = ?, address = ?, email = ?, password = ?, branch = ?, class_x = ?, course = ?, class_xii = ?, contact = ? where rollno=?";

            Integer i = cbStudent.getSelectedIndex();
            int selectedId = idsList.get(i);
                PreparedStatement pst1 = conn.prepareStatement(sql2);
                pst1.setString(1, tfFname.getText());
                pst1.setString(2, tfMname.getText());
                pst1.setString(3, tfDob.getText());
                pst1.setString(4, tfAddress.getText());
                pst1.setString(5, tfEmail.getText());
                pst1.setString(6, tfPassword.getText());
                pst1.setString(7, (String) cbBranch.getSelectedItem());
                pst1.setString(8, tfClass_x.getText());
                pst1.setString(9, (String) cbCourse.getSelectedItem());
                pst1.setString(10, tfClass_xii.getText());
                pst1.setString(11, tfContact.getText());
                
                pst1.setInt(12, selectedId);
                
                int a = pst1.executeUpdate();

                if(a > 0)
                {
                    lbError.setText("Information updated successfully.");
                }
                else
                {
                    lbError.setText("Error in updating the information, please try again.");
                }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateFaculty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBranchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminLogin lp;
        lp = new AdminLogin();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbBranch;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRollNo;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfClass_x;
    private javax.swing.JTextField tfClass_xii;
    private javax.swing.JTextField tfContact;
    private javax.swing.JTextField tfDob;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfMname;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables

    private void fetchStudentList() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          try{
            Connection conn= ConnectionUtil.getInstance();
            
            if(conn==null)
            {
                System.out.println("Connection error");
            }
            else{
                    System.out.println("Connection established"); 
            }
            Statement st = conn.createStatement();
            ResultSet rs=  st.executeQuery("select * from students");

        
          
//          ResultSet rs2 =  st.executeQuery("select * from users");
            while(rs.next())
            {
            sList.add(rs.getInt("rollno")+"-"+rs.getString("name"));
            idsList.add(rs.getInt("rollno"));
            nameList.add(rs.getString("name"));
            }
            String [] arr = new String[sList.size()];
            int i=0;
            for(String item :sList)
            {
                arr[i]= item;
                i++;
            }
            ComboBoxModel model = new DefaultComboBoxModel(arr);
            cbStudent.setModel(model);
        }  catch (SQLException ex) {
            Logger.getLogger(StudentsList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

