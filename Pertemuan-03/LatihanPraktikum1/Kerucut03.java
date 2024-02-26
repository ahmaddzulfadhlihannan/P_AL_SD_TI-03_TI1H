import java.util.Scanner;

public class Kerucut03 extends BangunRuang {
    public static Scanner sc = new Scanner(System.in);
    public double jari;
    public double sisiMiring;

    public Kerucut03(double r, double s) {
        jari = r;
        sisiMiring = s;
    }

    public double hitungTinggi() {
        double tinggi = Math.sqrt((sisiMiring * sisiMiring) - (jari * jari));
        return tinggi;
    }

    public double hitungSelimut() {
        double selimut = Math.PI * jari * sisiMiring;
        return selimut;
    }

    public double hitungLuasAlas() {
        double luasAlas = Math.PI * jari * jari;
        return luasAlas;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaanKerucut = hitungSelimut() + hitungLuasAlas();
        return luasPermukaanKerucut;
    }

    public double hitungVolume() {
        double volumeKerucut = (Math.PI * jari * jari * hitungTinggi()) / 3;
        return volumeKerucut;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah kerucut: ");
        int k = sc.nextInt();
        Kerucut03[] kerucut = new Kerucut03[k];
        for (int i = 0; i < kerucut.length; i++) {
            System.out.println("\nKerucut ke-" + (i + 1));
            System.out.print("Masukkan jari-jari: ");
            double r = sc.nextDouble();
            double s;
            do {
                System.out.print("Masukkan sisi miring (harus lebih dari jari-jari): ");
                s = sc.nextDouble();
                if (s <= r) {
                    System.out.println("Sisi miring harus lebih besar dari jari-jari.");
                }
            } while (s <= r); 
            kerucut[i] = new Kerucut03(r, s);
        }
        for (int j = 0; j < kerucut.length; j++) {
            System.out.println("\nKerucut ke-" + (j + 1));
            System.out.println("Luas Permukaan: " + kerucut[j].hitungLuasPermukaan());
            System.out.println("Volume: " + kerucut[j].hitungVolume());
        }
    }
}
