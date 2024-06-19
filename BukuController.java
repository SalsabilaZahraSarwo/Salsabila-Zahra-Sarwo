/*
 
 */
package salsa_14062024.controller;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import salsa_14062024.model.Buku;
import salsa_14062024.model.BukuDao;
import salsa_14062024.view.FormBuku;


/**
 *
 * @author Salsa
 */
public class BukuController {
    FormBuku formBuku;
    Buku buku;
    BukuDao bukuDao;
    int index;
    
    public BukuController (FormBuku formBuku)
    {
        this.formBuku = formBuku;
        bukuDao = new BukuDao();
    }
    
    public void cancel()
    {
        formBuku.getTxtKdBuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahun().setText("");
    }
    
    public void insert()
    {
        buku = new Buku ();
        buku.setKodeBuku(formBuku.getTxtKdBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        bukuDao.insert(buku);
        JOptionPane.showMessageDialog(formBuku, "Entry Data Ok");
    }
    
   
    public void getBuku(){
        int index = formBuku.getTableBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            formBuku.getTxtKdBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtTahun().setText(buku.getTahun());
        }
    }
    
    public void viewData()
    {
        DefaultTableModel model = (DefaultTableModel)formBuku.getTableBuku().getModel();
        model.setNumRows(0);
        List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku :list)
        {
            Object[] data = 
            {
                buku.getKodeBuku(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getTahun()
            };
            model.addRow(data);
        }
    }
    
       
    public void update()
    {
        buku.setKodeBuku(formBuku.getTxtKdBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahun(formBuku.getTxtTahun().getText());
        JOptionPane.showMessageDialog(formBuku, "Update Data OK");
    }
    
    public void delete()
        {
            bukuDao.delete(index);
            JOptionPane.showMessageDialog(formBuku, "Delete Data Ok");
        }
}
