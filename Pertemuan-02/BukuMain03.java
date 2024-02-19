public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        int jumlah = 5;
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        
        bk1.tampilInformasi();
        bk1.terjual(jumlah);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        int hargaTotal = bk1.hitungHargaTotal(jumlah);
        int diskon = bk1.hitungDiskon(hargaTotal);
        int hargaBayar = bk1.hitungHargaBayar(jumlah);
        
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Bayar: " + hargaBayar);

        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku03 BukuAhmadDzulFadhliHannan = new Buku03("Harga Diri Rakyat", "Surya Kencana", 271, 12, 83000);
    }
}
