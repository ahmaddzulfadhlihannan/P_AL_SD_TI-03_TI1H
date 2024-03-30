package LatihanPraktikum03;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel H) {
        if(idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil() {
        for(Hotel h:rooms) {
            h.tampil();
            System.out.println("---------------------------");
        }
    }

    //Bubblesort

    void hargaBubbleSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            for(int j = 1; j < rooms.length-i; j++) {
                if(rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void bintangBubbleSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            for(int j = 1; j < rooms.length-i; j++) {
                if(rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    //Selectionsort

    void hargaSelectionSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for(int j = i+1; j < rooms.length; j++) {
                if(rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void bintangSelectionSort() {
        for(int i = 0; i < rooms.length-1; i++) {
            int idxMin = i;
            for(int j = i+1; j < rooms.length; j++) {
                if(rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }



}
