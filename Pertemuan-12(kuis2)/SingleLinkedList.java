public class SingleLinkedList {
    DriversNode head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void printKlasemen(String date) {
        DriversNode temp = head;
        System.out.println("----------------------------");
        System.out.println("| Tanggal : " + date + " |");
        System.out.println("====================================================================================================");
        System.out.printf("| %-4s | %-27s | %-23s | %-7s | %-7s | %-6s | %-6s |\n", "Pos", "Nama Pembalap", "Tim", "Posisi", "Poin", "Menang", "Podium");
        System.out.println("====================================================================================================");
        int pos = 1;
        while(temp != null) {
            System.out.printf("| %-4d | %-27s | %-23s | %-7d | %-7d | %-6d |\n", pos, temp.name, temp.tim, temp.pos, temp.pts, temp.win, temp.pod);
            temp = temp.next;
            pos++;
        }
        System.out.println("====================================================================================================");
    }


    void addFirst(int pos, String name, String tim, int pts, int pod, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, pts, pod, win, head);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int pos, String name, String tim, int pts, int pod, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, pts, pod, win, null);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(String key, int pos, String name, String tim, int pts, int pod, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, pts, pod, win, null);
        DriversNode temp = head;
        while(temp != null && !temp.name.equals(key)) {
            if(temp.name.equals(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }

    void inserAt(int pos, String name, String tim, int pts, int pod, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, pts, pod, win, null);
        if(pos < 0) {
            System.out.println("Index tidak valid");
        } else if(pos == 0) {
            addFirst(pos, name, tim, pts, pod, win);
        } else {
            DriversNode temp = head;
            for(int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    DriversNode getData(int index) {
        DriversNode temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if(temp != null) {
            return temp;
        } else {
            System.out.println("Index tidak valid");
            return null;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            DriversNode temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
    }

    void remove(String key) {
        if(isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else {
            DriversNode temp = head;
            while(temp.next != null) {
                if(temp.next.name.equals(key)) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if(index < 0) {
            System.out.println("Index tidak valid");
        } else if(index == 0) {
            removeFirst();
        } else {
            DriversNode temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    void updatePts(String nama, int pts, int win) {
        DriversNode temp = head;
        while(temp != null) {
            if(temp.name.equals(nama)) {
                temp.pts += pts;
                temp.win += win;
            }
            temp = temp.next;
        }
    }

    void sortByPts() {
        if (head == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            DriversNode current = head;
            while (current != null && current.next != null) {
                if (current.pts < current.next.pts) {

                    int tempPos = current.pos;
                    current.pos = current.next.pos;
                    current.next.pos = tempPos;

                    String tempName = current.name;
                    current.name = current.next.name;
                    current.next.name = tempName;

                    String tempTim = current.tim;
                    current.tim = current.next.tim;
                    current.next.tim = tempTim;

                    int tempPts = current.pts;
                    current.pts = current.next.pts; 
                    current.next.pts = tempPts;

                    int tempPod = current.pod;
                    current.pod = current.next.pod;
                    current.next.pod = tempPod;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    


}

