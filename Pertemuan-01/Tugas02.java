import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Hitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    kecepatan(scanner);
                    break;
                case 2:
                    jarak(scanner);
                    break;
                case 3:
                    waktu(scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
            System.out.println();
        }
    }
    public static void kecepatan(Scanner scanner) {
        System.out.print("Nilai jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Nilai waktu (t): ");
        double t = scanner.nextDouble();
        double v = s / t;
        System.out.println("Kecepatan (v) = " + v);
    }
    public static void jarak(Scanner scanner) {
        System.out.print("Nilai kecepatan (v): ");
        double v = scanner.nextDouble();
        System.out.print("Nilai waktu (t): ");
        double t = scanner.nextDouble();
        double s = v * t;
        System.out.println("Jarak (s) = " + s);
    }
    public static void waktu(Scanner scanner) {
        System.out.print("Nilai jarak (s): ");
        double s = scanner.nextDouble();
        System.out.print("Nilai kecepatan (v): ");
        double v = scanner.nextDouble();
        double t = s / v;
        System.out.println("Waktu (t) = " + t);
    }
}
