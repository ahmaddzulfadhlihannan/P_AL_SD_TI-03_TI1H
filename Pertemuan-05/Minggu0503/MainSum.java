package Minggu0503;

import java.util.Scanner;

public class MainSum {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sd = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("Program Menghitung Keuntungan Total(Satuan Juta. Misal 5.9)");
        System.out.println("Masukkan Jumlah Perusahaan");
        int perusahaan = sc.nextInt();
        int elm[] = new int[perusahaan];

        Sum03[] sm = new Sum03[perusahaan];
        System.out.println("==============================================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan Jumlah Bulan : ");
            elm[i] = sc.nextInt();
            sm[i] = new Sum03(i+1, elm[i]);
            for (int j = 0; j < elm[i]; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                sm[i].keuntungan[i][j] = sd.nextDouble();
            }
        }
        System.out.println("==============================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Keuntungan perusahaan ke-" + (i + 1) + " dalam " + elm[i] + " bulan : "
                    + sm[i].totalBF(sm[i].keuntungan[i]));
        }
        
        System.out.println("==============================================================");
        System.out.println("Algoritma Devide Conquer");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Keuntungan perusahaan ke-" + (i + 1) + " dalam " + elm[i] + " bulan : "
                    + sm[i].totalDC(sm[i].keuntungan[i], 0, elm[i]-1));
        }

    }
}
