
package librarymanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentInfo extends javax.swing.JFrame {

   
    public studentInfo() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbDpt = new javax.swing.JComboBox<>();
        txtBatch = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("  Student Info");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 20, 270, 52);

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
        jButton7.setBounds(1180, 610, 90, 28);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Department", "Batch", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 120, 793, 453);

        jLabel2.setText("Student ID: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 125, 100, 16);

        jLabel3.setText("Name: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 210, 100, 16);

        jLabel4.setText("Department:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 291, 110, 16);

        jLabel5.setText("Batch: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 350, 90, 16);

        jLabel6.setText("Contact Number: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 421, 110, 16);

        SaveButton.setBackground(new java.awt.Color(204, 204, 255));
        SaveButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton);
        SaveButton.setBounds(40, 510, 109, 28);
        getContentPane().add(txtID);
        txtID.setBounds(153, 122, 299, 22);
        getContentPane().add(txtName);
        txtName.setBounds(153, 207, 299, 22);

        cmbDpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "EEE", "CE", "Pharmacy", "BBA", "LLB" }));
        cmbDpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDptActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDpt);
        cmbDpt.setBounds(153, 288, 299, 22);
        getContentPane().add(txtBatch);
        txtBatch.setBounds(153, 347, 299, 22);
        getContentPane().add(txtContact);
        txtContact.setBounds(153, 418, 299, 22);

        removeButton.setBackground(new java.awt.Color(204, 204, 255));
        removeButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        removeButton.setText("Remove");
        removeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton);
        removeButton.setBounds(340, 510, 120, 28);

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
        ClearButton.setBounds(190, 510, 110, 28);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omar\\OneDrive\\Pictures\\Icon\\main2.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-350, -110, 1730, 1280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        home h= new home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
public static void addRowToJTable(Object[] dataRow){
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
            model.addRow(dataRow);
    }
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if( txtID.getText().equals("") || txtName.getText().equals("") || txtBatch.getText().equals("") || txtContact.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Incomplete INFO!","Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String data[]={ txtID.getText(), txtName.getText(),(String)cmbDpt.getSelectedItem(), txtBatch.getText(), txtContact.getText()};
            DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
            tblModel.addRow(data);
            JOptionPane.showMessageDialog(null,"Student Added Successfully!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void cmbDptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDptActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1){
            tblModel.removeRow(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null,"Student Removed Successfully!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jTable1.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(null,"Please select a row to remove!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row to remove!","Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        txtID.setText(null);
        txtName.setText(null);
        txtBatch.setText(null);
        txtContact.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new studentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> cmbDpt;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
