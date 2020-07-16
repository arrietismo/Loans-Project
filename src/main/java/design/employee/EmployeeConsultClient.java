/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.employee;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logic.file_management.client_crud.ReadClient;
import logic.loan_classes.Loan;

/**
 *
 * @author Administrador
 */
public class EmployeeConsultClient extends javax.swing.JFrame {

    protected static int selectedLoanId;
    
    /**
     * Creates new form EmployeeConsultClient
     */
    public EmployeeConsultClient() {
        initComponents();
        showTheClient();
        showLoans();
        
        tableLoans.addMouseListener(new MouseAdapter(){

            @Override
             public void mouseClicked(MouseEvent e){
                int i = tableLoans.getSelectedRow();
                selectedLoanId = Integer.parseInt(tableLoans.getValueAt(i, 0).toString());
                buttonCheckLoan.setEnabled(true);
            }  
            }); 
    }
    
    private void showTheClient(){
        checkId.setText(Integer.toString(EmployeeSelectedClient.getSelectedClient().getId()));
        checkName.setText(EmployeeSelectedClient.getSelectedClient().getName());
        checkPhone.setText(EmployeeSelectedClient.getSelectedClient().getHomePhone());
        checkCellphone.setText(EmployeeSelectedClient.getSelectedClient().getMobilePhone());
        checkAddress.setText(EmployeeSelectedClient.getSelectedClient().getAddress());
    }
    
    private void showLoans(){
        ArrayList<Loan> allLoans = ReadClient.getLoans(EmployeeSelectedClient.getSelectedClient().getId());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        String[][] matrix = new String[allLoans.size()][5];
        
            for (int i=0; i<allLoans.size(); i++)
            {
                matrix[i][0] = String.valueOf(allLoans.get(i).getLoanNumber());
                matrix[i][1] = allLoans.get(i).getClient().getName();
                matrix[i][2] = String.valueOf(allLoans.get(i).getAmount());
                matrix[i][3] = df.format(allLoans.get(i).getDates().getAuthorizationDate());
                matrix[i][4] = df.format(allLoans.get(i).getDates().getDeliveryDate());
            }
            
            DefaultTableModel tableModel = new DefaultTableModel(
                    matrix,
                    new String [] { "# of Loan", "Applicant", "Value", "Date of Authorization", "Delivery date" }) {

            @Override
            public boolean isCellEditable(int row, int column) {       
            return false; 
            }
        };
            
            tableLoans.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.edisoncor.gui.panel.Panel panel1 = new org.edisoncor.gui.panel.Panel();
        org.edisoncor.gui.panel.PanelCurves panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        org.edisoncor.gui.panel.PanelImage panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableLoans = new javax.swing.JTable();
        org.edisoncor.gui.panel.PanelImage panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel textId = new javax.swing.JLabel();
        checkId = new javax.swing.JTextField();
        javax.swing.JLabel textName = new javax.swing.JLabel();
        checkName = new javax.swing.JTextField();
        javax.swing.JLabel textCellphone = new javax.swing.JLabel();
        checkCellphone = new javax.swing.JTextField();
        javax.swing.JLabel textAddress = new javax.swing.JLabel();
        checkAddress = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel textPhone = new javax.swing.JLabel();
        checkPhone = new javax.swing.JTextField();
        org.edisoncor.gui.label.LabelCustom labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        org.edisoncor.gui.panel.PanelImage panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        org.edisoncor.gui.button.ButtonAction buttonBack = new org.edisoncor.gui.button.ButtonAction();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        org.edisoncor.gui.button.ButtonAction buttonAddLoan = new org.edisoncor.gui.button.ButtonAction();
        buttonCheckLoan = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(153, 153, 255));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        panelImage4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Loans", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", Font.BOLD, 18))); // NOI18N

        tableLoans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# of Loan", "Applicant", "Value", "Date of autorization", "Delivery date"
            }
        ) {
            final boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLoans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableLoans.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableLoans);

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelImage2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "About the Client"));

        textId.setText("ID:");

        checkId.setEditable(false);

        textName.setText("Name:");

        checkName.setEditable(false);
        checkName.addActionListener(this::checkNameActionPerformed);

        textCellphone.setText("Cellphone:");

        checkCellphone.setEditable(false);

        textAddress.setText("Address:");

        checkAddress.setEditable(false);
        checkAddress.addActionListener(this::checkAddressActionPerformed);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/client.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textPhone.setText("Phone:");

        checkPhone.setEditable(false);
        checkPhone.addActionListener(this::checkPhoneActionPerformed);

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAddress)
                            .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkCellphone, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(checkAddress)
                            .addComponent(checkPhone)))
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(checkName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(checkId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textId)
                            .addComponent(checkId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textName)
                            .addComponent(checkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPhone)
                            .addComponent(checkPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCellphone)
                            .addComponent(checkCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textAddress)
                            .addComponent(checkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        labelCustom1.setBackground(new java.awt.Color(102, 102, 102));
        labelCustom1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCustom1.setText("Client");
        labelCustom1.setColorDeSegundoBorde(new java.awt.Color(0, 0, 0));

        panelImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonBack.setText("Back");
        buttonBack.addActionListener(evt -> buttonBackActionPerformed());

        buttonAddLoan.setText("Add a loan");
        buttonAddLoan.addActionListener(evt -> buttonAddLoanActionPerformed());

        buttonCheckLoan.setText("Check Loan");
        buttonCheckLoan.setEnabled(false);
        buttonCheckLoan.addActionListener(evt -> buttonCheckLoanActionPerformed());

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(buttonAddLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCheckLoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(buttonAddLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(buttonCheckLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelCurves2Layout = new javax.swing.GroupLayout(panelCurves2);
        panelCurves2.setLayout(panelCurves2Layout);
        panelCurves2Layout.setHorizontalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCustom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCurves2Layout.createSequentialGroup()
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelImage4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCurves2Layout.setVerticalGroup(
            panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCurves2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCurves2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkPhoneActionPerformed() {//GEN-FIRST:event_checkPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPhoneActionPerformed

    private void checkAddressActionPerformed() {//GEN-FIRST:event_checkAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAddressActionPerformed

    private void checkNameActionPerformed() {//GEN-FIRST:event_checkNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNameActionPerformed

    private void buttonBackActionPerformed() {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        EmployeeClients EmployeeClients1 = new EmployeeClients();
        this.setVisible(false);
        EmployeeClients1.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAddLoanActionPerformed() {//GEN-FIRST:event_buttonAddLoanActionPerformed
        // TODO add your handling code here:
        EmployeeAddLoan EmployeeAddLoan1 = new EmployeeAddLoan();
        this.setVisible(false);
        EmployeeAddLoan1.setVisible(true);
    }//GEN-LAST:event_buttonAddLoanActionPerformed

    private void buttonCheckLoanActionPerformed() {//GEN-FIRST:event_buttonCheckLoanActionPerformed
        // TODO add your handling code here:
        EmployeeClientCheckLoan EmployeeClientCheckLoan1 = new EmployeeClientCheckLoan();
        this.setVisible(false);
        EmployeeClientCheckLoan1.setVisible(true);
    }//GEN-LAST:event_buttonCheckLoanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeConsultClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EmployeeConsultClient().setVisible(true));
    }

    private org.edisoncor.gui.button.ButtonAction buttonCheckLoan;
    private javax.swing.JTextField checkAddress;
    private javax.swing.JTextField checkCellphone;
    private javax.swing.JTextField checkId;
    private javax.swing.JTextField checkName;
    private javax.swing.JTextField checkPhone;
    private javax.swing.JTable tableLoans;
    // End of variables declaration//GEN-END:variables
}
