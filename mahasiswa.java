/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsabila__model;

/**
 *
 * @author Vava
 */
public class mahasiswa {
    private String nobp;
    private String nama;
    private String alamat;
    private String jeniskelamin;
    private String tgllahir;
    
    public mahasiswa(){
        
    }

    public mahasiswa(String nobp, String nama, String alamat, String jeniskelamin, String tgllahir) {
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        this.jeniskelamin = jeniskelamin;
        this.tgllahir = tgllahir;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }
    
}
