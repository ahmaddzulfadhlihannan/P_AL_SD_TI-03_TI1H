public class ContohMain {
    public static void main(String[] args) {
        Contoh[][] ct = new Contoh[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                ct[i][j] = new Contoh();
                ct[i][j].nomor = j;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Contoh" + i + "][" + j + "].nomor = " + ct[i][j].nomor);
            }
        }
    }
}
