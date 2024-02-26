import java.util.Scanner;
public class Main03 {
    public static Scanner sc = new Scanner(System.in);
    public static String namaBangunRuang[] = {"Kerucut", "Limas Segi Empat Sama Sisi", "Bola"};
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah bangun ruang");
        int jumlah = sc.nextInt();
        String simpanBangunRuang[] = new String[jumlah];
        BangunRuang[] bangunRuang = new BangunRuang[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bangun Ruang ke-" + (i+1));
            System.out.println("Jenis Bangun Ruang : ");
            for (int j = 0; j < namaBangunRuang.length; j++){
                System.out.println((j+1) + ". " + namaBangunRuang[j]);
            }
            int pil;
            do{
                pil = sc.nextInt();
                if (pil > (namaBangunRuang.length) || pil < 1) {
                    System.out.println("Masukkan nomor yang valid");
                }
            }while (pil > (namaBangunRuang.length) || pil < 1);
            switch (pil) {
                case 1:
                    simpanBangunRuang[i] = namaBangunRuang[0];
                    System.out.println("Masukkan jari-jari : ");
                    double r = sc.nextDouble();
                    double s;
                    do {
                        System.out.print("Masukkan sisi miring (harus lebih dari jari-jari): ");
                        s = sc.nextDouble();
                        if (s <= r) {
                            System.out.println("Sisi miring harus lebih besar dari jari-jari.");
                        }
                    } while (s <= r); 
                    bangunRuang[i] = new Kerucut03(r, s);
                    break;
                
                case 2: 
                    simpanBangunRuang[i] = namaBangunRuang[1];
                    System.out.println("Masukkan rusuk : ");
                    double R = sc.nextDouble();
                    System.out.println("Masukkan tinggi : ");
                    double t = sc.nextDouble();
                    bangunRuang[i] = new LimasSegiEmpatSamaSisi03(R, t);
                    break;

                case 3:
                    simpanBangunRuang[i] = namaBangunRuang[2];
                    System.out.println("Masukkan jari-jari : ");
                    double jr = sc.nextDouble();
                    bangunRuang[i] = new Bola03(jr);

                default:
                    break;
            }
        }
        for (int j = 0; j < jumlah; j++) {
            System.out.println("Bangun ruang ke-" + (j + 1) + " : " + simpanBangunRuang[j]);
            System.out.println("Luas permukaan " + namaBangunRuang[j] + " : " + bangunRuang[j].hitungLuasPermukaan());
            System.out.println("Volume " + namaBangunRuang[j] + " : " + bangunRuang[j].hitungVolume());
        }
    }
}
