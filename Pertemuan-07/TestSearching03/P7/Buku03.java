public class Buku03 {

    String kodeBuku;
    int tahunTerbit, stock;
    String judul, pengarang;

    public Buku03(String kodeBuku, String judul, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=============================");
        System.out.println("Kode buku : " + kodeBuku);
        System.out.println("Judul buku : " + judul);
        System.out.println("Tahun terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }

    
}