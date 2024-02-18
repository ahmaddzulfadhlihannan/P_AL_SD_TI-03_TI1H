import java.util.Scanner;

public class Praktikum03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        String huruf[] = new String[8];
        int nilaiMatkul[] = new int[8];
        double bobot[] = new double[8];
        double jumIP = 0;
        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("Nilai nilai Angka untuk MK " + matkul[i] + " : ");
            nilaiMatkul[i] = sc.nextInt();
            if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                huruf[i] = "A";
                bobot[i] = 4;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                huruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                huruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                huruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                huruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                huruf[i] = "D";
                bobot[i] = 1;
            } else {
                huruf[i] = "E";
                bobot[i] = 0;
            }
            jumIP += bobot[i]; // Koreksi penghitungan jumlah IP
        }
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s%-20s%-20s%-20s%n", "Matakuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int j = 0; j < nilaiMatkul.length; j++) {
            System.out.printf("%-40s%-20d%-20s%-20.2f%n", matkul[j], nilaiMatkul[j], huruf[j], bobot[j]); // Koreksi format bobot
        }
        System.out.println("====================");
        sc.close();
        double IP = jumIP / 8; // Menghitung IP rata-rata
        System.out.printf("IP : %.2f%n", IP);
    }
}
