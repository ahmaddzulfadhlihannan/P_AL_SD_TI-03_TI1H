/**
 * Node03
 */
public class Node03 {

    int data;
    Node03 prev, next;
    int jarak;

    Node03(Node03 prev, int data, int jarak, Node03 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }
}