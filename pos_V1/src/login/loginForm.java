/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import Dasboard_MidValley_Manager.managerDashboard;
import  Dashboard_MidValley.*;
import Dashboard_MidValley_RegionManager.regionDashboard;
import  Dashboard_ak.*;
import  Dashboard_Sunway.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Component;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author hairi
 */
public class loginForm extends javax.swing.JFrame {

   
    
    String outlet;
    String position;
    
    public loginForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_outlet = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_position = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(156, 242, 245));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 234, 182));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Id :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password :");

        jTextField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_passActionPerformed(evt);
            }
        });

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Select outlet :");

        jComboBox_outlet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mid Valley", "Avenue K", "Sunway Velocity" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Position :");

        jComboBox_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales", "Manager", "Region Manager" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_outlet, 0, 217, Short.MAX_VALUE)
                                .addComponent(jComboBox_position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_pass))
                            .addComponent(jTextField_id)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_outlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Hi, Welcome to Shaggy POS system !");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_passActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        outlet = jComboBox_outlet.getSelectedItem()+"";
        position = jComboBox_position.getSelectedItem()+"";
        
        //mid valley sales algo
        if(outlet.equals("Mid Valley") && position.equals("Sales"))
    {
        try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
             String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' ";
             Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
             
         
             while(rs.next()){
                 dispose();
                 
                 test_posDashboard mv = new test_posDashboard(jTextField_id.getText(),jComboBox_outlet.getSelectedItem().toString(),jComboBox_position.getSelectedItem().toString());
                 mv.setLocationRelativeTo(null);
                 mv.setVisible(true);
                 
                
 
             }
        } catch (Exception e) {
           
    
        }
    }     //mid valley manager algo
        else if(outlet.equals("Mid Valley") && position.equals("Manager")){
            try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
            String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' "; Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
          
         
             while(rs.next()){
                 
                 dispose();
                 managerDashboard mv = new managerDashboard(jTextField_id.getText(),jComboBox_outlet.getSelectedItem().toString(),jComboBox_position.getSelectedItem().toString());
                  mv.setVisible(true);
                  
                 
 
             }
        } catch (Exception e) {
            
    
        }
      }
         //avenue k algo
        else if(outlet.equals("Mid Valley") && position.equals("Region Manager")){
         try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
           String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' "; Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
          
         
             while(rs.next()){
                 regionDashboard mv = new regionDashboard(jTextField_id.getText(),jComboBox_outlet.getSelectedItem().toString(),jComboBox_position.getSelectedItem().toString());
                 mv.setVisible(true);
                 
                 this.hide();
 
             }
        } catch (Exception e) {
        }
         
         
        }  
        else if(outlet.equals("Avenue K") && position.equals("Manager")){
         try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
            String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' "; Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
          
         
             while(rs.next()){
                 posDashboardAk_manager mv = new posDashboardAk_manager();
                 mv.setVisible(true);
                  posDashboardAk_manager.jLabel_cashiername.setText(id);
                 posDashboardAk_manager.jLabel_branchName.setText(outlet);
                 posDashboardAk_manager.jLabel_positionname.setText(position);
                 this.hide();
 
             }
        } catch (Exception e) {
        } 
        }
        //sunway mall
        else if(outlet.equals("Sunway Velocity Mall") && position.equals("Sales")){
         try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
            String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' ";Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
          
         
             while(rs.next()){
                 posDashboardSunway mv = new posDashboardSunway();
                 mv.setVisible(true);
                  posDashboardSunway.jLabel_cashiername.setText(id);
                 posDashboardSunway.jLabel_branchName.setText(outlet);
                 posDashboardSunway.jLabel_positionname.setText(position);
                 this.hide();
 
             }
        } catch (Exception e) {
        }
         
         
        } 
        else if(outlet.equals("Sunway Velocity Mall") && position.equals("Manager")){
         try {
            
             Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
             String id= jTextField_id.getText();
             String pass = jTextField_pass.getText();
             
             
             String sql = "SELECT `employee`.`emp_id`, `employee`.`password`, `employee`.`f_name`, `employee`.`position`, `branch`.`b_name` FROM `branch` LEFT JOIN `employee` ON `employee`.`bid` = `branch`.`bid` where `emp_id`='"+id+"' AND `password`='"+pass+"' ";Statement s =(Statement) con.prepareStatement(sql);
             ResultSet rs = s.executeQuery(sql);
          
         
             while(rs.next()){
                 posDashboardSunway_manager mv = new posDashboardSunway_manager();
                 mv.setVisible(true);
                  posDashboardSunway_manager.jLabel_cashiername.setText(id);
                 posDashboardSunway_manager.jLabel_branchName.setText(outlet);
                 posDashboardSunway_manager.jLabel_positionname.setText(position);
                 this.hide();
 
             }
        } catch (Exception e) {
        }
         
         
        } 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
                 //manager algo
     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox_outlet;
    private javax.swing.JComboBox<String> jComboBox_position;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_pass;
    // End of variables declaration//GEN-END:variables
}
