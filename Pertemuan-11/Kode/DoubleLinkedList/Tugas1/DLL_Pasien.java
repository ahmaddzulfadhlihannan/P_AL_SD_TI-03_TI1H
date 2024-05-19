package DoubleLinkedList.Tugas1;

public class DLL_Pasien {
    Data_Pasien head;
    int count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if(isEmpty()) {
            head = new Data_Pasien(null, nomor, nama, null);
        } else {
            Data_Pasien newNode = new Data_Pasien(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }
    
    public void addLast(int nomor, String nama) {
        if(isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Data_Pasien current = head;
            while(current.next != null) {
                current = current.next;
            }
            Data_Pasien  newNode = new Data_Pasien(current, nomor, nama, null);
            current.next = newNode;
            count++;    
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if(count == 1) {
            removeLast();
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi");
            head = head.next;
            head.prev = null;
            count--;
        }
    }

    public void removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            System.out.println(head.nama + " telah selesai divaksinasi");
            head = null;
            count--;
            return;
        }
        Data_Pasien current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Data_Pasien tmp = current;
        System.out.println(tmp.nama + " telah selesai divaksinasi");
        current.next = null;
        count--;
    }


    
    public void print() {
        if(isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Daftar Pengantri Vasksin : ");
            System.out.println("+++++++++++++++++++++++++++");
            Data_Pasien tmp = head;
            System.out.printf("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.printf("\n|" + tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.println("\n Sisa Antrian : " + count);
        }
    }
    
    public Data_Pasien getFirst() {
        return head;
    }
    
    public void remove(Data_Pasien data) throws Exception {
        if(head == data) {
            removeFirst();
        } else {
            Data_Pasien tmp = head;
            while (tmp.next != data) {
                tmp = tmp.next;
            }
            tmp.next = data.next;
            count--;
        }
    }
}
