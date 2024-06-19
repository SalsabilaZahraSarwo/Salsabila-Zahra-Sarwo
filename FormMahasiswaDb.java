/*
 */
package salsa_14062024.view;



import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import salsa_14062024.controller.MahasiswaControllerDb;

/**
 *
 * @author Salsa
 */
public class FormMahasiswaDb extends javax.swing.JFrame {

    /**
     * Creates new form FormMahasiswa
     */
    private final MahasiswaControllerDb controler;
    public FormMahasiswaDb() {
        initComponents();
        controler = new MahasiswaControllerDb(this);
        controler.cancel();
        controler.viewData();
    }

    public JComboBox<String> getCboJenisKelamin() {
        return cboJenisKelamin;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtNOBP() {
        return txtNobp;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTanggalLahir() {
        return txtTanggalLahir;
    }

    public JTable getTabelMahasiswa() {
        return TabelMahasiswa;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lnobp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lalamat = new javax.swing.JLabel();
        ljekel = new javax.swing.JLabel();
        ltgllahir = new javax.swing.JLabel();
        txtNobp = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cboJenisKelamin = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtTanggalLahir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        getContentPane().setLayout(null);

        Lnobp.setText("NOBP");
        getContentPane().add(Lnobp);
        Lnobp.setBounds(20, 20, 70, 16);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 70, 16);

        Lalamat.setText("Alamat");
        getContentPane().add(Lalamat);
        Lalamat.setBounds(20, 80, 70, 16);

        ljekel.setText("Jenis Kelamin");
        getContentPane().add(ljekel);
        ljekel.setBounds(20, 110, 80, 16);

        ltgllahir.setText("Tanggal Lahir");
        getContentPane().add(ltgllahir);
        ltgllahir.setBounds(20, 140, 80, 16);

        txtNobp.setText("NOBP");
        txtNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNobpActionPerformed(evt);
            }
        });
        getContentPane().add(txtNobp);
        txtNobp.setBounds(120, 20, 320, 22);

        txtNama.setText("Nama");
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 50, 320, 22);

        txtAlamat.setText("ALamat");
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(120, 80, 320, 22);

        cboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboJenisKelaminActionPerformed(evt);
            }
        });
        getContentPane().add(cboJenisKelamin);
        cboJenisKelamin.setBounds(120, 110, 72, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 190, 70, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(110, 190, 70, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(200, 190, 70, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(290, 190, 70, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(380, 190, 60, 23);

        txtTanggalLahir.setText("tglLahir");
        getContentPane().add(txtTanggalLahir);
        txtTanggalLahir.setBounds(120, 140, 320, 22);

        TabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOBP", "Nama", "Alamat", "Jenis Kelamin", "Tgl Lahir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelMahasiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 232, 452, 230);

        setSize(new java.awt.Dimension(490, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNobpActionPerformed

    private void cboJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboJenisKelaminActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        controler.cancel();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        controler.insert();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void TabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMahasiswaMouseClicked
        // TODO add your handling code here:
        controler.actionClickTabel();
    }//GEN-LAST:event_TabelMahasiswaMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controler.update();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controler.delete();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswaDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaDb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswaDb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lalamat;
    private javax.swing.JLabel Lnobp;
    private javax.swing.JTable TabelMahasiswa;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJenisKelamin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ljekel;
    private javax.swing.JLabel ltgllahir;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNobp;
    private javax.swing.JTextField txtTanggalLahir;
    // End of variables declaration//GEN-END:variables

    
}
