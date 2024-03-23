public class PesawatTerbang {
    float  kapasitas;
    static float[] b = {1f, 2f, 3f};
    public PesawatTerbang (float k) {
        kapasitas = k;
    }
    public static void main(String[] args) {
        PesawatTerbang[] pesawat = new PesawatTerbang[3];
        for(int i = 0; i < 3; i++) {
            pesawat[i] = new PesawatTerbang(b[i]);
        }

        // pesawat[0] = new PesawatTerbang(3f);
        // pesawat[1] = new PesawatTerbang(2f);
        // pesawat[2] = new PesawatTerbang(4f);

        for (int i = 0; i < pesawat.length; i++) {
            System.out.println(pesawat[i].kapasitas);
        }
    }
}
