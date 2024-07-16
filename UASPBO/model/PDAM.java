/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASPBO.model;

/**
 *
 * @author salsabila 
 */
public class PDAM 
{
    private String kodePembayaran;
    private String nama;
    private String jenisPelanggan;
    private String tanggal;
    private String meterBulanIni;
    private String meterBulanLalu;
    private String biayaPerMeter;
    private String totalBayar;

    public PDAM() 
    {
    }

    public PDAM(String kodePembayaran, String nama, String jenisPelanggan, String tanggal, String meterBulanIni, String meterBulanLalu, String biayaPerMeter, String totalBayar) {
        this.kodePembayaran = kodePembayaran;
        this.nama = nama;
        this.jenisPelanggan = jenisPelanggan;
        this.tanggal = tanggal;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        this.biayaPerMeter = biayaPerMeter;
        this.totalBayar = totalBayar;
    }

    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMeterBulanIni() {
        return meterBulanIni;
    }

    public void setMeterBulanIni(String meterBulanIni) {
        this.meterBulanIni = meterBulanIni;
    }

    public String getMeterBulanLalu() {
        return meterBulanLalu;
    }

    public void setMeterBulanLalu(String meterBulanLalu) {
        this.meterBulanLalu = meterBulanLalu;
    }

    public String getBiayaPerMeter() {
        return biayaPerMeter;
    }

    public void setBiayaPerMeter(String biayaPerMeter) {
        this.biayaPerMeter = biayaPerMeter;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    
    
    
    
    
}
