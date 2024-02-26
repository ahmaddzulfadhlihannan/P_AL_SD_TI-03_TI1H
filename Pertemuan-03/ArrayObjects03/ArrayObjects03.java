import java.util.Scanner;
public class ArrayObjects03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Banyak Persegi Panjang : ");
        int k = sc.nextInt();

        PersegiPanjang03[] ppArray = new PersegiPanjang03[k];

        for (int i = 0; i < k; i++) {
            ppArray[i] = new PersegiPanjang03();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
            
        }

        for (int i = 0; i < k; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

        sc.close();
    }
}
