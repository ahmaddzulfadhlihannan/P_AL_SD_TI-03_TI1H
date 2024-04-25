public class Gudang03 {
    Barang03[] tumpukan;
    int size;
    int top;
    int bottom;

    public Gudang03(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang03[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang03 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang03 ambilBarang() {
        if(!cekKosong()){
            Barang03 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete; 
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang03 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang03 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di gudang");
            for(int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi03 stack = new StackKonversi03();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    
    public Barang03 lihatBarangTerbawah() {
        if(!cekKosong()) {
            Barang03 barangTerbawah = tumpukan[bottom];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    
    public boolean cariBarang(int kode) {
        for(int i = bottom; i <= top; i++) {
            if(tumpukan[i].kode == kode) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                return true;
            }
        }
        System.out.println("Barang tidak ditemukan");
        return false;
    }


}
