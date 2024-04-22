
import java.util.Scanner;
public class Uts {
    public static int bil[] = {5, 17, 37, 27, 34, 47, 23, 27, 25, 2, 46, 0, 8, 19, 21, 8, 25};

    public static void insertionSort(int[] angka) {
        for(int i = 1; i < angka.length; i++) {
            for(int j = i; j > 0; j--) {
                if(angka[j] < angka[j-1]) {
                    int temp = angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] n, int x, int l, int h) {
        while(l <= h) {
            int mid = l + (h-l) / 2;
            if(x == n[mid]){
                return mid;
            } else if (x < n[mid]){
                return binarySearch(n, x, l, mid - 1);
            } else {
                return binarySearch(n, x, mid+1, h);
            }
        }
        return -1;
    }

    public static void dataDitemukan(int a, int pos) {
        if(pos != -1) {
            System.out.println(a + " ditemukan pada index ke-" + pos);
        } else {
            System.out.println(a + " tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        int angka[] = bil.clone();
        String nama = "AHMAD DZUL FADHLI HANNAN";

        System.out.println("Sebelum sort");
        System.out.println(nama);
        for(int j = 0; j < angka.length; j++) {
            System.out.print(angka[j] + ", ");
        }
        System.out.println("\nSetelah sort");
        System.out.println(nama);
        insertionSort(angka);
        for(int k = 0; k < angka.length; k++) {
            System.out.print(angka[k] + ", ");
        }

        System.out.print("\nMasukkan data yang dicari : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int posisi = binarySearch(angka, key, 0, angka.length-1);
        dataDitemukan(key, posisi);
        sc.close();

    }
}