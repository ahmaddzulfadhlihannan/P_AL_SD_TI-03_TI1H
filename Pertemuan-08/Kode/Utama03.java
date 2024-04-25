import java.util.Scanner;

public class Utama03 {
    public static void main(String[] args) {
        Gudang03 gudang = new Gudang03(7);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    //scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner1.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner1.nextLine();
                    Barang03 barangBaru = new Barang03(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");

            }
        }

        
    }
}
