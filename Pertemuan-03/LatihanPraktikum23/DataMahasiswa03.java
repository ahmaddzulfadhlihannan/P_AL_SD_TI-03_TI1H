import java.util.Scanner;
public class DataMahasiswa03 {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner si = new Scanner(System.in);
    public static Scanner sd = new Scanner(System.in);
    
    public String namaMahasiswa;
    public int nim;
    public String kelamin;
    public double ipk;

    public DataMahasiswa03(String nama, int nim, String kelamin, double ipk) {
        namaMahasiswa = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    } 

    public static double hitungIpk(DataMahasiswa03[] dataMhs) {
        double totIpk = 0;
        for (int l = 0; l < dataMhs.length; l++) {
            totIpk += dataMhs[l].ipk;
        }
        double rata = totIpk / dataMhs.length;
        return rata;
    }

    public static void dataIpkTerbesar(DataMahasiswa03[] dataMhs) {
        double terbesar = 0;
        int mahasiswaKe = 0;
        for (int m = 0; m < dataMhs.length; m++) {
            if (dataMhs[m].ipk > terbesar) {
                terbesar = dataMhs[m].ipk;
                mahasiswaKe = m;
            }
        }
        System.out.println("Data Mahasiswa IPK Terbesar");
        System.out.println("Nama : " + dataMhs[mahasiswaKe].namaMahasiswa);
        System.out.println("NIM : " + dataMhs[mahasiswaKe].nim);
        System.out.println("Jenis kelamin : " + dataMhs[mahasiswaKe].kelamin);
        System.out.println("IPK : " + dataMhs[mahasiswaKe].ipk);
    }
    
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        DataMahasiswa03 dataMhs[] = new DataMahasiswa03[jumlah];
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.println("Masukkan nama : ");
            String nama = sc.next();
            System.out.println("Masukkan nim : ");
            int nim = si.nextInt();
            System.out.println("Masukkan jenis kelamin (p/l) : ");
            String kelamin;
            do {
                kelamin = sc.next();
                if (!kelamin.equals("p") && !kelamin.equals("l")) {
                    System.out.println("Masukkan jenis kelamin yang benar");
                }
            }while (!kelamin.equals("p") && !kelamin.equals("l"));
            System.out.println("Masukkan IPK : ");
            double ipk;
            do {
                ipk = sd.nextDouble();
                if (ipk > 4) {
                    System.out.println("Masukkan IPK yang valid");
                }
            }while (ipk > 4);
            dataMhs[i] = new DataMahasiswa03(nama, nim, kelamin, ipk);
        }
        for (int j = 0; j < dataMhs.length; j++) {
            System.out.println("Data mahasiswa ke-" + (j+1));
            System.out.println("Nama : " + dataMhs[j].namaMahasiswa);
            System.out.println("NIM : " + dataMhs[j].nim);
            System.out.println("Jenis Kelamin : " + dataMhs[j].kelamin);
            System.out.println("IPK : " + dataMhs[j].ipk); 
        }
        System.out.println("Rata-rata IPK : " + hitungIpk(dataMhs));
        dataIpkTerbesar(dataMhs);
    }
}