public class Konstruktor {
    String namaTim;
    int skor, id;
    Konstruktor next;
    
    Konstruktor(int id, String namaTim){
        this.namaTim = namaTim;
        this.id = id;
        skor = 0;
        next = null;
    }
}
