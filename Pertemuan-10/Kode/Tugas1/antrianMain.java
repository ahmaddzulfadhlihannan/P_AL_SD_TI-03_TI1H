package Tugas1;

public class antrianMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(001, "Jonson");
        queue.print();
        queue.enqueue(002, "Kadita");
        queue.print();
        queue.enqueue(003, "Yin");
        queue.print();
        queue.enqueue(004, "Aldous");
        queue.print();
        queue.enqueue(005, "Freya");
        queue.print();
        System.out.println();

        System.out.println("Elemen di depan antrian: " + queue.peek());
        queue.dequeue();

        System.out.println();
        System.out.println("Antrian setelah dequeue");
        queue.print();
        System.out.println();
    }
}
