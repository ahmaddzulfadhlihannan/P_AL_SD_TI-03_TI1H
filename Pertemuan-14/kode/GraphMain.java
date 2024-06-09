import java.util.Scanner;
public class GraphMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Graph03 gedung = new Graph03(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        // System.out.print("Masukkan gedung asal: ");
        // int asal = sc.nextInt();
        // System.out.print("Masukkan gedung tujuan: ");
        // int tujuan = sc.nextInt();
        // boolean hasil = gedung.cekLokasi(asal, tujuan);
        // if(hasil == true) {
        //     System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        // } else {
        //     System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' +tujuan) + " tidak bertetangga");
        // }

        // GraphMatrix03 gdg = new GraphMatrix03(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.degree(0);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.degree(0);
        // gdg.printGraph();
        int pilihan;
        do{
        menu();
        do{
        pilihan = sc.nextInt();
        }while(pilihan > 7 || pilihan < 0);
        switch (pilihan) {
            case 1:
                System.out.println("Menu Add Edge");
                System.out.print("Masukkan gedung asal: ");
                int asal = sc.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan = sc.nextInt();
                System.out.print("Masukkan jarak: ");
                int jarak = sc.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;
            case 2:
                System.out.println("Menu Remove Edge");
                System.out.print("Masukkan gedung asal: ");
                int asal2 = sc.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan2 = sc.nextInt();
                gedung.removeEdge(asal2, tujuan2);
                break;
            case 3:
                System.out.println("Menu Degree");
                System.out.print("Masukkan gedung: ");
                int asal3 = sc.nextInt();
                gedung.degree(asal3);
                break;
            case 4:
                System.out.println("Menu Print Graph");
                gedung.printGraph();
                break;
            case 5:
                System.out.println("Menu Cek Edge");
                System.out.print("Masukkan gedung asal: ");
                int asal4 = sc.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan4 = sc.nextInt();
                boolean hasil = gedung.cekLokasi(asal4, tujuan4);
                if(hasil == true) {
                    System.out.println("Gedung " + (char) ('A' + asal4) + " dan " + (char) ('A' + tujuan4) + " bertetangga");
                } else {
                    System.out.println("Gedung " + (char) ('A' + asal4) + " dan " + (char) ('A' +tujuan4) + " tidak bertetangga");
                }
                break;
            case 6:
                System.out.println("Menu Update Jarak");
                System.out.print("Masukkan gedung asal: ");
                int asal5 = sc.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan5 = sc.nextInt();
                System.out.print("Masukkan jarak: ");
                int jarak2 = sc.nextInt();
                gedung.updateJarak(asal5, tujuan5, jarak2);
                break;
            case 7:
                System.out.println("Menu Hitung Edge");
                int totEdge = gedung.totalEdge();
                System.out.println("Total Edge: " + totEdge);
                break;
            case 0:
                System.out.println("Program selesai");
            } 
            
        }while(pilihan != 0);

    }

    public static void menu() {
        System.out.println("Silahkan pilih opsi yang ingin dijalankan: ");
        System.out.println("1. Tambahkan edge");
        System.out.println("2. Hapus edge");
        System.out.println("3. Degree");
        System.out.println("4. Print graph");
        System.out.println("5. Cek edge");
        System.out.println("6. Update jarak");
        System.out.println("7. Hitung Edge");
        System.out.println("0. Exit");
    }
}
