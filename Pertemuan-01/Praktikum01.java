import java.util.Scanner;
public class Praktikum01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Nilai Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Nilai Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Nilai Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Nilai Nilai UAS : ");
        int uas= sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        if (tugas <= 100 && kuis <= 100 && uts <= 100 && uas <= 100) {
            double tugasAkhir = tugas * 0.2;
            double kuisAkhir = kuis * 0.2;
            double utsAkhir = uts * 0.3;
            double uasAkhir = uas * 0.3;
            double nilaiMatkul = tugasAkhir + kuisAkhir + utsAkhir + uasAkhir;
            System.out.println(nilaiMatkul);
            String huruf;
            if (nilaiMatkul > 80 && nilaiMatkul <= 100) {
                huruf = "A";
            }
            else if (nilaiMatkul > 73 && nilaiMatkul <=80) {
                huruf = "B+";
            }
            else if (nilaiMatkul > 73 && nilaiMatkul <=80) {
                huruf = "B+";
            }else if (nilaiMatkul > 65 && nilaiMatkul <=73) {
                huruf = "B";
            }else if (nilaiMatkul > 60 && nilaiMatkul <=65) {
                huruf = "C+";
            }else if (nilaiMatkul > 50 && nilaiMatkul <=60) {
                huruf = "C";
            }
            else if (nilaiMatkul > 39 && nilaiMatkul <=50) {
                huruf = "D";
            }
            else {
                huruf = "E";
            }
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("==============================");
            System.out.println("==============================");
            if (huruf == "D" || huruf == "E") {
                System.out.println("TIDAK LULUS");
            }
            else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        else {
            System.out.println("nilai invalid");
            System.out.println("==============================");
        }
        System.out.println("==============================");
        sc.close();
        //DONE
    }
}
