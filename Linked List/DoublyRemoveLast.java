//Remove data from last.

package LinkedList;

public class DoublyRemoveLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeLast(){
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return -1;
        }
        else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev.next;
        size--;
        return val;
    }
    public static void main(String[] args){
        DoublyRemoveLast ll = new DoublyRemoveLast();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}
