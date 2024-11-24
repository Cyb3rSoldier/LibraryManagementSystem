
package librarymanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static librarymanagementsystem.studentInfo.jTable1;


public class bookInfo extends javax.swing.JFrame {

    
    public bookInfo() {
        initComponents();
         //FULL Screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("  Book Info  ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 40, 230, 52);

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
        jButton7.setBounds(1150, 640, 110, 33);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Title", "Author", "Genre", "No. of Books"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(600, 160, 660, 402);

        jLabel3.setText("Book ID: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(74, 175, 110, 16);

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2);
        txt2.setBounds(202, 172, 339, 22);

        jLabel4.setText("Book Title: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(74, 247, 110, 16);
        getContentPane().add(txt3);
        txt3.setBounds(202, 244, 339, 22);

        jLabel5.setText("Author: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(74, 337, 100, 16);
        getContentPane().add(txt5);
        txt5.setBounds(202, 501, 339, 22);

        jLabel6.setText("Genre:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(74, 418, 100, 16);

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fantasy", "Science Fiction", "Mystery", "Romance", "Historical Fiction", "Adventure" }));
        getContentPane().add(combo1);
        combo1.setBounds(202, 415, 339, 22);

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton8.setText("Save");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(62, 563, 145, 23);

        jLabel7.setText("No. of Books:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(74, 504, 100, 16);
        getContentPane().add(txt4);
        txt4.setBounds(202, 334, 339, 22);

        ClearButton.setBackground(new java.awt.Color(204, 204, 255));
        ClearButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(349, 563, 145, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omar\\OneDrive\\Pictures\\Icon\\main2.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-350, -40, 2000, 1190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        home h= new home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        
    }//GEN-LAST:event_txt2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(txt2.getText().equals("") || txt3.getText().equals("")|| txt4.getText().equals("")|| txt5.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Incomplete INFO!","Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
               String data[]= {txt2.getText(), txt3.getText(), txt4.getText(), (String)combo1.getSelectedItem(),txt5.getText()};
            DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Book Added Successfully!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        txt5.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bookInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
