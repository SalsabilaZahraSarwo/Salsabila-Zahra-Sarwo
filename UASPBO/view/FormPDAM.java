/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UASPBO.view;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import UASPBO.controller.PDAMControllerDb;

/**
 *
 * @author salsabila
 */
public class FormPDAM extends javax.swing.JFrame 
{
    PDAMControllerDb controller;

    public FormPDAM() 
    {
        initComponents();
        controller = new PDAMControllerDb(this);
        controller.cancel();
        controller.viewData();
    }

    public JComboBox<String> getCboJenisPelanggan() {
        return cboJenisPelanggan;
    }

    public JTable getTabelPDAM() {
        return tabelPDAM;
    }

    public JTextField getTxtBiayaPerMeter() {
        return txtBiayaPerMeter;
    }

    public JTextField getTxtKodePembayaran() {
        return txtKodePembayaran;
    }

    public JTextField getTxtMeterBulanIni() {
        return txtMeterBulanIni;
    }

    public JTextField getTxtMeterBulanLalu() {
        return txtMeterBulanLalu;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTanggal() {
        return txtTanggal;
    }

    public JTextField getTxtTotalBayar() {
        return txtTotalBayar;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKodePembayaran = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        cboJenisPelanggan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMeterBulanIni = new javax.swing.JTextField();
        txtBiayaPerMeter = new javax.swing.JTextField();
        txtMeterBulanLalu = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPDAM = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KodePembayaran");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Jenis Pelanggan");

        jLabel4.setText("Tanggal");

        txtKodePembayaran.setText("jTextField1");

        txtNama.setText("jTextField2");

        txtTanggal.setText("jTextField3");

        cboJenisPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Meter Bulan Ini");

        jLabel6.setText("Meter Bulan Lalu");

        jLabel7.setText("Biaya Per Meter");

        jLabel8.setText("Total Bayar");

        txtMeterBulanIni.setText("jTextField4");

        txtBiayaPerMeter.setText("jTextField6");

        txtMeterBulanLalu.setText("jTextField5");
        txtMeterBulanLalu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMeterBulanLaluActionPerformed(evt);
            }
        });

        txtTotalBayar.setText("jTextField7");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tabelPDAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pembayaran", "Nama", "Jenis Pelanggan", "Tanggal", "Meter Bulan Ini", "Meter Bulan Lalu", "Biaya per Meter", "Total Bayar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPDAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPDAMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPDAM);
        if (tabelPDAM.getColumnModel().getColumnCount() > 0) {
            tabelPDAM.getColumnModel().getColumn(0).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(1).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(2).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(3).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(4).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(5).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(6).setResizable(false);
            tabelPDAM.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtKodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboJenisPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(btnInsert)
                                        .addGap(46, 46, 46)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnCancel)
                                .addGap(49, 49, 49)
                                .addComponent(btnExit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHitung)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBiayaPerMeter, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                        .addComponent(txtMeterBulanLalu, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMeterBulanIni, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTotalBayar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtKodePembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(txtMeterBulanIni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMeterBulanLalu, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboJenisPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBiayaPerMeter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4))
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnCancel)
                            .addComponent(btnDelete)
                            .addComponent(btnExit))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        setSize(new java.awt.Dimension(825, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        Object select = cboJenisPelanggan.getSelectedItem();
        if(select=="Gold")
        {
            int ml = Integer.parseInt(txtMeterBulanLalu.getText());
            int tu = Integer.parseInt(txtMeterBulanIni.getText()) - ml ;
            if(tu<=10)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(5000));
            }
            else if(tu<=20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(10000));
            }
            else if(tu>20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(20000));
            }
            int totalbayar = Integer.parseInt(txtBiayaPerMeter.getText()) * tu ;
            txtTotalBayar.setText(""+totalbayar);
        }
        else if(select=="Silver")
        {
            int ml = Integer.parseInt(txtMeterBulanLalu.getText()); //jam kerja
            int tu = Integer.parseInt(txtMeterBulanIni.getText()) - ml ; //total upah
            if(tu<=10)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(4000));
            }
            else if(tu<=20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(8000));
            }
            else if(tu>20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(10000));
            }
            int totalbayar = Integer.parseInt(txtBiayaPerMeter.getText()) * tu ;
            txtTotalBayar.setText(""+totalbayar);
        }
        else if(select=="Umum")
        {
            int ml = Integer.parseInt(txtMeterBulanLalu.getText());
            int tu = Integer.parseInt(txtMeterBulanIni.getText()) - ml ;
            if(tu<=10)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(2000));
            }
            else if(tu<=20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(3000));
            }
            else if(tu>20)
            {
                
                txtBiayaPerMeter.setText(String.valueOf(5000));
            }
            int totalbayar = Integer.parseInt(txtBiayaPerMeter.getText()) * tu ;
            txtTotalBayar.setText(""+totalbayar);
        }
        
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        controller.insert();
        controller.viewData();
        controller.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.delete();
        controller.viewData();
        controller.cancel();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controller.cancel();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
                    "Apakah ingin Keluar ?",
                    "Keluar",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,null,null);
        if(jawab==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tabelPDAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPDAMMouseClicked
        controller.actionClickTabel();
    }//GEN-LAST:event_tabelPDAMMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.update();
        controller.cancel();
        controller.viewData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtMeterBulanLaluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMeterBulanLaluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMeterBulanLaluActionPerformed

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
            java.util.logging.Logger.getLogger(FormPDAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPDAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPDAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPDAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPDAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJenisPelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPDAM;
    private javax.swing.JTextField txtBiayaPerMeter;
    private javax.swing.JTextField txtKodePembayaran;
    private javax.swing.JTextField txtMeterBulanIni;
    private javax.swing.JTextField txtMeterBulanLalu;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
