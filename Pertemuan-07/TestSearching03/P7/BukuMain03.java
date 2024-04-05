import java.util.Scanner;

public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku03 data = new PencarianBuku03();
        int jumBuku = 5;
        String kb[] = { "20214", "20211", "20213", "20215", "20212" };
        String jd[] = { "Web Programming", "Algoritma", "Desain UI", "Algoritma", "Big Data" };
        int tb[] = { 2022, 2019, 2021, 2023, 2020 };
        String pg[] = { "Pustaka Adi", "Wahyuni", "Supriadi", "Darmawan Adi", "Susilo" };
        int sk[] = { 2, 5, 3, 2, 3 };

        System.out.println("---------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari Kode Buku Terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            String kodeBuku = kb[i];
            System.out.println("Kode buku \t: " + kodeBuku);
            String judulBuku = jd[i];
            System.out.println("Judul buku \t: " + judulBuku);
            int tahunTerbit = tb[i];
            System.out.println("Tahun terbit \t: " + tahunTerbit);
            String pengarang = pg[i];
            System.out.println("Pengarang \t: " + pengarang);
            int stock = sk[i];
            System.out.println("Stock \t: " + stock);

            Buku03 m = new Buku03(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Data keseluruhan Buku (Setelah diurutkan) : ");
        data.tampil();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Judul Buku yang dicari : ");
        System.out.println("Judul buku : ");
        String cari = s1.nextLine();
        int posisi;
        System.out.println("===============================");
        System.out.println("Menggunakan sequential search (String)");
        posisi = data.StrFindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("===============================");
        System.out.println("Menggunakan binary search (String)");
        posisi = data.StrFindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        s.close();
        s1.close();

    }
}

// System.out.println("Menggunakan sequential search");
        // posisi = data.FindSeqSearch(cari);
        // data.TampilPosisi(cari, posisi);
        // // data.TampilData(cari, posisi);
        // Buku03 dataBuku = data.FindBuku(cari);
        // dataBuku.tampilDataBuku();
        // System.out.println("===============================");
        // System.out.println("Menggunakan sequential search (String)");
        // posisi = data.StrFindSeqSearch(cari);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);
        // System.out.println("===============================");
        // System.out.println("Menggunakan binary search (String)");
        // posisi = data.StrFindBinarySearch(cari, 0, jumBuku - 1);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);