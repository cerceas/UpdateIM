/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherPackage;

import static connectionPackage.DBconnection.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Ringo
 */
public class CreateQuestionFrame extends javax.swing.JFrame {

    String title;
    String user;
    /**
     * Creates new form CreateQuestionFrame
     */
    public CreateQuestionFrame() {
        initComponents();
        PanelWithChoices.setVisible(false);
        PANELTEXT.setVisible(false);
           ComboBoxChoices.removeAllItems();
        ComboBoxChoices.addItem("A");
         ComboBoxChoices.addItem("B");
          ComboBoxChoices.addItem("C");
           ComboBoxChoices.addItem("D");
    }

    public CreateQuestionFrame(String user,String title) {
        initComponents();
        PanelWithChoices.setVisible(false);
        PANELTEXT.setVisible(false);
        this.title = title;
        this.user=user;
        ComboBoxChoices.removeAllItems();
        ComboBoxChoices.addItem("A");
         ComboBoxChoices.addItem("B");
          ComboBoxChoices.addItem("C");
           ComboBoxChoices.addItem("D");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TEXTAREAQTN = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MULTIBTN = new javax.swing.JButton();
        PanelWithChoices = new javax.swing.JPanel();
        TextFieldB = new javax.swing.JTextField();
        TextFieldC = new javax.swing.JTextField();
        TextFieldD = new javax.swing.JTextField();
        TextFieldA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MULTIADD = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxChoices = new javax.swing.JComboBox<>();
        SINGLEBTN = new javax.swing.JButton();
        PANELTEXT = new javax.swing.JPanel();
        TextFieldAnswerText = new javax.swing.JTextField();
        SINGLEADD = new javax.swing.JButton();
        DONEBTN = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("jRadioButtonMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TEXTAREAQTN.setColumns(20);
        TEXTAREAQTN.setRows(5);
        jScrollPane2.setViewportView(TEXTAREAQTN);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Question:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Answer:");

        MULTIBTN.setText("WITH MULTIPLE CHOICES");
        MULTIBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("A");

        jLabel4.setText("B");

        jLabel5.setText("C");

        jLabel6.setText("D");

        MULTIADD.setText("ADD");
        MULTIADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIADDActionPerformed(evt);
            }
        });

        jLabel7.setText("CORRECT ANSWER");

        ComboBoxChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PanelWithChoicesLayout = new javax.swing.GroupLayout(PanelWithChoices);
        PanelWithChoices.setLayout(PanelWithChoicesLayout);
        PanelWithChoicesLayout.setHorizontalGroup(
            PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWithChoicesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextFieldB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                            .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextFieldD, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(MULTIADD))
                                .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(ComboBoxChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7)))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelWithChoicesLayout.setVerticalGroup(
            PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWithChoicesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWithChoicesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(ComboBoxChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanelWithChoicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(MULTIADD)))
        );

        SINGLEBTN.setText("TEXT");
        SINGLEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINGLEBTNActionPerformed(evt);
            }
        });

        SINGLEADD.setText("ADD");
        SINGLEADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINGLEADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANELTEXTLayout = new javax.swing.GroupLayout(PANELTEXT);
        PANELTEXT.setLayout(PANELTEXTLayout);
        PANELTEXTLayout.setHorizontalGroup(
            PANELTEXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELTEXTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextFieldAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PANELTEXTLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(SINGLEADD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELTEXTLayout.setVerticalGroup(
            PANELTEXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELTEXTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFieldAnswerText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SINGLEADD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(MULTIBTN)
                            .addComponent(SINGLEBTN)
                            .addComponent(PANELTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(PanelWithChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MULTIBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SINGLEBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PANELTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelWithChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        DONEBTN.setText("DONE");
        DONEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DONEBTN)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DONEBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MULTIADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIADDActionPerformed
        try {
            String QTN = TEXTAREAQTN.getText();
            String a=TextFieldA.getText();
            String b=TextFieldB.getText();
            String c=TextFieldC.getText();
            String d=TextFieldD.getText();
            String correctAnsw=ComboBoxChoices.getSelectedItem().toString();
            int QuizTitleID = getIDQuizTitle(title);
             Connection con = connect();
            PreparedStatement pst = con.prepareStatement("INSERT INTO Questions(TA_ID,QT_ID,QE_Questions,QE_Condition) VALUES(?,?,?,?)");
             pst.setInt(1, getUserID(user));
            pst.setInt(2, QuizTitleID);
            pst.setString(3, QTN);
            pst.setString(4, "MULTIPLE");
            pst.execute();
            pst.close();

            pst = con.prepareStatement("INSERT INTO AnswersSingle(QE_ID,QT_ID,AN_A,AN_B,AN_C,AN_D,AN_CorrectAns) VALUES(?,?,?,?,?,?,?)");
            pst.setInt(1, getIDQuestions(QuizTitleID));
            pst.setInt(2, QuizTitleID);
            pst.setString(3, a);
            pst.setString(4, b);
            pst.setString(5, c);
            pst.setString(6, d);
            pst.setString(7, correctAnsw);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Successfully added");
            setToEmpty();
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
    }//GEN-LAST:event_MULTIADDActionPerformed

    private void MULTIBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIBTNActionPerformed
        PanelWithChoices.setVisible(true);
        PANELTEXT.setVisible(false);
    }//GEN-LAST:event_MULTIBTNActionPerformed

    private void SINGLEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINGLEBTNActionPerformed
        PanelWithChoices.setVisible(false);
        PANELTEXT.setVisible(true);
    }//GEN-LAST:event_SINGLEBTNActionPerformed
public void setToEmpty(){
      TEXTAREAQTN.setText("");
      TextFieldAnswerText.setText("");
      TextFieldA.setText("");
      TextFieldB.setText("");
      TextFieldC.setText("");
      TextFieldD.setText("");
}
public int getUserID(String user) throws SQLException{
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT TA_ID FROM Teacher_Account WHERE TA_Username = ? ");
            pst.setString(1, user);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    private void SINGLEADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINGLEADDActionPerformed
        try {
            String QTN = TEXTAREAQTN.getText();
            String answer = TextFieldAnswerText.getText();
            int QuizTitleID = getIDQuizTitle(title);
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("INSERT INTO Questions(TA_ID,QT_ID,QE_Questions,QE_Condition) VALUES(?,?,?,?)");
            pst.setInt(1, getUserID(user));
            pst.setInt(2, QuizTitleID);
            pst.setString(3, QTN);
            pst.setString(4, "1");
            pst.execute();
            pst.close();

            pst = con.prepareStatement("INSERT INTO AnswersSingle(QE_ID,QT_ID,AN_Answers) VALUES(?,?,?)");
            pst.setInt(1, getIDQuestions(QuizTitleID));
            pst.setInt(2, QuizTitleID);
            pst.setString(3, answer);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Successfully added");
          setToEmpty();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SINGLEADDActionPerformed

    private void DONEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEBTNActionPerformed
        try {
            AddExam exam = new AddExam(user, title);
            exam.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DONEBTNActionPerformed
    public int getIDQuizTitle(String title) throws SQLException {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT QT_ID FROM QuizesTitle WHERE QT_Title = ? ");
            pst.setString(1, title);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getIDQuestions(int id) throws SQLException {
        try {
            Connection con = connect();
            PreparedStatement pst = con.prepareStatement("SELECT QE_ID FROM Questions WHERE QT_ID = ? ");
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                return res.getInt(1);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

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
            java.util.logging.Logger.getLogger(CreateQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateQuestionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxChoices;
    private javax.swing.JButton DONEBTN;
    private javax.swing.JButton MULTIADD;
    private javax.swing.JButton MULTIBTN;
    private javax.swing.JPanel PANELTEXT;
    private javax.swing.JPanel PanelWithChoices;
    private javax.swing.JButton SINGLEADD;
    private javax.swing.JButton SINGLEBTN;
    private javax.swing.JTextArea TEXTAREAQTN;
    private javax.swing.JTextField TextFieldA;
    private javax.swing.JTextField TextFieldAnswerText;
    private javax.swing.JTextField TextFieldB;
    private javax.swing.JTextField TextFieldC;
    private javax.swing.JTextField TextFieldD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
