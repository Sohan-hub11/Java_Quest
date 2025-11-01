//Add data at First in Doubly Linked list.

package LinkedList;

public class DoublyAddFirst {
    public static class Node { //Declaration.
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data =data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //1. Create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //2. new node's next = head
        newNode.next = head;
        head.prev = null;

        //3. head = new node
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        DoublyAddFirst dll = new DoublyAddFirst();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printLL();
        System.out.println(size);
    }
}
