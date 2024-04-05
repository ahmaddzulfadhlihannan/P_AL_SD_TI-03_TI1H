public class PencarianBuku03 {
    Buku03 listBuku[] = new Buku03[5];
    int idx, judulSama;

    void tambah(Buku03 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        sortData();
        for (Buku03 m : listBuku) {
            m.tampilDataBuku();
        }
    }

    void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.print("Data : " + x + " ditemukan pada indeks ");
            for (int j = 0; j < listBuku.length; j++) {
                if (listBuku[j].judul.equals(x)) {
                    System.out.print((j) + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void TampilData(String x, int pos) {
        judulSama = hitungJudulSama(x);
        if (pos != -1) {
            if (judulSama > 1) {
                System.out.println("PERINGATAN!!!\nTerdapat judul buku yang sama");
                System.out.println("Jumlah buku dengan judul yang sama: " + judulSama);
                for (int i = 0; i < listBuku.length; i++) {
                    if (listBuku[i] != null && listBuku[i].judul.equals(x)) {
                        listBuku[i].tampilDataBuku();
                    }
                }
            } else {
                System.out.println("Kode buku\t : " + listBuku[pos].kodeBuku);
                System.out.println("Judul\t : " + x);
                System.out.println("Tahun terbit\t : " + listBuku[pos].tahunTerbit);
                System.out.println("Pengarang\t : " + listBuku[pos].pengarang);
                System.out.println("Stock\t : " + listBuku[pos].stock);
            }
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    int hitungJudulSama(String x) {
        int h = 0;
        for (Buku03 buku : listBuku) {
            if (buku != null && buku.judul.equals(x)) {
                h++;
            }
        }
        return h;
    }

    public Buku03 FindBuku(String cari) {
        int posisi = -1, comp;
        for (int j = 0; j < listBuku.length; j++) {
            comp = cari.compareTo(listBuku[j].kodeBuku);
            if (comp == 0) {
                posisi = j;
                break;
            }
        }

        if (posisi != -1) {
            return listBuku[posisi];
        } else {
            return null;
        }
    }

    void sortData() {
        int n = listBuku.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listBuku[j] != null && listBuku[j + 1] != null
                        && listBuku[j].tahunTerbit > listBuku[j + 1].tahunTerbit) {
                    Buku03 temp = listBuku[j];
                    listBuku[j] = listBuku[j + 1];
                    listBuku[j + 1] = temp;
                }
            }
        }
    }

    int StrFindSeqSearch(String cari) {
        int posisi = -1;
        judulSama = 0;
        for (int j = 0; j < listBuku.length; j++) {
            if (listBuku[j].judul.equals(cari)) {
                posisi = j;
                judulSama++;
            }
        }

        return posisi;
    }

    public int StrFindBinarySearch(String cari, int left, int right) {
        int mid, comp;
        judulSama = 0;
        while (right >= left) {
            mid = left + (right - left) / 2;
            comp = listBuku[mid].judul.compareTo(cari);
            if (comp == 0) {
                judulSama++;
                int posKiri = mid - 1;
                while (posKiri >= left && listBuku[posKiri].judul.equals(cari)) {
                    judulSama++;
                    posKiri--;
                }
                int posKanan = mid + 1;
                while (posKanan <= right && listBuku[posKanan].judul.equals(cari)) {
                    judulSama++;
                    posKanan++;
                }
                return mid;
            } else if (comp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

// public int FindBinarySearch(int cari, int left, int right) {
// int mid;
// if (right >= left) {
// mid = left + (right - left) / 2;
// if (listBuku[mid] != null && listBuku[mid].kodeBuku == cari) {
// return mid;
// } else if (listBuku[mid] != null && listBuku[mid].kodeBuku > cari) {
// return FindBinarySearch(cari, left, mid - 1);
// } else {
// return FindBinarySearch(cari, mid + 1, right);
// }
// }
// return -1;
// }

// int StrFindSeqSearch(String cari){
// int posisi = -1;
// for(int j = 0; j < listBuku.length; j++) {
// if (listBuku[j].kodeBuku.equals(cari)) {
// posisi = j;
// break;
// }
// }
// return posisi;
// }

// public int StrFindBinarySearch(String cari, int left, int right) {
// int mid, comp;
// if (right >= left) {
// mid = left + (right - left) / 2;
// comp = listBuku[mid].kodeBuku.compareTo(cari);
// if (listBuku[mid] != null && comp == 0) {
// return mid;
// } else if (listBuku[mid] != null && comp < 0) {
// return StrFindBinarySearch(cari, left, mid - 1);
// } else {
// return StrFindBinarySearch(cari, mid + 1, right);
// }
// }
// return -1;
// }

// int FindSeqSearch(int cari){
// int posisi = -1;
// for(int j = 0; j < listBuku.length; j++) {
// if (listBuku[j].kodeBuku == cari) {
// posisi = j;
// break;
// }
// }
// return posisi;
// }
