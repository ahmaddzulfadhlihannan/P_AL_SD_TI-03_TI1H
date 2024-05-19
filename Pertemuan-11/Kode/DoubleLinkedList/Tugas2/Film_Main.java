package DoubleLinkedList.Tugas2;

import java.util.Scanner;

public class Film_Main {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner ss = new Scanner(System.in);
    public static Scanner sd = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        DLL_Film dll = new DLL_Film();
        int pilihan, id, pos;
        String judul;
        double rating;
        do {
            menu();
            do {
                pilihan = sc.nextInt();
                if (pilihan < 1 || pilihan > 10) {
                    System.out.println("Pilihan Tidak Tersedia");
                }
            } while (pilihan < 1 || pilihan > 10);

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = ss.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sd.nextDouble();
                    dll.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = ss.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sd.nextDouble();
                    dll.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Posisi Ke-");
                    System.out.print("ID Film : ");
                    id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = ss.nextLine();
                    System.out.print("Rating Film : ");
                    rating = sd.nextDouble();
                    System.out.println("Film ini akan masuk ke posisi- : ");
                    pos = sc.nextInt();
                    dll.add(id, judul, rating, pos-1);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Data Film Ke Berapa : ");
                    pos = sc.nextInt();
                    dll.remove(pos);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film Yang Dicari : ");
                    id = sc.nextInt();
                    dll.cariDataID(id);
                    break;
                case 9:
                    dll.urutkanDataFilmDesc();
                    System.out.println("Setelah Diurutkan");
                    dll.print();
                    break;

            }
        } while (pilihan != 10);
    }

    public static void menu() {
        System.out.println("=============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("=============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urutan Data Film-DESC");
        System.out.println("10 Keluar");
        System.out.println("=============================");
    }
}


