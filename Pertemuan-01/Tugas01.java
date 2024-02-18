import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'Р', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai kode plat nomor (hanya huruf pertama): ");
        char kodePlat = scanner.next().charAt(0);
        scanner.close();
        
        String kota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                kota = String.valueOf(KOTA[i]); 
                break;
            }
        }
        if (kota != null) {
            System.out.println("Kota yang berpasangan dengan kode plat nomor " + kodePlat + " adalah: " + kota);
        } else {
            System.out.println("Kode plat nomor tidak valid atau tidak ditemukan.");
        }
    }
}
