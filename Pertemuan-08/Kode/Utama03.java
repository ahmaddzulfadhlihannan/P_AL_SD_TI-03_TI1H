import java.util.Scanner;

public class Utama03 {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang03 gudang = new Gudang03(kapasitas);
        
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
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
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    int kodeCari = scanner.nextInt();
                    gudang.cariBarang(kodeCari);
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");

            }
        }

        
    }
}

