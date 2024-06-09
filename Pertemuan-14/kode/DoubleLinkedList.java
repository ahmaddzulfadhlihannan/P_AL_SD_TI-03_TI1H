public class DoubleLinkedList {
    Node03 head;
    int size;

    DoubleLinkedList() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item, int jarak) {
        if(isEmpty()) {
            head = new Node03(null, item, jarak,  null);
        } else {
            Node03 newNode = new Node03(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node03 temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.jarak;
    }

    void addLast(int item, int indeks) {
        if(isEmpty()) {
            addFirst(item, indeks);
        } else {
            Node03 current = head;
            while(current.next != null) {
                current = current.next;
            }
            Node03 newNode = new Node03(current, item, indeks, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if(isEmpty()) {
            addFirst(item, index);
        } else if(index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node03 current = head;
            int i = 0;
            while(i < index) {
                current = current.next;
                i++;
            }
            if(current.prev == null) {
                Node03 newNode = new Node03(null, item, index, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node03 newNode = new Node03(current.prev, item, index, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    int getTotalSize() {
        int totalSize = 0;
        if (!isEmpty()) {
            Node03 tmp = head;
            while (tmp != null) {
                totalSize += tmp.jarak;
                tmp = tmp.next;
            }
        }
        return totalSize;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if(!isEmpty()) {
            Node03 tmp = head;
            while(tmp != null) {

                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }


    //PRAKTIKUM 2

    void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            head = null;
            size--;
            return;
        }
        Node03 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node03 current = head;
        while (current != null) {
            if(current.data == index) {
                if(current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if(current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    // PRAKTIKUM 3

    int getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong");
        }
        return head.data;
    }

    int getLast() throws Exception{
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong");
        }
        Node03 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception {
        if (index >= size || index < 0){
            throw new Exception("Nilai indeks diluar batas");
        }
        Node03 tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void updateJarak(int index, int jarakBaru) throws Exception {
        if (index >= size || index < 0){
            throw new Exception("Nilai indeks diluar batas");
        }
        Node03 tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.jarak = jarakBaru;
    }

    
}
