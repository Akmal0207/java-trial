package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import object.Mobil;
import management.MobilMng;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        MobilMng mobilMng = new MobilMng();
        int pilih;

        do {
            System.out.println("\nMobil Management System");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Lihat Mobil");
            System.out.println("3. Update Mobil");
            System.out.println("4. Hapus Mobil");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihanmu: ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor mesin: ");
                    int noMesin = scanner.nextInt();

                    System.out.print("Masukkan tahun produksi: ");
                    int tahunProduksi = scanner.nextInt();

                    System.out.print("Masukkan brand: ");
                    String brand = scanner.next();

                    System.out.print("Masukkan warna: ");
                    String warna = scanner.next();

                    Mobil newMobil = new Mobil(noMesin, tahunProduksi, brand, warna);
                    mobilMng.addMobil(newMobil);
                    break;

                case 2:
                    mobilMng.viewMobil();
                    break;

                case 3:
                    System.out.print("Masukkan nomor mesin untuk melakukan proses update:");
                    noMesin = scanner.nextInt();
                    mobilMng.updateMobil(String.valueOf(noMesin));
                    break;

                case 4:
                    System.out.print("Masukkan nomor mesin untuk melakukan proses hapus:");
                    noMesin = scanner.nextInt();
                    mobilMng.deleteMobil(String.valueOf(noMesin));
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");

            }


        } while (pilih != 5);
        scanner.close();

    }
}