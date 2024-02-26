public class Contoh {
    int nomor;
    //Konstruktor tanpa parameter
    public Contoh() {

    };
    //Konstruktor dengan parameter
    public Contoh(int nomor) {
        this.nomor = nomor;
    }

    public static void main(String[] args) {
        Contoh contoh1 = new Contoh();
        contoh1.nomor = 1;

        Contoh contoh2 = new Contoh(3);

        System.out.println(contoh1.nomor);
        System.out.println(contoh2.nomor);
    }
}
