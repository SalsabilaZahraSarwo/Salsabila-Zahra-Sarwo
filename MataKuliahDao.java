/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsabila__model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Vava
 */
public class MataKuliahDao {
    private List<MataKuliah> data = new ArrayList<MataKuliah>();
    
    public MataKuliahDao()
    {
        data.add(new MataKuliah("joni","2013125467","4","Teknik mesin","2A","Alat berat Pengantar","3"));
        data.add(new MataKuliah("piska","2012432104","4","akutansi","2D","Sistem akutansi","5"));
        data.add(new MataKuliah("aulia","2312954392","2","Bahasa Inggris","1C","Vocabulary Building","4"));
    }
    
    public void insert(MataKuliah m)
    {
        data.add(m);
    }
    
    public void update(int index, MataKuliah m)
    {
        data.set(index, m);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public MataKuliah getMataKuliah(int index)
    {
        return data.get(index);
    }

    public List<MataKuliah> getAllMataKuliah() 
    {
        return data;
    }
}
