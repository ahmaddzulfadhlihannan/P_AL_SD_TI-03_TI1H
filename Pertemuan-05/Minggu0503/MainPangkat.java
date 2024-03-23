package Minggu0503;

import java.util.Scanner;

public class MainPangkat {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat03[] png = new Pangkat03[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.println("Masukkan nilai yang ingin dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkatan : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat03(nilai, pangkat);
        }

        int menu;
        do {
            System.out.println("Pilih menu");
            System.out.println("1. BRUTE FORCE");
            System.out.println("2. DEVIDE CONQUER");
            menu = sc.nextInt();
            if (menu == 0 || menu > 2) {
                System.out.println("Pilih menu yang valid");
            } else {
                break;
            }
        } while (menu == 0 || menu > 2);
        switch (menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int j = 0; j < png.length; j++) {
                    System.out.println("Hasil dari "
                            + png[j].nilai + " pangkat "
                            + png[j].pangkat + " adalah "
                            + png[j].pangkatBF(png[j].nilai, png[j].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DEVIDE CONQUER");
                for (int j = 0; j < png.length; j++) {
                    System.out.println("Hasil dari "
                            + png[j].nilai + " pangkat "
                            + png[j].pangkat + " adalah "
                            + png[j].pangkatDC(png[j].nilai, png[j].pangkat));
                }
                break;
            default:
                break;
        }
    }
}
