package DoubleLinkedList.Tugas2;

public class Data_Film {
    int id;
    String judul;
    double rating;
    Data_Film next, prev;

    Data_Film(Data_Film prev, int id, String judul, double rating, Data_Film next) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
        this.prev = prev;
    }
}
