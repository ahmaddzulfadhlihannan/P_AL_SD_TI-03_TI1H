package Praktikum2;

/**
 * Queue03
 */
public class Queue03 {
    Nasabah03 data[];
    int front, rear, size, max;

    Queue03(int n){
        max = n;
        data = new Nasabah03[max];
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

    void enqueue(Nasabah03 dt){
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
            data[rear] = dt;
            size++;
        }
    } 

    Nasabah03 dequeue(){
        Nasabah03 dt = new Nasabah03();
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0); //Modifikasi
        } else {
            dt = data[front];
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

    void peek() {
        if(!isEmpty()){
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo); 
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //MODIFIKSI
    void peekRear() {
        if(!isEmpty()){
            System.out.println("Elemen terakhir: " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo); 
        } else {
            System.out.println("Queue masih kosong");
        }
    }


}