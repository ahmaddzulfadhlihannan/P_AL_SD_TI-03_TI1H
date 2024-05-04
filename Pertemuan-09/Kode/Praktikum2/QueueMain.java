package Praktikum2;
import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian terbelakang");
        System.out.println("---------------------------------");
    }

    public static Scanner sc = new Scanner(System.in);
    public static Scanner st = new Scanner(System.in);
    public static Scanner sd = new Scanner(System.in);
    
    

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
                    System.out.print("No rekening: ");
                    String norek = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah03 nb = new Nasabah03(norek, alamat, nama, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah03 data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }


}
