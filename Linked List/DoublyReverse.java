//Reverse a Linked List (Iterative) --

package LinkedList;

public class DoublyReverse {
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
        newNode.prev = null;
        head = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        //reverse operations.
        while(curr != null){
            next = curr.next;
            curr.next = prev; //reverse command
            curr.prev = next; //reverse command
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args){
        DoublyReverse ll = new DoublyReverse();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(11);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.reverseLL();
        ll.print();
    }
}
