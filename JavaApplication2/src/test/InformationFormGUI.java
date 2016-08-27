
package test;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akash
 */
public class InformationFormGUI extends javax.swing.JFrame {

    public InformationFormGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Session = new javax.swing.JComboBox();
        Month = new javax.swing.JComboBox();
        Sex = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        Day = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Information form");
        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setText("Name");

        jTextField1.setText("Enter Your Name");

        jLabel2.setText("Roll");

        jTextField2.setText("Enter Your Roll");

        jLabel3.setText("Dept Enrolled");

        jLabel4.setText("Session");

        jLabel5.setText("Date of Birth");

        jLabel6.setText("Month");

        jLabel7.setText("Day");

        jLabel8.setText("Year");

        jLabel9.setText("Sex");

        Session.setBackground(new java.awt.Color(153, 204, 255));
        Session.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..", "2013-14", "2012-13", "2011-12", "2010-11" }));
        Session.setAutoscrolls(true);
        Session.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Session.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SessionItemStateChanged(evt);
            }
        });
        Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionActionPerformed(evt);
            }
        });

        Month.setBackground(new java.awt.Color(153, 204, 255));
        Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MonthItemStateChanged(evt);
            }
        });
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Sex.setBackground(new java.awt.Color(153, 255, 255));
        Sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..", "Male", "Female" }));
        Sex.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SexItemStateChanged(evt);
            }
        });
        Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexActionPerformed(evt);
            }
        });

        jLabel10.setText("Password");

        Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        Day.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DayItemStateChanged(evt);
            }
        });
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });

        jPasswordField1.setText("akash");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPasswordField1PropertyChange(evt);
            }
        });

        jButton1.setText("Save to Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(Session, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(Month, 0, 99, Short.MAX_VALUE)
                                    .addComponent(Day, 0, 99, Short.MAX_VALUE)))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButton1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    String  asess , bsex, cmonth, dday,  password;
    int flag = 0;


    private void SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionActionPerformed
        
    }//GEN-LAST:event_SessionActionPerformed

    private void SessionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SessionItemStateChanged
    asess = (String)Session.getSelectedItem();
}//GEN-LAST:event_SessionItemStateChanged

    private void SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexActionPerformed
    

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
        // TODO add your handling code here:
        dday = (String)Day.getSelectedItem();
        flag =1;
    }//GEN-LAST:event_DayActionPerformed
  
    private void MonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MonthItemStateChanged
        // TODO add your handling code here:
        cmonth = (String)Month.getSelectedItem();
    }//GEN-LAST:event_MonthItemStateChanged

    private void DayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DayItemStateChanged
        // TODO add your handling code here:
        if (flag == 0)
                    dday = (String)Day.getSelectedItem();
    }//GEN-LAST:event_DayItemStateChanged

    private void SexItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SexItemStateChanged
        // TODO add your handling code here:
         bsex = (String)Sex.getSelectedItem();
    }//GEN-LAST:event_SexItemStateChanged

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPasswordField1PropertyChange
        // TODO add your handling code here:
        password = new String(jPasswordField1.getPassword());
    }//GEN-LAST:event_jPasswordField1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText();
                    String roll = jTextField2.getText();
                    String dept = jTextField3.getText();
                    //String s4 = jTextField4.getText();
                    //String s5 = jTextField5.getText();
                    //String s6 = jTextField6.getText();
                    String year = jTextField7.getText();
                try {
                     String result = "Name : " + name + " Roll: "+ roll + " Dept enrolled: "+ dept + " Session: "+ asess  +  " Date of Birth: mm/dd/yy :" + cmonth +"/"+ dday + "/"+ year + " Sex: " + bsex + " Password: " + password;

                    FileWriter akash = new FileWriter("akash.txt");
                    akash.write( result );
                    akash.close();
                }
                catch (IOException ex) {
                   // Logger.getLogger(InformationFormGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed
     
        

    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformationFormGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Day;
    private javax.swing.JComboBox Month;
    private javax.swing.JComboBox Session;
    private javax.swing.JComboBox Sex;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

}
