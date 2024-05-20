public class MatchResult {
    private DriversNode head;
    private SingleLinkedList klasemen;

    MatchResult(SingleLinkedList klasemen) {
        this.klasemen = klasemen;
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printMatchResult() {
        DriversNode temp = head;
        System.out.println("==================================================================================================================");
        System.out.printf("| %-4s | %-27s | %-23s | %-7s | %-6s | %-6s | %-12s |\n", "Pos", "Nama", "Tim", "Poin", "Menang", "Podium", "Asal Negara");
        System.out.println("==================================================================================================================");
        while(temp != null) {
            System.out.printf("| %-4d | %-27s | %-23s | %-7d | %-6d | %-6d | %-12s |\n", temp.pos, temp.name, temp.tim, temp.pts, temp.win, temp.pod, temp.country);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            temp = temp.next;
        }
    }

    void addFirst(int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, head);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    void addLast(int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            DriversNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAfter(String key, int pos, String name, String tim, String country, String time, int pts, int win) {
        DriversNode newNode = new DriversNode(pos, name, tim, country, time, pts, win, null);
        DriversNode temp = head;
        while (temp != null && !temp.name.equals(key)) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }

    void insertAt(int pos, String name, String tim, String country, String time, int pts, int win) {
        if (pos == 0) {
            addFirst(pos, name, tim, country, time, pts, win);
            return;
        }
        DriversNode temp = head;
        for (int i = 0; i < pos - 2; i++) {
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp != null) {
            insertAfter(temp.name, pos, name, tim, country, time, pts, win);
        } else {
            addLast(pos, name, tim, country, time, pts, win);
        }
    }

    void addMatchResult(int pos, String country, String name, String tim , String time, int pts, int win) {
        insertAt(pos, name, tim, country, time, pts, win);
        klasemen.updatePoints(name, pts, win);
    }

    void clearRaceResults() {
        head = null;
    }
}

