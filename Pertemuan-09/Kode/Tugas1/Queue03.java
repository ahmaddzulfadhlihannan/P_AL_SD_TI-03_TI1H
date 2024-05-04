package Tugas1;

public class Queue03 {
    Pembeli03 [] antrian;
    int front, rear, size, max;

    Queue03(int n) {
        max = n;
        antrian = new Pembeli03[max];
        size = 0;
        front = rear = -1;
        size = 0;
    }

    boolean isEmpty(){
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean isFull(){
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }   

    void enqueue(Pembeli03 dt){
        if(isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0); //Modifikasi
        } else {
            if(isEmpty()) {
                front = rear = 0;
            } else {
                if(rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    } 

    Pembeli03 dequeue(){
        Pembeli03 dt = new Pembeli03();
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0); //Modifikasi
        } else {
            dt = antrian[front];
            size--;
            if(isEmpty()) {
                front = rear = -1;
            } else {
                if(front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekRear() {
        if(!isEmpty()){
            System.out.println("Elemen terakhir: " + antrian[rear].nama + " " + antrian[rear].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekPosition(String nama) {
        int pos = 0;
        boolean found = false;
        int i = front;
        while (i != rear && !found) {
            if (antrian[i].nama.equals(nama)) {
                found = true;
            } else {
                pos++;
                i = (i + 1) % max;
            }
        }
        if (found) {
            System.out.println("Pembeli " + nama + " berada pada posisi " + pos);
        } else {
            System.out.println("Pembeli " + nama + " tidak ditemukan");
        }
    }

    void daftarPembeli() {
        if(isEmpty()) {
            System.out.println("Tidak ada pembeli");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
        }
    }
}
