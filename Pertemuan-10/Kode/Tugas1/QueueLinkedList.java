package Tugas1;

public class QueueLinkedList {
    Pembeli03 front;
    Pembeli03 rear;

    void print() {
        if (!isEmpty()) {
            Pembeli03 tmp = front;
            System.out.print("Isi Antrian: ");
            while (tmp != null) {
                System.out.print("("+tmp.nim + " - " + tmp.nama + ")");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void enqueue(int data, String nama) {
        Pembeli03 newNode = new Pembeli03(data, nama);

        if (isEmpty()) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
            return;
        }

        Pembeli03 temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        return this.front.nim;
    }

    boolean isEmpty() {
        return this.front == null;
    }
}

