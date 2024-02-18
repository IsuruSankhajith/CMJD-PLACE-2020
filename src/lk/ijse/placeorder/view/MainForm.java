/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.placeorder.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.placeorder.controller.CustomerController;
import lk.ijse.placeorder.controller.ItemController;
import lk.ijse.placeorder.controller.OrderController;
import lk.ijse.placeorder.modal.Customer;
import lk.ijse.placeorder.modal.Item;

/**
 *
 * @author hasi
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        try {
            initComponents();
            loadAllCustomerId();
            loadAllItemCode();
            setOrderId();
            loadDateAndTime();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCustomerId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtQTYOnHand = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblcost = new javax.swing.JLabel();
        txttttl = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IJSE-ThogaKade ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        txtOrderId.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtOrderId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOrderId.setEnabled(false);
        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("Customer Id :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        txtDate.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDate.setEnabled(false);
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 190, -1));

        txtTime.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTime.setEnabled(false);
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 190, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setText("Time :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        cmbCustomerId.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        cmbCustomerId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerIdItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setText("Order Id :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtName.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 190, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setText("Name :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        txtAddress.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 190, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setText("Address :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setText("Salary :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtSalary.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtSalary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 190, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 940, 10));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setText("Item Code :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtItemCode.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtItemCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtItemCodeItemStateChanged(evt);
            }
        });
        txtItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, -1));

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel10.setText("QTY On Hand :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtQTYOnHand.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtQTYOnHand.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtQTYOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));

        txtDescription.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtDescription.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 190, -1));

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel11.setText("Descr :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        txtUnitPrice.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtUnitPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 190, -1));

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setText("Unit Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        lblcost.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lblcost.setText("Total : 2500/=");
        getContentPane().add(lblcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        txttttl.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txttttl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txttttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 190, -1));

        txtQTY.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        txtQTY.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });
        txtQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQTYKeyReleased(evt);
            }
        });
        getContentPane().add(txtQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 190, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 940, 10));

        jButton1.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jButton1.setText("Place Order");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 140, 40));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "QTY", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(2).setResizable(false);
            tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 900, 190));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel14.setText("QTY");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N
        jButton2.setText("Add To Cart");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbCustomerIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerIdItemStateChanged

        try {
            Customer c1 = new CustomerController().getCustomer(cmbCustomerId.getSelectedItem().toString());

            if (c1 != null) {
                txtAddress.setText(c1.getAddress());
                txtSalary.setText(c1.getSalary() + "");
                txtName.setText(c1.getName());
            } else {
                JOptionPane.showMessageDialog(this, "try Again");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbCustomerIdItemStateChanged

    private void txtItemCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtItemCodeItemStateChanged
        try {

            Item i1 = new ItemController().getItem(txtItemCode.getSelectedItem().toString());

            if (i1 != null) {
                txtDescription.setText(i1.getDescription());
                txtUnitPrice.setText(i1.getUnitPrice() + "");
                txtQTYOnHand.setText(i1.getQtyOnHand() + "");
            } else {
                JOptionPane.showMessageDialog(this, "try Again");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtItemCodeItemStateChanged

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void txtQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQTYKeyReleased

        Integer tempqty = Integer.parseInt(txtQTY.getText());

        txttttl.setText((tempqty * Double.parseDouble(txtUnitPrice.getText())) + "");


    }//GEN-LAST:event_txtQTYKeyReleased

    private int isAlreadyExists(String code) {
        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();
        for (int i = 0; i < modal.getRowCount(); i++) {
            String temp = modal.getValueAt(i, 0).toString();
            if (temp.equalsIgnoreCase(code)) {
                return i;
            }

        }
        return -1;
    }
    
    
    private void calculateTotal(){
         DefaultTableModel modal = (DefaultTableModel) tbl.getModel();
         
         double tempttl=0;
         
         for (int i = 0; i < modal.getRowCount(); i++) {
            tempttl+=(Double)modal.getValueAt(i, 4);
        }
         
         lblcost.setText("Total : "+tempttl+"/=");
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel modal = (DefaultTableModel) tbl.getModel();

        int qty = Integer.parseInt(txtQTY.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        double total = qty * unitPrice;

        int rowIndex = isAlreadyExists(txtItemCode.getSelectedItem().toString());

        if (rowIndex == -1) {
            Object[] rowData = {
                txtItemCode.getSelectedItem().toString(),
                txtDescription.getText(),
                qty,
                unitPrice,
                total
            };
            modal.addRow(rowData);
        }else{
            qty+=(int)modal.getValueAt(rowIndex, 2);
            total=qty*unitPrice;
            tbl.setValueAt(qty, rowIndex, 2);
            tbl.setValueAt(total, rowIndex, 4);
        }

        calculateTotal();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCustomerId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblcost;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JComboBox<String> txtItemCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtQTYOnHand;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txttttl;
    // End of variables declaration//GEN-END:variables

    private void loadAllCustomerId() throws ClassNotFoundException, SQLException {
        for (String temp : new CustomerController().getAllCustomerIds()) {
            cmbCustomerId.addItem(temp);
        }
    }

    private void loadAllItemCode() throws ClassNotFoundException, SQLException {
        for (String temp : new ItemController().getAllItemCodes()) {
            txtItemCode.addItem(temp);
        }
    }

    private void setOrderId() throws ClassNotFoundException, SQLException {
        String orderId = new OrderController().getOrderId();

        if (orderId != null) {
            String[] temparr = orderId.split("D");
            int tempNumber = Integer.parseInt(temparr[1]);
            tempNumber += 1;

            if (tempNumber < 10) {
                txtOrderId.setText("D00" + tempNumber);
            } else if (tempNumber < 100) {
                txtOrderId.setText("D0" + tempNumber);
            } else {
                txtOrderId.setText("D" + tempNumber);
            }

        } else {
            txtOrderId.setText("D001");
        }

    }

    private void loadDateAndTime() {
        Date d1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("YYYY-MM-dd");
        txtDate.setText(format1.format(d1));

        SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
        txtTime.setText(format2.format(d1));

    }
}
