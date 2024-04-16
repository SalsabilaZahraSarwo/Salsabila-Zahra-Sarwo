/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori2;

/**
 *
 * @author user
 */
public class Product {
    //instance field declaration
    private int itemnumber;
    private String name;
    private int stock;
    private double price;
    boolean active=true;
    
    //constructor 1 tanpa parameter
    public Product(){}
    
    //cosntructor 2 inisialisasi nilai pada class product
    public Product (int number, String name, int qty, double price)
    {
        this.itemnumber = number;
        this.name = name;
        this.stock = qty;
        this.price = price;
        
    }
    
    //method getter untuk variabel itemnumber
    public int getitemnumber()
    {
        return itemnumber;
    }
    public void setitemnumber(int number)
    {
        this.itemnumber= number;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name= name;
    }
    public int getstock()
    {
        return stock;
    }
    public void setstock(int qty)
    {
        this.stock= qty;
    }
    public double getprice()
    {
        return price;
    }
     public void setprice(double price)
    {
        this.price= price;
    }
    public boolean getactive(){
        return active;
    }
    public void setActive(boolean active){
        this.active=active;
    }
    //method setter untuk variabel itemnumber
    @Override
    public String toString()
    {
      return "\n\n Kode Produk : "+this.itemnumber+
             "\n Nama Produk : "+this.name+
             "\n Jumlah Produk : "+this.stock+
             "\n Harga Produk : "+this.price+
             "\n Status produk : "+(this.active?"Active":"Discountinued");
    }
}
