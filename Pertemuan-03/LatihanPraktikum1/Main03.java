import java.util.Scanner;
public class Main03 {
    public static Scanner sc = new Scanner(System.in);
    public static String bangunRuang[] = {"Kerucut", "Limas Segi Empat Sama Sisi", "Bola"};
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah bangun ruang");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bangun Ruang ke-" + (i+1));
            System.out.println("Jenis Bangun Ruang : ");
            for (int j = 0; j < bangunRuang.length; j++){
                System.out.println((j+1) + ". " + bangunRuang[j]);
            }
            int pil = sc.nextInt();
            switch (pil) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
