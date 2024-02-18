import java.util.Scanner;

public class Praktikum02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.next();
        int digitAkhir = Integer.parseInt(nim.substring(nim.length() - 2));
        if (digitAkhir < 10) {
            digitAkhir += 10;
        }
        System.out.println("n : " + digitAkhir);
        for (int i = 1; i <= digitAkhir; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
        sc.close();
    }
}
