package BruteForceDivideConquer03;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        Faktorial03[] fk = new Faktorial03[iJml];
        for(int i = 0; i < fk.length; i++) {
            fk[i] = new Faktorial03();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ": ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int j = 0; j < fk.length; j++) {
            System.out.println("Hasil perhitungan BRUTE FORCE adalah " + fk[j].faktorialBF(fk[j].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for(int j = 0; j < fk.length; j++) {
            System.out.println("Hasil perhitungan DIVIDE CONQUER adalah " + fk[j].faktorialDC(fk[j].nilai));
        }

        sc.close();
    }
}
