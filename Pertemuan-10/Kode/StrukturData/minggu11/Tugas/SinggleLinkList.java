package Tugas;

/**
 * SinggleLinkList
 */
public class SinggleLinkList {

    Mahasiswa head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if(!isEmpty()) { // jika linked list tidak kosong
            Mahasiswa tmp = head;
            System.out.print("Isi Linked List : ");
            while(tmp != null) { // Kondisi bukan kosong
                System.out.print(tmp.nim + " . " + tmp.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Mahasiswa ndInput = new Mahasiswa(nim, nama, null);
        if(isEmpty()){
            head = tail = ndInput;// head dan tail harus dimiliki node yang sama
        } else {
            ndInput.next = head; // Geser head sebelumnya dan node input baru menjadi head
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Mahasiswa ndInput = new Mahasiswa(nim, nama, null);
        if(isEmpty()) { // jika linked list kosong
            head = tail = ndInput; // head dan tail harus dimiliki node yang sama
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Mahasiswa ndInput = new Mahasiswa(nim, nama, null);
        Mahasiswa temp = head;
        while(temp != null && temp.nim != key) {
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("Node tidak ditemukan");
        } else {
            ndInput.next = temp.next;
            temp.next = ndInput;
        }
    }

    void inserAt(int index, int nim, String nama) {
        Mahasiswa ndInput = new Mahasiswa(nim, nama, null);
        if(index < 0) {
            System.out.println("Index tidak valid");
        } else if(index == 0){
            addFirst(nim, nama);
        } else {
            Mahasiswa temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if(temp == null) {
                addLast(nim, nama);
            } else {
                ndInput.next = temp.next;
                temp.next = ndInput;
            }
        }
    }

    //Praktikum 2

    int getData(int index) {

        Mahasiswa tmp = head;
        for(int i = 0; i < index && tmp != null; i++ ) {
            tmp = tmp.next;
        }
        if(tmp != null) {
            return tmp.nim;
        } else {
            System.out.println("Index tidak valid");
            return -1;
        }
    }

    int indexOf(int key) {
        Mahasiswa tmp = head;
        int index = 0;
        while(tmp != null && tmp.nim != key) {
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
            Mahasiswa temp = head;
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
            Mahasiswa temp = head;
            if(temp.nim == key) {
                removeFirst();
            } else {
                while(temp.next != null) {
                    if(temp.next.nim == key) {
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
    }

    void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Mahasiswa temp = head;
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




