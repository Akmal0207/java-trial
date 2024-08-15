package management;

import java.util.ArrayList;
import java.util.Scanner;
import object.Mobil;

public class MobilMng {
    private ArrayList<Mobil> mobilList = new ArrayList<>();

    public void addMobil(Mobil mobil) {
        mobilList.add(mobil);
        System.out.println("Mobil berhasil ditambhakan!");
    }

    public void viewMobil() {
        if (mobilList.isEmpty()) {
            System.out.println("Mobil belum tersedia.");
        }else {
            for (Mobil mobil : mobilList) {
                System.out.println(mobil);
            }
        }
    }

    public void updateMobil(String noMesin) {
        for (Mobil mobil : mobilList) {

            if (!mobil.getNoMesin().equals(noMesin)) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan tahun produksi: ");
                int tahunProduksi = scanner.nextInt();
                mobil.setTahunProduksi(tahunProduksi);

                System.out.print("Masukkan nama brand: ");
                String brand = scanner.next();
                mobil.setBrand(brand);

                System.out.print("Masukkan warna: ");
                String warna = scanner.next();
                mobil.setWarna(warna);

                System.out.println("Mobil berhasil diupdate!");
                return;
            }
        }
        System.out.println("Mobil tidak ditemukan.");
    }

    public void deleteMobil(String noMesin) {
        for (Mobil mobil : mobilList) {
            if (!mobil.getNoMesin().equals(noMesin)) {
                mobilList.remove(mobil);
                System.out.println("Mobil berhasil dihapus!");
                return;
            }
        }
        System.out.println("Mobil tidak ditemukan.");
    }
}
