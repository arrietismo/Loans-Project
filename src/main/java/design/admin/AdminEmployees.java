/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.admin;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

import logic.company_members.Employee;
import logic.company_members.employee_crud.CreateEmployee;
import logic.company_members.employee_crud.ReadEmployee;
import logic.exceptions.EmployeeAlreadyExistsException;
import java.lang.NumberFormatException;
import java.lang.String;
import javax.swing.table.DefaultTableModel;
import logic.company_members.employee_crud.UpdateEmployee;

/**
 *
 * @author Administrador
 */
public class AdminEmployees extends javax.swing.JFrame {
    
    private static int passwordId;
    private static String[] allPasswords;
    
    /**
     * Creates new form AddEmployee
     */
    public AdminEmployees() {
         initComponents();
        
         showEmployees();
        
        tableEmployees.addMouseListener(new MouseAdapter(){

            @Override
             public void mouseClicked(MouseEvent e){
                 
                buttonEdit.setEnabled(true);
                buttonDeselect.setEnabled(true);
                buttonAdd.setEnabled(false);
                insertId.setEnabled(false);
                 
                int i = tableEmployees.getSelectedRow();
                passwordId = i;
                insertId.setText(tableEmployees.getValueAt(i, 0).toString());
                insertName.setText(tableEmployees.getValueAt(i, 1).toString());
                insertTelephone.setText(tableEmployees.getValueAt(i, 2).toString());
                insertCellphone.setText(tableEmployees.getValueAt(i, 3).toString());              
                insertAddress.setText(tableEmployees.getValueAt(i, 4).toString());
                insertBaseSalary.setText(tableEmployees.getValueAt(i, 5).toString());
                
                
            }  
            });        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.border.MatteBorder matteBorder1 = new javax.swing.border.MatteBorder(null);
        // Variables declaration - do not modify//GEN-BEGIN:variables
        org.edisoncor.gui.util.BrightPassFilter brightPassFilter1 = new org.edisoncor.gui.util.BrightPassFilter();
        org.edisoncor.gui.panel.Panel panel1 = new org.edisoncor.gui.panel.Panel();
        org.edisoncor.gui.panel.PanelCurves panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        org.edisoncor.gui.panel.PanelImage panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel textName = new javax.swing.JLabel();
        insertName = new javax.swing.JTextField();
        javax.swing.JLabel textTelephone = new javax.swing.JLabel();
        insertTelephone = new javax.swing.JTextField();
        javax.swing.JLabel textCellphone = new javax.swing.JLabel();
        insertCellphone = new javax.swing.JTextField();
        javax.swing.JLabel textAddress = new javax.swing.JLabel();
        insertAddress = new javax.swing.JTextField();
        javax.swing.JLabel textBaseSalary = new javax.swing.JLabel();
        insertBaseSalary = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel textId = new javax.swing.JLabel();
        insertId = new javax.swing.JTextField();
        org.edisoncor.gui.panel.PanelImage panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        buttonAdd = new org.edisoncor.gui.button.ButtonAction();
        buttonEdit = new org.edisoncor.gui.button.ButtonAction();
        buttonCheckEarnings = new org.edisoncor.gui.button.ButtonAction();
        org.edisoncor.gui.button.ButtonAction buttonBack = new org.edisoncor.gui.button.ButtonAction();
        buttonDeselect = new org.edisoncor.gui.button.ButtonAction();
        org.edisoncor.gui.label.LabelCustom textManageEmployees = new org.edisoncor.gui.label.LabelCustom();
        org.edisoncor.gui.panel.PanelImage panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployees = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setColorPrimario(new java.awt.Color(153, 153, 255));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));

        panelImage2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "About the Employee"));

        textName.setText("Name:");

        textTelephone.setText("Phone:");

        insertTelephone.addActionListener(this::insertTelephoneActionPerformed);

        textCellphone.setText("Cellphone:");

        textAddress.setText("Address:");

        insertAddress.addActionListener(this::insertAddressActionPerformed);

        textBaseSalary.setText("Base Salary:");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        textId.setText("ID: ");

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textName)
                                    .addComponent(textId))
                                .addGap(26, 26, 26))
                            .addGroup(panelImage2Layout.createSequentialGroup()
                                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addComponent(textBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insertBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textId))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textName)
                            .addComponent(insertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTelephone)
                            .addComponent(insertTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCellphone))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textAddress)
                            .addComponent(insertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertBaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBaseSalary))))
                .addContainerGap())
        );

        panelImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(evt -> buttonAddActionPerformed());

        buttonEdit.setText("Edit");
        buttonEdit.setEnabled(false);
        buttonEdit.addActionListener(evt -> buttonEditActionPerformed());

        buttonCheckEarnings.setText("Check Earnings");
        buttonCheckEarnings.addActionListener(evt -> buttonCheckEarningsActionPerformed());

        buttonBack.setText("Back");
        buttonBack.addActionListener(evt -> buttonBackActionPerformed());

        buttonDeselect.setText("Deselect");
        buttonDeselect.setEnabled(false);
        buttonDeselect.addActionListener(evt -> buttonDeselectActionPerformed());

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCheckEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonDeselect, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCheckEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeselect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textManageEmployees.setBackground(new java.awt.Color(102, 102, 102));
        textManageEmployees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textManageEmployees.setText("Manage Employees");
        textManageEmployees.setColorDeSegundoBorde(new java.awt.Color(0, 0, 0));

        panelImage4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", Font.BOLD, 18))); // NOI18N

        tableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Telephone", "Cellphone", "Address", "Base salary", "Total Salary"
            }
        ) {
            final boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployees.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableEmployees);

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelImage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textManageEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textManageEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelImage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paintItWhite()
    {
        insertId.setText("");
        insertName.setText("");
        insertTelephone.setText("");
        insertCellphone.setText("");
        insertAddress.setText("");
        insertBaseSalary.setText("");
    }
    
    private void showEmployees(){
        
        ArrayList<Employee> allEmployees = ReadEmployee.getAllEmployees();
        
        String[] passwords = new String[allEmployees.size()];
        
        String[][] matrix = new String[allEmployees.size()][7];
        
            for (int i=0; i<allEmployees.size(); i++)
            {
                
                matrix[i][0] = allEmployees.get(i).getId();
                matrix[i][1] = allEmployees.get(i).getName();
                matrix[i][2] = allEmployees.get(i).getHomePhone();
                matrix[i][3] = allEmployees.get(i).getMobilePhone();
                matrix[i][4] = allEmployees.get(i).getAddress();
                matrix[i][5] = String.valueOf(allEmployees.get(i).getBaseSalary());
                matrix[i][6] = String.valueOf(allEmployees.get(i).getCurrentSalary());
                passwords[i] = allEmployees.get(i).getPassword();

            }
            
            allPasswords = passwords;
            
            DefaultTableModel tableModel = new DefaultTableModel(
                    matrix,
                    new String [] { "id", "Name", "Telephone", "Cellphone", "Address", "Base salary", "Total Salary"  }) {

            @Override
            public boolean isCellEditable(int row, int column) {       
            return false; 
            }
        };
            
            tableEmployees.setModel(tableModel);
        
    }
    
    private void insertTelephoneActionPerformed() {//GEN-FIRST:event_insertTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertTelephoneActionPerformed

    private void insertAddressActionPerformed() {//GEN-FIRST:event_insertAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertAddressActionPerformed

    private void buttonBackActionPerformed() {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        AdminInterface AdminInterface1 = new AdminInterface();
        this.setVisible(false);
        AdminInterface1.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed

// --Commented out by Inspection START (16/07/20, 12:31 a. m.):
//    private void TableEmployeesMouseClicked() {//GEN-FIRST:event_TableEmployeesMouseClicked
//        // TODO add your handling code here:
//    }//GEN-LAST:event_TableEmployeesMouseClicked
// --Commented out by Inspection STOP (16/07/20, 12:31 a. m.)

    private void buttonAddActionPerformed() {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        
        String errors = "";
        int cont = 0;
        
        if ("".equals(insertId.getText()) || "".equals(insertName.getText()) || "".equals(insertTelephone.getText()) || "".equals(insertCellphone.getText()) || "".equals(insertAddress.getText()) || "".equals(insertBaseSalary.getText()))
        {
            errors += "- You must fill all the fields! \n";
            cont++;
        }
        
        try {
            Integer.parseInt(insertId.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for Ids or leave it blank! \n";
            cont++;
        }
        
        try {
            Integer.parseInt(insertTelephone.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for Telephones or leave it blank! \n";
            cont++;
        }
        
        try {
            Integer.parseInt(insertCellphone.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for Cellphones or leave it blank! \n";
            cont++;
        }
        
        try {
            Double.parseDouble(insertBaseSalary.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for a salary or leave it blank! \n";
            cont++;
        }
        
        try {
                  Employee newEmp = new Employee(insertId.getText(), "1234", insertName.getText(), insertTelephone.getText(), insertCellphone.getText(), insertAddress.getText(), Double.parseDouble(insertBaseSalary.getText()));
                  CreateEmployee.create(newEmp);
        } catch( EmployeeAlreadyExistsException e ) {
             errors += e.getMessage();
             cont++;
        } catch( NumberFormatException e ) {
             cont++;
        }
        
        if (cont == 0)
        {
            this.showEmployees();
            paintItWhite();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, errors, "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonCheckEarningsActionPerformed() {//GEN-FIRST:event_buttonCheckEarningsActionPerformed
        // TODO add your handling code here:
        AdminCheckEarnings AdminCheckEarnings1 = new AdminCheckEarnings();
        this.setVisible(false);
        AdminCheckEarnings1.setVisible(true);
    }//GEN-LAST:event_buttonCheckEarningsActionPerformed

    private void buttonEditActionPerformed() {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        
        String errors = "";
        int cont = 0;
        
        if ("".equals(insertId.getText()) || "".equals(insertName.getText()) || "".equals(insertTelephone.getText()) || "".equals(insertCellphone.getText()) || "".equals(insertAddress.getText()) || "".equals(insertBaseSalary.getText()))
        {
            errors += "- You must fill all the fields! \n";
            cont++;
        }
        
        try {
            Integer.parseInt(insertTelephone.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for telephones or leave it blank! \n";
            cont++;
        }
        
        try {
            Integer.parseInt(insertCellphone.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for cellphones or leave it blank! \n";
            cont++;
        }
        
        try {
            Double.parseDouble(insertBaseSalary.getText());
        } catch (NumberFormatException e) {
            errors += "- You cant use letters for a salary or leave it blank! \n";
            cont++;
        }
        
        if (cont == 0)
        {
            Employee editEmp = new Employee(insertId.getText(), allPasswords[passwordId], insertName.getText(), insertTelephone.getText(), insertCellphone.getText(), insertAddress.getText(), Double.parseDouble(insertBaseSalary.getText()));
            UpdateEmployee.update(editEmp);
            this.showEmployees();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, errors, "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeselectActionPerformed() {//GEN-FIRST:event_buttonDeselectActionPerformed
        // TODO add your handling code here:
        buttonEdit.setEnabled(false);
        buttonCheckEarnings.setEnabled(false);
        buttonAdd.setEnabled(true);
        insertId.setEnabled(true);
        paintItWhite();
    }//GEN-LAST:event_buttonDeselectActionPerformed

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
            java.util.logging.Logger.getLogger(AdminEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> new AdminEmployees().setVisible(true));
    }

    private org.edisoncor.gui.button.ButtonAction buttonAdd;
    private org.edisoncor.gui.button.ButtonAction buttonCheckEarnings;
    private org.edisoncor.gui.button.ButtonAction buttonDeselect;
    private org.edisoncor.gui.button.ButtonAction buttonEdit;
    private javax.swing.JTextField insertAddress;
    private javax.swing.JTextField insertBaseSalary;
    private javax.swing.JTextField insertCellphone;
    private javax.swing.JTextField insertId;
    private javax.swing.JTextField insertName;
    private javax.swing.JTextField insertTelephone;
    private javax.swing.JTable tableEmployees;
    // End of variables declaration//GEN-END:variables
}
