public class Praktikum04 {
    public static void main(String[] args) {
        int[][] stockBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        for (int cabang = 0; cabang < stockBunga.length; cabang++) {
            int pendapatan = 0;
            for (int i = 0; i < stockBunga[cabang].length; i++) {
                pendapatan += stockBunga[cabang][i] * hargaBunga[i];
            }
            System.out.println("Pendapatan cabang RoyalGarden " + (cabang + 1) + " adalah: Rp " + pendapatan);
        }
        int cabang = 3; 
        System.out.println("\nJumlah Stock setiap jenis bunga pada cabang RoyalGarden " + (cabang + 1) + ":");
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            System.out.println(namaBunga(i) + ": " + stockBunga[cabang][i]);
        }
        penguranganStock(stockBunga, "Aglonema", 1);
        penguranganStock(stockBunga, "Keladi", 2);
        penguranganStock(stockBunga, "Mawar", 5);
        System.out.println("\nJumlah Stock setelah pengurangan karena bunga mati:");
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            System.out.println(namaBunga(i) + ": " + stockBunga[cabang][i]);
        }
    }
    private static String namaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
    private static void penguranganStock(int[][] stockBunga, String jenisBunga, int jumlah) {
        int indeks = -1;
        switch (jenisBunga) {
            case "Aglonema":
                indeks = 0;
                break;
            case "Keladi":
                indeks = 1;
                break;
            case "Alocasia":
                indeks = 2;
                break;
            case "Mawar":
                indeks = 3;
                break;
        }
        if (indeks != -1) {
            for (int i = 0; i < stockBunga.length; i++) {
                stockBunga[i][indeks] -= jumlah;
            }
        }
    }
}
