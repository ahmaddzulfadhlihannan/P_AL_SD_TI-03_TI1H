package DoubleLinkedList.Tugas1;

public class Data_Pasien {
    int nomor;
    String nama;
    Data_Pasien next, prev;

    Data_Pasien(Data_Pasien prev, int nomor, String nama, Data_Pasien next) {
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
        this.prev = prev;
    }
}
