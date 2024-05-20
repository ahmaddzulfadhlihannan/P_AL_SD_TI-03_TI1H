public class SingleLinkedList {
    private DriversNode head;
    private DriversNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void printKlasemen() {
        DriversNode temp = head;
        System.out.println("====================================================================================================");
        System.out.printf("| %-4s | %-27s | %-23s | %-7s | %-6s | %-6s |\n", "Pos", "Nama Pembalap", "Tim", "Poin", "Menang", "Podium");
        System.out.println("====================================================================================================");
        int pos = 1;
        while(temp != null) {
            System.out.printf("| %-4d | %-27s | %-23s | %-7d | %-6d | %-6d |\n", pos, temp.name, temp.tim, temp.pts, temp.win, temp.pod);
            pos++;
            temp = temp.next;
        }
        System.out.println("====================================================================================================");
    }

    void updatePoints(String name, int points, int win) {
        DriversNode current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                current.pts += points;
                current.win += win;
            }
            current = current.next;
        }
    }

    public void addFirst(int pos, String name, String team, int points, int podium, int win) {
        DriversNode newNode = new DriversNode(pos, name, team, points, podium, win, head);
        if(isEmpty()) {
            tail = newNode;
        }
        head = newNode;
    }

    public void addLast(int pos, String name, String team, int points, int podium, int win) {
        DriversNode newNode = new DriversNode(pos, name, team, points, podium, win, null);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void insertAt(int pos, String name, String team, int points, int podium, int win) {
        if (pos == 0) {
            addFirst(pos, name, team, points, win, podium);
            return;
        }
        DriversNode temp = head;
        for (int i = 0; i < pos - 2; i++) {
            if (temp != null) {
                temp = temp.next;
            }
        }
        if (temp == null || temp.next == null) {
            addLast(pos, name, team, points, win, podium);
            return;
        }
        DriversNode newNode = new DriversNode(pos, name, team, points, win, podium, temp.next);
        temp.next = newNode;
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
                    int tempPoints = current.pts;
                    current.pts = current.next.pts;
                    current.next.pts = tempPoints;

                    String tempName = current.name;
                    current.name = current.next.name;
                    current.next.name = tempName;

                    String tempTeam = current.tim;
                    current.tim = current.next.tim;
                    current.next.tim = tempTeam;

                    int tempWin = current.win;
                    current.win = current.next.win;
                    current.next.win = tempWin;

                    int tempPodium = current.pod;
                    current.pod = current.next.pod;
                    current.next.pod = tempPodium;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}

