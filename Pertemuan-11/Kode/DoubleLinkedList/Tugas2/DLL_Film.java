package DoubleLinkedList.Tugas2;


public class DLL_Film {
    private Data_Film head;
    private int count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        Data_Film newNode = new Data_Film(null, id, judul, rating, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        count++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Data_Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            Data_Film newNode = new Data_Film(current, id, judul, rating, null);
            current.next = newNode;
            count++;
        }
    }

    public void add(int id, String judul, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > count) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == count) {
            addLast(id, judul, rating);
        } else {
            Data_Film current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            Data_Film newNode = new Data_Film(current, id, judul, rating, current.next);
            current.next.prev = newNode;
            current.next = newNode;
        }
        count++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }
        Data_Film nodeToRemove = head;
        if (count == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println(nodeToRemove.judul + " telah selesai diputar");
        count--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }
        Data_Film current = head;
        if (count == 1) {
            head = null;
        } else {
            while (current.next.next != null) {
                current = current.next;
            }
            Data_Film nodeToRemove = current.next;
            current.next = null;
            System.out.println(nodeToRemove.judul + " telah selesai diputar");
        }
        count--;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar Film masih kosong");
        } else {
            System.out.println("Cetak Data : ");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            Data_Film tmp = head;
            System.out.printf("|ID.\t|Judul\t|Rating\t|");
            while (tmp != null) {
                System.out.printf("\n|" + tmp.id + "\t|" + tmp.judul + "\t|" + tmp.rating + "\t|");
                tmp = tmp.next;
            }
            System.out.println("\n Total Film : " + count);
        }
    }

    public Data_Film getFirst() {
        return head;
    }

    void remove(int index) throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (index == 0) {
            removeFirst();
        } else {
            Data_Film current = head;
            int i = 0;
            while(i < index) {
                current = current.next;
                i++;
            }
            if(current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            count--;
        }
    }
    
    public void cariDataID(int id) {
        Data_Film current = head;
        Data_Film tmp = null;
        int pos = 1;
        while(current != null) {
            if(current.id == id) {
                tmp = current;
                break;
            }
            current = current.next;
            pos++;
        }
        if(tmp!=null) {
            System.out.println("Data ID Film : " + id + " berada pada di node ke- " + pos);
            System.out.println("IDENTITAS: ");
            System.out.println("\tID Film : " + tmp.id);
            System.out.println("\tJudul Film : " + tmp.judul);
            System.out.println("\tIMDB Rating : " + tmp.rating);
        } else {
            System.out.println("ID Film Tidak Ditemukan");
        }
    }

    public void urutkanDataFilmDesc() {
        if (isEmpty() || count == 1) {
            return; 
        }

        boolean swapped;
        Data_Film last = null;

        do {
            swapped = false;
            Data_Film current = head;

            while (current.next != last) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    String tempJudul = current.judul;

                    current.rating = current.next.rating;
                    current.judul = current.next.judul;

                    current.next.rating = tempRating;
                    current.next.judul = tempJudul;

                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }



}


