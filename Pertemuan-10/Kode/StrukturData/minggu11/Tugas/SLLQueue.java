package Tugas;

public class SLLQueue {
    private Mahasiswa first, last;

    public void enqueue(int nim, String nama) {
        if (last == null) {
            first = last = new Mahasiswa(nim, nama, null);
        } else {
            last.next = new Mahasiswa(nim, nama, null);
            last = last.next;
        }
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue kosong");
        } else {
            Mahasiswa tmp = first;
            first = first.next;
            if (isEmpty()) {
                last = null;
            }
            return tmp;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        if (!isEmpty()) {
            Mahasiswa tmp = first;
            System.out.print("Isi Queue : ");
            while (tmp != null) {
                System.out.print(tmp.nim + "|" + tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void addFirst(int nim, String nama) {
        if (isEmpty()) {
            first = last = new Mahasiswa(nim, nama, null);
        } else {
            Mahasiswa tmp = new Mahasiswa(nim, nama, null);
            tmp.next = first;
            first = tmp;
        }
    }

    public void addLast(int nim, String nama) {
        enqueue(nim, nama);
    }

    public void insertAfter(int key, int nim, String nama) {
        Mahasiswa temp = first;
        while(temp != null && temp.nim != key) {
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("Node tidak ditemukan");
        } else {
            temp.next = new Mahasiswa(nim, nama, temp.next);
            if(temp == last) {
                last = temp.next;
            }
        }
    }

    public void insertAt(int index, int nim, String nama) {
        if(index == 0) {
            addFirst(nim, nama);
        } else {
            Mahasiswa ndInput = new Mahasiswa(nim, nama, null);
            Mahasiswa temp = first;
            for(int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if(temp == null) {
                System.out.println("Index tidak valid");
            } else {
                ndInput.next = temp.next;
                temp.next = ndInput;
            }
        }
    }

    public int getData(int index) {

        Mahasiswa tmp = first;
        for (int i = 0; i < index && tmp != null; i++) {
            tmp = tmp.next;
        }
        if(tmp != null) {
            return tmp.nim;
        } else {
            System.out.println("Index tidak valid");
            return -1;
        }
    }

    public int indexOf(int key) {
        Mahasiswa tmp = first;
        int index = 0;
        while(tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if(tmp != null) {
            return index;
        } else {
            System.out.println("Node tidak ditemukan");
            return -1;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else if (first == last) {
            first = last = null;
        } else {
            first = first.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            Mahasiswa temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            last = temp;
            last.next = null;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {    
            System.out.println("Queue kosong");
        } else {
            Mahasiswa temp = first;
            while (temp != null) {
                if(temp.nim == key && temp == first) {
                    removeFirst();
                } else if(temp.next.nim == key) {
                    temp.next = temp.next.next;
                    if(temp.next == null) {
                        last = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Mahasiswa temp = first;
            for(int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if(temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if(temp.next == null) {
                    last = temp;
                }
            }
        }
    }

}




