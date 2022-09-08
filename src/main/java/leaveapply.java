
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Diganth Rai
 */
public class leaveapply extends javax.swing.JFrame {

    /**
     * Creates new form leaveapply
     */
    public leaveapply() {
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

        leavepanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        tfid = new javax.swing.JTextField();
        leavedatelabel = new javax.swing.JLabel();
        noofdaysvariable = new javax.swing.JLabel();
        namevariable = new javax.swing.JLabel();
        sublabel = new javax.swing.JLabel();
        reasonvariable = new javax.swing.JLabel();
        tfphon = new javax.swing.JTextField();
        tfeid = new javax.swing.JTextField();
        tfdays = new javax.swing.JTextField();
        tfdate = new javax.swing.JTextField();
        tfsub = new javax.swing.JTextField();
        applybutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        contactlabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        tfreason = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leavepanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Leave Application");

        idlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        idlabel.setText("Id");

        tfid.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tfid.setForeground(new java.awt.Color(153, 153, 153));
        tfid.setText("Eg. L1");
        tfid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfidFocusLost(evt);
            }
        });
        tfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidActionPerformed(evt);
            }
        });

        leavedatelabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        leavedatelabel.setText("Leave Date");

        noofdaysvariable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noofdaysvariable.setText("Number Of Days");

        namevariable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namevariable.setText("Eid");

        sublabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sublabel.setText("Substituet name");

        reasonvariable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reasonvariable.setText("Reason");

        tfeid.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tfeid.setForeground(new java.awt.Color(153, 153, 153));
        tfeid.setText("Eg. Eid1");
        tfeid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfeidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfeidFocusLost(evt);
            }
        });
        tfeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeidActionPerformed(evt);
            }
        });

        tfdate.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tfdate.setForeground(new java.awt.Color(153, 153, 153));
        tfdate.setText("YYYY-MM-DD");
        tfdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdateFocusLost(evt);
            }
        });

        applybutton.setBackground(new java.awt.Color(255, 204, 0));
        applybutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        applybutton.setText("Apply");
        applybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applybuttonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        contactlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactlabel.setText("Substituet Contact No");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tfreason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Health Issue", "Family Function", "Personal Work", "Others" }));

        javax.swing.GroupLayout leavepanelLayout = new javax.swing.GroupLayout(leavepanel);
        leavepanel.setLayout(leavepanelLayout);
        leavepanelLayout.setHorizontalGroup(
            leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leavepanelLayout.createSequentialGroup()
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leavepanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(leavepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leavepanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leavedatelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sublabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reasonvariable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfreason, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfsub, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdate, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namevariable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noofdaysvariable, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactlabel))
                .addGap(33, 33, 33)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfphon)
                    .addComponent(tfdays)
                    .addComponent(tfeid, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leavepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leavepanelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leavepanelLayout.createSequentialGroup()
                        .addComponent(applybutton)
                        .addGap(342, 342, 342))))
        );
        leavepanelLayout.setVerticalGroup(
            leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leavepanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leavepanelLayout.createSequentialGroup()
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namevariable)
                            .addComponent(tfeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noofdaysvariable))
                        .addGap(18, 18, 18)
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfphon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactlabel)))
                    .addGroup(leavepanelLayout.createSequentialGroup()
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idlabel))
                        .addGap(18, 18, 18)
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leavedatelabel))
                        .addGap(18, 18, 18)
                        .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sublabel))))
                .addGap(18, 18, 18)
                .addGroup(leavepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfreason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reasonvariable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(applybutton)
                .addGap(17, 17, 17)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leavepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leavepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void applybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applybuttonActionPerformed
        String lid=tfid.getText();
        String eid=tfeid.getText();
        String date=tfdate.getText();
        String noofdays=tfdays.getText();
        String contactnumber=tfphon.getText();
        String substituet=tfsub.getText();
//        String reason=tfreason.getText();
        String reason=(String)tfreason.getSelectedItem();

        String lidregex="L[0-9]+";
        String phnregex="[0-9]+";
        String useridregex="Eid[0-9]+";
        String dateregex="^(202[2-9])[./-]([0]?[1-9]|[1][0-2])[./-]([0]?[1-9]|[1|2][0-9]|[3][0|1])$";


        if(lid.isEmpty() || eid.isEmpty() || date.isEmpty() || contactnumber.isEmpty()|| noofdays.isEmpty() || substituet.isEmpty() || reason.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Fill proper details.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(lid.length()<=5)
        {
            if(lid.matches(lidregex)){
                
         if(eid.length()<=5)
        {
            if(eid.matches(useridregex))
            {
        if(date.matches(dateregex))
        {
        if(contactnumber.length()==10)
        {
            if(contactnumber.matches(phnregex))
            {
               application(lid,eid,date,noofdays,substituet,contactnumber, reason);
            }
            else{
             JOptionPane.showMessageDialog(this, "CONTACT NUMBER must be digits", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "CONTACT NUMBER must have 10 digit", "Error", JOptionPane.ERROR_MESSAGE);    
                    
        }
        }
        else
        {
       JOptionPane.showMessageDialog(this, "Enter date in thr YYYY-MM-DD format", "Error", JOptionPane.ERROR_MESSAGE);    
 
        }
            }
                    else
            {
             JOptionPane.showMessageDialog(this, "ID  not in the required form (eg.Eid1)", "Error", JOptionPane.ERROR_MESSAGE);        
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "max ID length is 5 ", "Error", JOptionPane.ERROR_MESSAGE);
        }
            }
            else
            {
                             JOptionPane.showMessageDialog(this, "LID  not in the required form (eg.L1)", "Error", JOptionPane.ERROR_MESSAGE);        

            }
                
            }
        else{
                         JOptionPane.showMessageDialog(this, "max LID length is 5 ", "Error", JOptionPane.ERROR_MESSAGE);

            
        }
                                                          // TODO add your handling code here:
    }//GEN-LAST:event_applybuttonActionPerformed

    private void tfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here
        Ehome j=new Ehome();
        j.show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tfidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfidFocusGained
        // TODO add your handling code here:
          if(tfid.getText().equals("Eg. L1"))
        {
            tfid.setText("");
            tfid.setForeground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_tfidFocusGained

    private void tfidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfidFocusLost
 if(tfid.getText().equals(""))
        {
            tfid.setText("Eg. L1");
            tfid.setForeground(new Color(153,153,153));
        }
                    // TODO add your handling code here:
    }//GEN-LAST:event_tfidFocusLost

    private void tfeidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfeidFocusGained
        // TODO add your handling code here:
          if(tfeid.getText().equals("Eg. Eid1"))
        {
            tfeid.setText("");
            tfeid.setForeground(new Color(153,153,153));
            
        }
        
    }//GEN-LAST:event_tfeidFocusGained

    private void tfeidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfeidFocusLost
        // TODO add your handling code here:
        if(tfeid.getText().equals(""))
        {
            tfeid.setText("Eg. Eid1");
            tfeid.setForeground(new Color(153,153,153));
        }
          
    }//GEN-LAST:event_tfeidFocusLost

    private void tfeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfeidActionPerformed

    private void tfdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdateFocusGained
        // TODO add your handling code here:
        if(tfdate.getText().equals("YYYY-MM-DD"))
        {
            tfdate.setText("");
            tfdate.setForeground(new Color(153,153,153));
        }
          
    }//GEN-LAST:event_tfdateFocusGained

    private void tfdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdateFocusLost
        // TODO add your handling code here:
         if(tfdate.getText().equals(""))
        {
            tfdate.setText("YYYY-MM-DD");
            tfdate.setForeground(new Color(153,153,153));
        }
    
        
    }//GEN-LAST:event_tfdateFocusLost

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
            java.util.logging.Logger.getLogger(leaveapply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaveapply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaveapply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaveapply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leaveapply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applybutton;
    private javax.swing.JLabel contactlabel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel leavedatelabel;
    private javax.swing.JPanel leavepanel;
    private javax.swing.JLabel namevariable;
    private javax.swing.JLabel noofdaysvariable;
    private javax.swing.JLabel reasonvariable;
    private javax.swing.JLabel sublabel;
    private javax.swing.JTextField tfdate;
    private javax.swing.JTextField tfdays;
    private javax.swing.JTextField tfeid;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfphon;
    private javax.swing.JComboBox<String> tfreason;
    private javax.swing.JTextField tfsub;
    // End of variables declaration//GEN-END:variables

    private void application(String lid, String eid, String date, String noofdays, String substituet,String contactnumber,  String reason) {
        System.out.println(lid);
        System.out.println(eid);
        Connection dbconn = DBconnection.connectDB();
        try {
            PreparedStatement st;
            st = (PreparedStatement)dbconn.prepareStatement("insert into leave_system (Lid,Eid,Leave_date,No_of_days,Substitute_name,Sub_phno,Reason) values(?,?,?,?,?,?,?)");   
            st.setString(1,lid);
            st.setString(2,eid);
            st.setString(3,date);
            st.setString(4,noofdays);
            st.setString(5,substituet);
            st.setString(6,contactnumber);
            st.setString(7,reason);
            
            
            tfid.setText("");
            tfeid.setText("");
            tfdate.setText("");
            tfdays.setText("");
            tfsub.setText("");
            tfphon.setText("");
            tfid.requestFocus();

            JOptionPane.showMessageDialog(this,"Applied Successful");
            int res= st.executeUpdate();
            
        }catch (SQLException ex) {
              JOptionPane.showMessageDialog(this, ex, "Error", JOptionPane.ERROR_MESSAGE);    
            Logger.getLogger(Ologin.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }}

   