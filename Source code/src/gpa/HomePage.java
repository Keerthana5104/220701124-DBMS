/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gpa;
 

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Keerthana .S
 */
public class HomePage extends javax.swing.JFrame {

    private Object[] C;

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        this.setResizable(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        OrderButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        C1 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        C6 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C5 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        C2 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        S2 = new javax.swing.JSpinner();
        S3 = new javax.swing.JSpinner();
        S4 = new javax.swing.JSpinner();
        S5 = new javax.swing.JSpinner();
        S6 = new javax.swing.JSpinner();
        S1 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        C7 = new javax.swing.JCheckBox();
        S7 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        S8 = new javax.swing.JSpinner();
        C8 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        C9 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        C10 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        S9 = new javax.swing.JSpinner();
        S10 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1700, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(1700, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(1700, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FOOD ORDER APP");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 320, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 110, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 24), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(1700, 900));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "Order Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderButton.setBackground(new java.awt.Color(0, 153, 153));
        OrderButton.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(255, 255, 255));
        OrderButton.setText(" Order ");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        jPanel7.add(OrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 110, 40));

        ListArea.setColumns(20);
        ListArea.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        ListArea.setRows(5);
        jScrollPane1.setViewportView(ListArea);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 490));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 120, 40));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, 420, 610));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "MAIN COURSE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C1.setText("Biryani");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel9.add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, 30));

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C4.setText("Naan with");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel9.add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 120, 30));

        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C6.setText("Meals");
        C6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        jPanel9.add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 90, 30));

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C3.setText("Fried Rice");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel9.add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C5.setText("Chapathi Kurma(2 Pcs) ");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        jPanel9.add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Biriyani (2).png"))); // NOI18N
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Naan.png"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Noodles.png"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 170, 130));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Chapati.png"))); // NOI18N
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 180, 130));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C2.setText("Noodles");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel9.add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Fried Rice.png"))); // NOI18N
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 190, 130));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Meals.png"))); // NOI18N
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 200, 130));

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel13.setText("₹ 130");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 50, 30));

        jLabel14.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel14.setText("₹ 270");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 50, 30));

        jLabel15.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel15.setText("₹ 210");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 50, 30));

        jLabel16.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel16.setText("₹ 90");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 40, 30));

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel17.setText("₹ 190");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 50, 30));

        jLabel22.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel22.setText("₹ 120");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 50, 30));

        S2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 60, 30));

        S3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 60, 30));

        S4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 60, 30));

        S5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 60, 30));

        S6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 60, 30));

        S1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 60, 30));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel23.setText("Panner Butter Masala");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Tea.png"))); // NOI18N
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, 130));

        C7.setBackground(new java.awt.Color(255, 255, 255));
        C7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C7.setText("Tea");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        jPanel9.add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, 20));

        S7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 60, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Coffee.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 180, 140));

        S8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 60, 30));

        C8.setBackground(new java.awt.Color(255, 255, 255));
        C8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C8.setText("Filter Coffee");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        jPanel9.add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 130, -1));

        jLabel18.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel18.setText("₹ 40");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 50, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel19.setText("₹ 30");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 50, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Ice cream.png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 180, 130));

        C9.setBackground(new java.awt.Color(255, 255, 255));
        C9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C9.setText("Vanilla Icecream");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });
        jPanel9.add(C9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 170, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gpa/Buttermilk.png"))); // NOI18N
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 180, 150));

        C10.setBackground(new java.awt.Color(255, 255, 255));
        C10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        C10.setText("Buttermilk");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });
        jPanel9.add(C10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 130, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel20.setText("₹ 60");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 50, 30));

        S9.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 60, 30));

        S10.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jPanel9.add(S10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 60, 30));

        jLabel21.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel21.setText("₹ 45");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 520, 50, 30));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1040, 610));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1510, 690));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C7ActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
     
         try {
        Connection con;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pfo", "root", "Rec124.edu.in");
        System.out.println("Connected to database.");

        String[] foodItems = {"Biriyani", "Noodles", "Fried rice", "Naan with Panner Butter Masala",
                "Chapathi with kurma(2 pcs)", "Meals", "Tea", "Coffee", "Vanilla Ice cream", "Buttermilk"};
        double[] foodPrices = {210.0, 130.0, 120.0, 270.0, 90.0, 190.0, 40.0, 30.0, 60.0, 45.0};

        // Get current date
        JCheckBox[] C = {C1, C2, C3, C4, C5, C6, C7, C8, C9, C10}; // Assuming C1 to C10 are your checkbox variables
        JSpinner[] S = {S1, S2, S3, S4, S5, S6, S7, S8, S9, S10}; // Assuming S1 to S10 are your spinner variables
        Date orderDate = Date.valueOf(LocalDate.now());
  
         
        double total = 0.00;
        for (int i = 0; i < foodItems.length; i++) {
            if (C[i].isSelected()) {
                int quantity = (int) S[i].getValue();
                double price = foodPrices[i];
                total += price * quantity;
                
            }
        }

        // Insert order and get orderId
        int orderId = insertOrder(con, orderDate, total);

        for (int i = 0; i < foodItems.length; i++) {
            if (C[i].isSelected()) {
                String itemName = foodItems[i];
                int quantity = (int) S[i].getValue();
                double price = foodPrices[i];
                insertOrderItem(con, orderId, itemName, quantity, price);
            }
        }

        con.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
         updateOrderDetails();
        
    
        
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.hide();
        gframe g=new gframe();
        g.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private static void insertOrderItem(Connection con, int orderId, String itemName, int quantity, double price) throws SQLException {
    String query = "INSERT INTO OrderItems (OrderID, ItemName, Quantity, Price) VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setInt(1, orderId);
    pst.setString(2, itemName);
    pst.setInt(3, quantity);
    pst.setDouble(4, price);

    int rowsInserted = pst.executeUpdate();
    if (rowsInserted > 0) {
        System.out.println("Order for " + itemName + " inserted successfully.");
    }
}

    private static int insertOrder(Connection con, Date orderDate, double total) throws SQLException {
    String insertOrderQuery = "INSERT INTO OrdersTable (OrderDate, TotalPrice) VALUES (?, ?)";
    PreparedStatement pst = con.prepareStatement(insertOrderQuery, Statement.RETURN_GENERATED_KEYS);
    pst.setDate(1, orderDate);
    pst.setDouble(2, total);
    pst.executeUpdate();

    ResultSet rs = pst.getGeneratedKeys();
    if (rs.next()) {
        return rs.getInt(1);
    }
    return -1;
}
    
    
    public void updateOrderDetails() {
        StringBuilder orderDetails = new StringBuilder();
        String[] foodItems = {"Biriyani", "Noodles", "Fried rice", "Naan",
                "Chapathi", "Meals", "Tea", "Coffee", "Ice cream", "Buttermilk"};
        double[] foodPrices = {210.00, 130.00, 120.00, 270.00, 90.00, 190.00, 40.00, 30.00, 60.00, 45.00};
         LocalDateTime now = LocalDateTime.now();
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
         String formattedDate = now.format(dateFormatter);
        // Get current date
        JCheckBox[] C = {C1, C2, C3, C4, C5, C6, C7, C8, C9, C10}; // Assuming C1 to C10 are your checkbox variables
        JSpinner[] S = {S1, S2, S3, S4, S5, S6, S7, S8, S9, S10};
        double totalamount = 0.00;
        double total=0.00;

        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "                                         TASTE BITES         \n");
         ListArea.setText(ListArea.getText() + "                   DATE & TIME: " + formattedDate + "\n");
        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "------------------------------------------------------------------------------\n");
        ListArea.setText(ListArea.getText() +  "      Item Name  " + "\t"+ "       Item Price" + "\t" + "     Quantity" + "\t" + "   Price" + "\n");
        
        ListArea.setText(ListArea.getText() + "------------------------------------------------------------------------------\n");
        ListArea.setText(ListArea.getText() + "\n");

         
        
        for (int i = 0; i < foodItems.length; i++) {
            if (C[i].isSelected()) {
                String itemName = foodItems[i];
                int quantity = (int) S[i].getValue();
                double price = foodPrices[i];
                total = price * quantity;
                totalamount+=total;
                ListArea.setText(ListArea.getText() + "      "+  itemName + "\t" + "        "+ price + "\t" + "           "+ quantity + "\t" + "    "+total+ "\n");
            }
            
        }
        
        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "------------------------------------------------------------------------------\n");
        ListArea.setText(ListArea.getText() + "                                                           " + "Total Amount : " + "     " + totalamount + "\n");
        ListArea.setText(ListArea.getText() + "------------------------------------------------------------------------------\n");
        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "\n");
        ListArea.setText(ListArea.getText() + "******************THANKS FOR ORDERING****************");
        
        JOptionPane.showMessageDialog(null,"Order Sucessful");
    }

  
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C10;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JCheckBox C5;
    private javax.swing.JCheckBox C6;
    private javax.swing.JCheckBox C7;
    private javax.swing.JCheckBox C8;
    private javax.swing.JCheckBox C9;
    private javax.swing.JTextArea ListArea;
    private javax.swing.JButton OrderButton;
    private javax.swing.JSpinner S1;
    private javax.swing.JSpinner S10;
    private javax.swing.JSpinner S2;
    private javax.swing.JSpinner S3;
    private javax.swing.JSpinner S4;
    private javax.swing.JSpinner S5;
    private javax.swing.JSpinner S6;
    private javax.swing.JSpinner S7;
    private javax.swing.JSpinner S8;
    private javax.swing.JSpinner S9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
