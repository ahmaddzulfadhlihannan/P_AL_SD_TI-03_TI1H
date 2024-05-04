package Tugas1;

import java.util.Scanner;
public class QueueMain03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue03 antri = new Queue03(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No HP: ");
                    int noHp = sc.nextInt();
                    Pembeli03 p = new Pembeli03(nama, noHp);
                    antri.enqueue(p);
                    break;
                case 2:
                    Pembeli03 data = antri.dequeue();
                    if (data.nama != null && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek daftar pembeli");
        System.out.println("---------------------------------");
    }

}


