public class Buku03 {

    String judul, pengarang;
    int halaman, stok, harga, terjual;


    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
        
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual += jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }
    
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    public Buku03(){

    }

    public Buku03(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;  
    }
    
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int hrgTot) {
        if (hrgTot > 150000) {
            return (int) (hrgTot * 0.12);
        }
        else if (hrgTot >= 75000 && hrgTot <= 150000) {
            return (int) (hrgTot * 0.05);
        }
        else {
            return 0;
        }
    }

    int hitungHargaBayar(int jml) {
        int hargaTotal = hitungHargaTotal(jml);
        int diskon = hitungDiskon(hargaTotal);
        return hargaTotal - diskon;
    }
}
