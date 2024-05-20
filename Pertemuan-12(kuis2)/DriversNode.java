public class DriversNode {
    String name, race, status, time, tim, country;
    int pts, win, pos, pod;
    DriversNode next;

    DriversNode(int pos, String name, String tim, int pts, int pod, int win, DriversNode next) {
        this.pos = pos;
        this.name = name;
        this.tim = tim;
        this.pts = pts;
        this.pod = pod;
        this.win = win;
        this.next = next;    
    }

    DriversNode(int pos, String nama, String tim, String country, String waktu, int pts, int win, DriversNode next) {
        this.pos = pos;
        this.name = nama;
        this.tim = tim;
        this.country = country;
        this.time = waktu;
        this.pts = pts;
        this.win = win;
        this.next = next;
    }
}