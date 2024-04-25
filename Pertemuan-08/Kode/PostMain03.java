import java.util.Scanner;
public class PostMain03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix03 post = new Postfix03(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
