import java.util.Scanner;
public class LimasSegiEmpatSamaSisi03 extends BangunRuang {
    public static Scanner sc = new Scanner(System.in);
    public double sisi;
    public double tinggi;

    public LimasSegiEmpatSamaSisi03(double s, double t) {
        sisi = s;
        tinggi = t;
    } 

    public double LuasAlas() {
        double luasAlas = sisi * sisi;
        return luasAlas;
    }

    public double SisiMiring() {
        double sisiMiring = Math.sqrt(((sisi/2)*(sisi/2) + tinggi * tinggi));
        return sisiMiring;
    }

    public double LuasSisiTegak() {
        double luasSisiTegak = (0.5 * SisiMiring() * sisi) * 4;
        return luasSisiTegak;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaanLimas = LuasAlas() + LuasSisiTegak();
        return luasPermukaanLimas;
    }

    public double hitungVolume() {
        double volumeLimas = (LuasAlas() * tinggi) / 3;
        return volumeLimas;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan jumlah bola : ");
        int k = sc.nextInt();
        LimasSegiEmpatSamaSisi03[] limas = new LimasSegiEmpatSamaSisi03[k];
        for (int i = 0; i < limas.length; i++) {
            System.out.println("\nLimas ke-" + (i + 1));
            System.out.print("Masukkan sisi : ");
            double s = sc.nextDouble();
            System.out.print("Masukkan tinggi : ");
            double t = sc.nextDouble();
            
            limas[i] = new LimasSegiEmpatSamaSisi03(s, t);
        }
        for (int j = 0; j < limas.length; j++) {
            System.out.println("\nKerucut ke-" + (j + 1));
            System.out.println("Tinggi : " + limas[j].SisiMiring());
            System.out.println("Luas Permukaan: " + limas[j].hitungLuasPermukaan());
            System.out.println("Volume: " + limas[j].hitungVolume());
        }
    }
}