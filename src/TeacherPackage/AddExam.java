/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeacherPackage;

import static connectionPackage.DBconnection.connect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author halla
 */
public class AddExam extends javax.swing.JFrame {
    private String user;
    private String title;
    /**
     * Creates new form Home
     * @throws java.sql.SQLException
     */
    public AddExam() throws SQLException {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        updatetable1(getUserID(user),getQuizID(title));
    }
    /**
     * Creates new form Home
     * @param user
     * @param title
     * @throws java.sql.SQLException
     */
    public AddExam(String user, String title) throws SQLException {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        this.user = user;
        this.title = title;
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
          LabelTitleEXAM.setText(title);
          System.out.println(getQuizID(title));
          updatetable1(getUserID(this.user),getQuizID(this.title));
          jTable1.setDefaultEditor(Object.class, null);
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
    public int getQuizID(String title) throws SQLException{
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
        private void updatetable1(int userID,int QuizTitle) {
        try {
         String sql = "SELECT Questions.TA_ID,Questions.QT_ID,Questions.QE_ID,Questions.QE_Questions,Questions.QE_Condition,AnswersSingle.AN_Answers,AnswersSingle.AN_CorrectAns,"
                 + "AnswersSingle.AN_A,AnswersSingle.AN_B,AnswersSingle.AN_C,AnswersSingle.AN_D \n" +
            "FROM Questions INNER JOIN AnswersSingle \n" +
            "ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = '"+userID+"' AND Questions.QT_ID = '"+QuizTitle+"'";
            Connection conn = connect();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LabelTitleEXAM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ADDBTN = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        DELETEBTN = new javax.swing.JButton();
        BACKBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1965, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(1965, 1080));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 1110, 630);

        LabelTitleEXAM.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LabelTitleEXAM.setText("TITLE OF THE EXAM HERE");
        jPanel1.add(LabelTitleEXAM);
        LabelTitleEXAM.setBounds(440, 40, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cerceas Bulawan\\Documents\\NetBeansProjects\\UpdatedIMProject-master\\src\\BG\\AddExam.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1965, 768);

        ADDBTN.setText("jButton1");
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ADDBTN);
        ADDBTN.setBounds(1150, 380, 190, 80);

        EDITBTN.setText("jButton2");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });
        jPanel1.add(EDITBTN);
        EDITBTN.setBounds(1160, 480, 180, 80);

        DELETEBTN.setText("jButton3");
        DELETEBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEBTNActionPerformed(evt);
            }
        });
        jPanel1.add(DELETEBTN);
        DELETEBTN.setBounds(1150, 580, 190, 70);

        BACKBTN.setText("jButton1");
        BACKBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKBTNActionPerformed(evt);
            }
        });
        jPanel1.add(BACKBTN);
        BACKBTN.setBounds(30, 20, 50, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1965, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed
        CreateQuestionFrame create = new CreateQuestionFrame(user,title);
        create.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADDBTNActionPerformed
  private int Questions_TA_ID,Questions_QT_ID,Questions_QE_ID;
  private String Questions_QE_Questions,Questions_QE_Condition,AnswersSingle_AN_Answers,AnswersSingle_AN_CorrectAns;
  private String AnswersSingle_AN_A,AnswersSingle_AN_B,AnswersSingle_AN_C,AnswersSingle_AN_D;
    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        UpdateQuestionFrame update = new UpdateQuestionFrame(user,title,Questions_TA_ID,Questions_QT_ID,Questions_QE_ID,
        Questions_QE_Questions,Questions_QE_Condition,AnswersSingle_AN_Answers,AnswersSingle_AN_CorrectAns,
        AnswersSingle_AN_A,AnswersSingle_AN_B,AnswersSingle_AN_C,AnswersSingle_AN_D);
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void DELETEBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEBTNActionPerformed

    private void BACKBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKBTNActionPerformed
        try {
            TeacherQuizzes teach = new TeacherQuizzes(user);
            teach.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AddExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BACKBTNActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
      getDisplay();
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        getDisplay();
    }//GEN-LAST:event_jTable1MouseClicked
  public void getDisplay(){
        try{
            Connection conn=connect();
            int row=jTable1.getSelectedRow();
            int click=Integer.valueOf((jTable1.getModel().getValueAt(row, 0)).toString());
            int click2=Integer.valueOf((jTable1.getModel().getValueAt(row, 1)).toString());
            String sql="SELECT Questions.TA_ID,Questions.QT_ID,Questions.QE_ID,Questions.QE_Questions,Questions.QE_Condition,AnswersSingle.AN_Answers,AnswersSingle.AN_CorrectAns,"
                 + "AnswersSingle.AN_A,AnswersSingle.AN_B,AnswersSingle.AN_C,AnswersSingle.AN_D \n" +
            "FROM Questions INNER JOIN AnswersSingle \n" +
            "ON Questions.QE_ID = AnswersSingle.QE_ID WHERE Questions.TA_ID = '"+click+"' AND Questions.QT_ID = '"+click2+"'";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
               Questions_TA_ID=rs.getInt(1);
               Questions_QT_ID=rs.getInt(2);
               Questions_QE_ID=rs.getInt(3);
               Questions_QE_Questions=rs.getString(4);
               Questions_QE_Condition=rs.getString(5);
               AnswersSingle_AN_Answers=rs.getString(6);
               AnswersSingle_AN_CorrectAns=rs.getString(7);
               AnswersSingle_AN_A=rs.getString(8);
                AnswersSingle_AN_B=rs.getString(9);       
               AnswersSingle_AN_C=rs.getString(10);
                AnswersSingle_AN_D=rs.getString(10);    
                System.out.println(Questions_QE_Condition);
            }
        }catch(Exception e){
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddExam().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddExam.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JButton BACKBTN;
    private javax.swing.JButton DELETEBTN;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JLabel LabelTitleEXAM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
