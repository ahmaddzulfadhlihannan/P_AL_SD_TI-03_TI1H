//package minggu11;

/**
 * SinggleLinkList
 */
public class SinggleLinkList {

    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if(!isEmpty()) { // jika linked list tidak kosong
            Node tmp = head;
            System.out.print("Isi Linked List : ");
            while(tmp != null) { // Kondisi bukan kosong
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;// head dan tail harus dimiliki node yang sama
            tail = ndInput; 
        } else {
            ndInput.next = head; // Geser head sebelumnya dan node input baru menjadi head
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if(isEmpty()) { // jika linked list kosong
            head = ndInput;// head dan tail harus dimiliki node yang sama
            tail = ndInput; 
        } else {
            tail.next = ndInput; //Geser tail sebelumnya dan node input baru menjadi tail
            tail = ndInput;
        }

    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while(temp != null && temp.data != key) {
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("Node tidak ditemukan");
        } else {
            ndInput.next = temp.next;
            temp.next = ndInput;
        }
    }

    void inserAt(int index, int input) {
        Node ndInput = new Node(input, null);
        if(index < 0) {
            System.out.println("Index tidak valid");
        } else if(index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    //Praktikum 2

    int getData(int index) {

        Node tmp = head;
        for(int i = 0; i < index && tmp != null; i++ ) {
            tmp = tmp.next;
        }
        if(tmp != null) {
            return tmp.data;
        } else {
            System.out.println("Index tidak valid");
            return -1;
        }
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked masih kosong," + " tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked masih kosong," + " tidak dapat dihapus");
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
    }

    void remove(int key) {
        if(isEmpty()) {
            System.out.println("Linked masih kosong, " + "tidak dapat dihapus");
        }else {
            Node temp = head;
            while(temp != null) {
                if(temp.data == key && temp == head) {
                    removeFirst();
                } else if(temp.next.data == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            } 
            if(temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if(temp.next == null) {
                    tail = temp;
                }
            }
        }
    }



}
