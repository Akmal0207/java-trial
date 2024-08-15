package object;

public class Mobil {
    private int noMesin;
    private int tahunProduksi;
    private String brand;
    private String warna;

    public Mobil(int noMesin, int tahunProduksi, String brand, String warna) {
        this.noMesin = noMesin;
        this.tahunProduksi = tahunProduksi;
        this.brand = brand;
        this.warna = warna;
    }

    //Getter dan Setter
    public Integer getNoMesin() { return noMesin; }
    public void setNoMesin(int noMesin) { this.noMesin = noMesin; }

    public int getTahunProduksi() { return tahunProduksi; }
    public void setTahunProduksi(int tahunProduksi) { this.tahunProduksi = tahunProduksi; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }


    public String toString() {
        return "Mobil{" +
                "nomorMesin='" + noMesin + '\'' +
                ", tahunProduksi=" + tahunProduksi +
                ", brand='" + brand + '\'' +
                ", warna='" + warna + '\'' +
                '}';
    }
}
