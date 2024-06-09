/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsabila_controller;


import salsabila__model.mahasiswa;
import salsabila__model.mahasiswaDao;
import salsabila_view.formmahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vava
 */
public class mahasiswacontroller 
{
    formmahasiswa formmahasiswa;
    mahasiswa mahasiswa;
    mahasiswaDao mahasiswaDao;
    int index;
    
    public mahasiswacontroller(formmahasiswa formmahasiswa)
    {
        this.formmahasiswa = formmahasiswa;
        mahasiswaDao = new mahasiswaDao();
    }
    
    public void cancel(){
        formmahasiswa.getTxtnobp().setText("");
        formmahasiswa.getTxtnama().setText("");
        formmahasiswa.getTxtalamat().setText("");
        formmahasiswa.getTxttanggallahir().setText("");
        isijeniskelamin();
    }
    public void isijeniskelamin(){
        formmahasiswa.getCbojeniskelamin().removeAllItems();
        formmahasiswa.getCbojeniskelamin().addItem("L");
        formmahasiswa.getCbojeniskelamin().addItem("P");
    }
    public void insert(){
        mahasiswa = new mahasiswa();
        mahasiswa.setNobp(formmahasiswa.getTxtnobp().getText());
        mahasiswa.setNama(formmahasiswa.getTxtnama().getText());
        mahasiswa.setAlamat(formmahasiswa.getTxtalamat().getText());
        mahasiswa.setJeniskelamin(formmahasiswa.getCbojeniskelamin().getSelectedItem().toString());
        mahasiswa.setTgllahir(formmahasiswa.getTxttanggallahir().getText());
        mahasiswaDao.insert(mahasiswa);
        JOptionPane.showMessageDialog(formmahasiswa, "Entri Data Ok");
    }
    
    public void getmahasiswa(){
        int index = formmahasiswa.getTablemahasiswa().getSelectedRow();
        mahasiswa = mahasiswaDao.getmahasiswa(index);
        if(mahasiswa != null){
            formmahasiswa.getTxtnobp().setText(mahasiswa.getNobp());
            formmahasiswa.getTxtnama().setText(mahasiswa.getNama());
            formmahasiswa.getTxtalamat().setText(mahasiswa.getAlamat());
            formmahasiswa.getCbojeniskelamin().setSelectedItem(mahasiswa.getJeniskelamin());
            formmahasiswa.getTxttanggallahir().setText(mahasiswa.getTgllahir());
        }else{
            JOptionPane.showMessageDialog(formmahasiswa,"Mahasiswa tidak ada");
        }
    }
    public void viewData(){
        DefaultTableModel model = (DefaultTableModel)formmahasiswa.getTablemahasiswa().getModel();
        model.setNumRows(0);
        List<mahasiswa> List = mahasiswaDao.getAll();
        for(mahasiswa mahasiswa : List){
            Object[] data = {
                mahasiswa.getNobp(),
                mahasiswa.getNama(),
                mahasiswa.getAlamat(),
                mahasiswa.getJeniskelamin(),
                mahasiswa.getTgllahir()
             
            };
            model.addRow(data);
            
        }
    }
     public void update(){
        mahasiswa = new mahasiswa();
        mahasiswa.setNobp(formmahasiswa.getTxtnobp().getText());
        mahasiswa.setNama(formmahasiswa.getTxtnama().getText());
        mahasiswa.setAlamat(formmahasiswa.getTxtalamat().getText());
        mahasiswa.setJeniskelamin(formmahasiswa.getCbojeniskelamin().getSelectedItem().toString());
        mahasiswa.setTgllahir(formmahasiswa.getTxttanggallahir().getText());
        mahasiswaDao.update(index,mahasiswa);
        JOptionPane.showMessageDialog(formmahasiswa, "update Data Ok");
    }
      public void delete(){
        mahasiswaDao.delete(index);
        JOptionPane.showMessageDialog(formmahasiswa, "Delete Data Ok");
    }

}

