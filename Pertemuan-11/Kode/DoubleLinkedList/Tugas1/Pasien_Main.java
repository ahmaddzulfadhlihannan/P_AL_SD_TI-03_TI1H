package DoubleLinkedList.Tugas1;
import java.util.Scanner;

public class Pasien_Main {
    public static Scanner  sc = new Scanner(System.in); 
    public static void main(String[] args) throws Exception {
        DLL_Pasien dll = new DLL_Pasien();
        int pilihan;
        do{
            menu();
            do{
                pilihan = sc.nextInt();
                if(pilihan < 1 || pilihan > 4){
                    System.out.println("Pilihan Tidak Tersedia");
                }
            }while(pilihan < 1 || pilihan > 4);

            
            switch(pilihan){
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor Antrian : ");
                    int nomor = sc.nextInt();
                    System.out.print("Nama Antrian : ");
                    String nama = sc.next();
                    dll.addLast(nomor, nama);
                    break;
                case 2:
                    dll.removeFirst();
                    break;
                case 3:
                    dll.print();
                    break;
            }
        }while(pilihan != 4);
    }

    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++");
    }
}
