package com.Pemlan;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public Merchant(){

    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
}
