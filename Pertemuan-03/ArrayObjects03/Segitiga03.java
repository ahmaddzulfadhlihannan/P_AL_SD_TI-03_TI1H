public class Segitiga03 {
    public int alas;
    public int tinggi;

    public Segitiga03(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double hitungKeliling()  {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        Segitiga03[] sgArray = new Segitiga03[4];
        sgArray[0] = new Segitiga03(10, 4);
        sgArray[1] = new Segitiga03(20, 10);
        sgArray[2] = new Segitiga03(15, 6);
        sgArray[3] = new Segitiga03(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + (i+1) + 
            "\nLuas : " + sgArray[i].hitungLuas() + 
            "\nKeliling : " + sgArray[i].hitungKeliling() );
        }
    }
}
