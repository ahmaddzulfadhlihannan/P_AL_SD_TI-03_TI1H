public class MatchRestult {
    DriversNode head, tail;
    SingleLinkedList klasemen;

    MatchRestult(SingleLinkedList klasemen) {
        this.klasemen = klasemen;
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printMatchResult(String date) {
        DriversNode temp = head;
        System.out.println("----------------------------");
        System.out.println("| Tanggal : " + date + " |");
        System.out.println("==================================================================================================================");
        System.out.printf("| %-4s | %-27s | %-23s | %-7s | %-7s | %-6s | %-6s | %-12s |\n", "Pos", "Nama", "Tim", "Posisi", "Poin", "Menang", "Podium", "Asal Negara");
        System.out.println("==================================================================================================================");
        while(temp != null) {
            System.out.printf("| %-4d | %-27s | %-23s | %-7d | %-7d | %-6d | %-6d | %-12s |\n", temp.pos, temp.name, temp.tim, temp.pos, temp.pts, temp.win, temp.pod, temp.country);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            temp = temp.next;
        }
    }

    void addFirst(int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, head);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(String date, int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, null);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(String key, int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, null);
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

    void insertAt(int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, null);
        if(pos < 0) {
            System.out.println("Index tidak valid");
        } else if(pos == 0) {
            addFirst(pos, name, tim, country, time, pts, win);
        } else {
            DriversNode temp = head;
            for(int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void addMatchResult(int pos, String name, String tim, String country, String time, int pts, int win) {
        insertAt(pos, name, tim, country, time, pts, win);
        klasemen.updatePts(name, pts, win);
    }

    void clearMatchResult() {
        head = null;
    }
}
