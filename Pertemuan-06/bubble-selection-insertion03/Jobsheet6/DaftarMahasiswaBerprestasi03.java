package Jobsheet6;

public class DaftarMahasiswaBerprestasi03 {
    Mahasiswa03 listMhs[] = new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for(Mahasiswa03 m:listMhs) {
            m.tampil();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa03 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }
    
    void selectionSort() {
        for(int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for(int j = i+1; j < listMhs.length; j++) {
                if(listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa03 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for(int i = 1; i < listMhs.length; i++) {
            Mahasiswa03 temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}