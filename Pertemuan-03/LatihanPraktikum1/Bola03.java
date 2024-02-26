import java.util.Scanner;
public class Bola03 extends BangunRuang {
    public static Scanner sc = new Scanner(System.in);
    public double jari;

    public Bola03(double r) {
        jari = r;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = 4  * Math.PI * jari * jari;
        return luasPermukaan;
    }

    public double hitungVolume() {
        double volumeBola = 4 / 3 * Math.PI * jari * jari * jari;
        return volumeBola;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan jumlah bola : ");
        int k = sc.nextInt();
        Bola03[] bola = new Bola03[k];
        for (int i = 0; i < bola.length; i++) {
            System.out.println("\nBola ke-" + (i + 1));
            System.out.print("Masukkan jari-jari : ");
            double r = sc.nextDouble();
            
            bola[i] = new Bola03(r);
        }
        for (int j = 0; j < bola.length; j++) {
            System.out.println("\nBola ke-" + (j + 1));
            System.out.println("Luas Permukaan: " + bola[j].hitungLuasPermukaan());
            System.out.println("Volume: " + bola[j].hitungVolume());
        }
    }
}
