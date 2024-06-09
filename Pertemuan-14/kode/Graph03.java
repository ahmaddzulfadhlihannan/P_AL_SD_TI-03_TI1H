
public class Graph03 {
    int vertex;
    DoubleLinkedList list[];
    int size = 0;
    public Graph03 (int v) {
        vertex = v;
        list = new DoubleLinkedList[v];
        for(int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(tujuan, jarak);
        size++;
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++) {
            for(int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            for(k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for(int i = 0; i < vertex; i++) {
            if(i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
        size--;
    }

    public void removeAllEdge() {
        for(int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        size = 0;
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for(int i = 0; i < vertex; i++) {
            if(list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    
    public boolean cekLokasi(int asal, int tujuan) throws Exception{
        boolean hasil = false;
        for(int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i) == tujuan) {
                hasil = true;
                break;
            } else {
                for(int j = 0; j < list[list[asal].get(i)].size(); j++) {
                    if(list[list[asal].get(i)].get(j) == tujuan) {
                        hasil = true;
                        break;
                    }
                }
            }
        }
        return hasil;
    }

    
    public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception{
        for(int i = 0; i < list[asal].size(); i++) {
            if(list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarakBaru);
                break;
            }
        }
    }

    
    public int totalEdge() {
        return size;
    }



}


