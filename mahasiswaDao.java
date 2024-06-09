/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsabila__model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Vava
 */
public class mahasiswaDao {
    private List<mahasiswa> data = new ArrayList<>();

    public mahasiswaDao() {
        data.add(new mahasiswa("98312100","Ali","padang","l","01-09-1980"));
        data.add(new mahasiswa("98312101","Ani","jakarta","p","10-07-1990"));
        data.add(new mahasiswa("98312102","budi","padang panjang","l","20-01-1990"));
        
    }
    public void insert(mahasiswa m){
        data.add(m);
    }
    public void update(int index,mahasiswa m){
        data.set(index,m);
    }
    public void delete(int index){
        data.remove(index);
    }
    public mahasiswa getmahasiswa(int index){
     return data.get(index);   
    }
    
    public List<mahasiswa> getAll(){
        return data;
    }
    
}
