//Reverse a Linked List (Iterative) --

package LinkedList;

public class Reverse {
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

    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head; //keeping the original head as tail from beginning. So after reverse, in the new node it points as tail
        Node next;

        //reverse operations.
        while(curr != null){
            next = curr.next;
            curr.next = prev; //reverse command
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args){
        Reverse ll = new Reverse();

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
