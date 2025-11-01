//Remove data from last in Doubly LL.

package LinkedList;

public class DoublyRemoveLast {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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
        head.prev = newNode;
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
        Node prev = tail.prev;
        int val = tail.data;
        prev.next = null;
        tail = prev.next;
        size--;
        return val;
    }
    public static void main(String[] args){
        DoublyRemoveLast dll = new DoublyRemoveLast();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.removeLast();
        dll.print();
        System.out.println(size);
    }
}
