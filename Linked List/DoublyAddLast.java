//Add data at last in Doubly Linked List.

package LinkedList;

public class DoublyAddLast {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        //1. Create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //2. new node's next = head
        tail.next = newNode;
        newNode.prev = tail;

        //3. head = new node
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        DoublyAddLast dll = new DoublyAddLast();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);

        dll.printLL();
        System.out.println(size);
    }
}
