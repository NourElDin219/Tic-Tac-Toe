


import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EGYPT_LAPTOP
 */
 class easy_form extends javax.swing.JFrame { 
    easy easy1=new easy();
    public easy_form() { 
        initComponents();
        
        setVisible(true);
        
        setLocationRelativeTo(null);
       
     setResizable(false);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     for(int i=0;i<9;i++)
  {
  easy1.founded[i]=-1;
  }
        
    }   
        public JFrame getframe() {
        return this;
    }
      public void computer_plays()
      {  
        easy1.computer_plays(jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
      easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
   
      easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
      
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
            java.util.logging.Logger.getLogger(hard_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hard_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hard_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hard_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new easy_form().setVisible(true);
            }
        });
    }
           
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText(" ");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 240, 175, 158);

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText(" ");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 410, 175, 147);

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 102));
        jButton8.setText(" ");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(180, 410, 172, 147);

        jButton9.setBackground(new java.awt.Color(0, 102, 102));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 102));
        jButton9.setText(" ");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(360, 410, 169, 147);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText(" ");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 80, 175, 153);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText(" ");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 80, 172, 153);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText(" ");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 80, 169, 153);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText(" ");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 240, 169, 158);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText(" ");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(180, 240, 172, 158);

        jLabel2.setBackground(new java.awt.Color(102, 0, 102));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 530, 490);

        jButton10.setBackground(new java.awt.Color(0, 102, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setText("X");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(500, 0, 30, 20);

        jButton11.setBackground(new java.awt.Color(0, 102, 102));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow-key.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(0, 0, 30, 17);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mode Play : Easy ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 300, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/battery6.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 0, 70, 70);

        setBounds(0, 0, 531, 564);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jButton6.setText(easy1.turn);
      
       jButton6.setEnabled(false); 
       
       
         easy1.founded[easy1.c]=5;
        easy1.c++;
          easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
         computer_plays();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

           jButton7.setText(easy1.turn);
         
       jButton7.setEnabled(false); 
        easy1.founded[easy1.c]=6;
       easy1.c++;
       easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
       
       easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
         jButton8.setText(easy1.turn);
         
       jButton8.setEnabled(false); 
        easy1.founded[easy1.c]=7;
    
       easy1.c++;
       easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
       
       easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays();
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

       
         jButton9.setText(easy1.turn);
         
       jButton9.setEnabled(false); 
        easy1.founded[easy1.c]=8;
       easy1.c++;
       easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
       easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   jButton1.setText(easy1.turn);
          easy1.founded[easy1.c]=0;
       easy1.c++;
        
        jButton1.setEnabled(false);
        easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays();
       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         easy1.founded[easy1.c]=1;
       easy1.c++;
      
        jButton2.setText(easy1.turn);
        
        jButton2.setEnabled(false);
        easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        
       computer_plays();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  jButton3.setText(easy1.turn);
       
       jButton3.setEnabled(false); 
        easy1.founded[easy1.c]=2;
       easy1.c++;
        easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
       
       easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays();    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       easy1.founded[easy1.c]=3;
       easy1.c++;
        
        jButton4.setText(easy1.turn);
        
        jButton4.setEnabled(false);
        easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
         computer_plays();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 jButton5.setText(easy1.turn);
         
       jButton5.setEnabled(false); 
        easy1.founded[easy1.c]=4;
       easy1.c++;
       easy1.check_Winner(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
       
       easy1.check_Tie(this,jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9);
        computer_plays();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        levelS__form y = new levelS__form();
        y.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}