package com.Pemlan;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampildata();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(in.nextLine(), in.nextLine(), in.nextDouble()));
        in.nextLine();
        DataMerchant.tampildata();
        System.out.println();
        System.out.print("Apakah anda ingin mengubah data merchant anda (iya/tidak) ? ");
        String pilihan = in.nextLine();
        if (pilihan.equalsIgnoreCase("iya")){
            DataMerchant.updateMerchant();
        }

        System.out.println();
        System.out.print("Masukkan nama Merchant yang ingin anda lihat : ");
        DataMerchant.cariMerchant(in.nextLine());
    }
}
