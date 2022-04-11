package com.Pemlan;

import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant inputMerchant[] = new Merchant[DataMerchant.merc.length + 1];
        int i = 0;
        while (i < DataMerchant.merc.length) {
            inputMerchant[i] = merc[i];
            i++;
        }
        inputMerchant[DataMerchant.merc.length] = merchant;
        return inputMerchant;
    }

    public static void tampildata() {
        for (Merchant mch1 : merc) {
            System.out.println("====Tampil Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int) mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        int temp = 0;
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            if (DataMerchant.merc[i].getNamaMerchant().equalsIgnoreCase(nama)) {
                temp = i;
                break;
            }
        }
        return tampilMerchant(merc[temp]);
    }

    public static Merchant tampilMerchant(Merchant merchant) {
        System.out.println("====Tampil Data Merchant UBFood====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
        return merchant;
    }

    public static void updateMerchant() {
        Merchant m = new Merchant();
        String namaM;
        String namaP;
        int harga;
        System.out.print("Masukkan nama merchant anda yang baru : ");
        namaM = in.nextLine();
        m.setNamaMerchant(namaM);
        System.out.print("Masukkan nama produk anda yang baru   : ");
        namaP = in.nextLine();
        m.setNamaProduk(namaP);
        System.out.print("Masukkan harga makanan anda yang baru : ");
        harga = in.nextInt();
        in.nextLine();
        m.setHargaMakanan(harga);
        DataMerchant.tampilMerchant(m);
    }
}