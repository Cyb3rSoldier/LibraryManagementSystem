package librarymanagementsystem;

import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static librarymanagementsystem.studentInfo.jTable1;


public class management extends javax.swing.JFrame {

   
    public management() {
        initComponents();
         //FULL Screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        issueButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("  Circulation and Transaction Management  ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 40, 850, 52);

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton7.setText("Back");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1210, 610, 90, 28);

        issueButton.setBackground(new java.awt.Color(204, 204, 255));
        issueButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        issueButton.setText("Issue Book");
        issueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        issueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(issueButton);
        issueButton.setBounds(81, 475, 200, 30);

        returnButton.setBackground(new java.awt.Color(204, 204, 255));
        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        returnButton.setText("Return Book");
        returnButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton);
        returnButton.setBounds(81, 534, 200, 30);

        jLabel2.setText("Student ID: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(31, 161, 110, 16);

        jLabel3.setText("Student Name: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 224, 130, 16);

        jLabel4.setText("Book ID: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(31, 275, 110, 16);

        jLabel5.setText("Book Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(31, 306, 130, 16);

        jLabel6.setText("Return Date: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(31, 408, 130, 16);

        jLabel7.setText("Issue Date: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(31, 372, 140, 16);
        getContentPane().add(txt1);
        txt1.setBounds(199, 158, 243, 22);
        getContentPane().add(txt2);
        txt2.setBounds(199, 221, 243, 22);

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txt3);
        txt3.setBounds(199, 272, 243, 22);
        getContentPane().add(txt4);
        txt4.setBounds(199, 303, 243, 22);
        getContentPane().add(dateChooser1);
        dateChooser1.setBounds(199, 366, 243, 22);
        getContentPane().add(dateChooser2);
        dateChooser2.setBounds(199, 402, 243, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Book ID", "Book Name", "Issue Date", "Return Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 150, 800, 400);

        clearButton.setBackground(new java.awt.Color(204, 204, 255));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(80, 590, 200, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omar\\OneDrive\\Pictures\\Icon\\main2.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-10, 0, 1380, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        home h= new home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void issueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueButtonActionPerformed
       if( txt1.getText().equals("") || txt2.getText().equals("") || txt3.getText().equals("") || txt4.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Incomplete INFO!","Warning", JOptionPane.ERROR_MESSAGE);
        }
       else{
            SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
            String issuDate= dFormat.format(dateChooser1.getDate());
            String dueDate= dFormat.format(dateChooser2.getDate());
            String data[]={ txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), issuDate,  dueDate};
            DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Information Added Successfully!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_issueButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1){
            tblModel.removeRow(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null,"Book Returned Successfully!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null,"Please select a row to Return!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to Return!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        dateChooser1.setDate(null);
        dateChooser2.setDate(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new management().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JButton issueButton;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
