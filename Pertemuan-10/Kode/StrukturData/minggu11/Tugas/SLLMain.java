package Tugas;

public class SLLMain {
    public static void main(String[] args) {
        SinggleLinkList singLL = new SinggleLinkList();
        singLL.print();
        singLL.addFirst(113, "Doni");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.insertAfter(111, 112, "Prita");
        singLL.print();
        singLL.inserAt(3, 114, "Doni");
        singLL.print();

        System.out.println("Data pada indeks ke-1 : " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(113));

        singLL.remove(112);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
