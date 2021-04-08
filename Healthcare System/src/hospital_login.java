import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svas0
 */
public class hospital_login extends javax.swing.JFrame {

    /**
     * Creates new form hospital_form
     */
    public hospital_login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hospital_id = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 38)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOSPITAL LOGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 330, 60));

        jLabel4.setBackground(new java.awt.Color(42, 127, 186));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 100));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hospital ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hosp.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 430, 500));

        hospital_id.setBackground(new java.awt.Color(255, 255, 255));
        hospital_id.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        hospital_id.setInheritsPopupMenu(true);
        hospital_id.setOpaque(false);
        hospital_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospital_idActionPerformed(evt);
            }
        });
        jPanel1.add(hospital_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, 30));

        login_button.setBackground(new java.awt.Color(42, 127, 186));
        login_button.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Submit");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 40));

        reset_button.setBackground(new java.awt.Color(42, 127, 186));
        reset_button.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        reset_button.setForeground(new java.awt.Color(255, 255, 255));
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 80, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 260, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hospital_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospital_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospital_idActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
     login_button.setBackground(Color.decode("#4F8AF2")); 
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/HealthcareSystem?useSSL=false","root","baggster");
           String hospitalID= hospital_id.getText();
           String hospitalpassword=password.getText();
           
           Statement stm =con.createStatement();
           String hospitallogin="Select * from Hospital_login where Hospital_ID='"+hospitalID+"' and password='"+hospitalpassword+"'";
           ResultSet rs=stm.executeQuery(hospitallogin);
           
           if(rs.next()){
               dispose();
               hospital_home_page hhp=new hospital_home_page();
               hhp.show();
           }else{
               JOptionPane.showMessageDialog(this,"Hospital ID or password is invalid");
               hospital_id.setText("");
      password.setText("");
              
           }
           con.close();
           
       }
           catch(Exception e){
                   System.out.println(e.getMessage());
                   
                   }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
      hospital_id.setText("");
      password.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(hospital_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospital_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospital_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospital_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospital_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hospital_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset_button;
    // End of variables declaration//GEN-END:variables
}
