//Find & Remove nth node from end(Iterative approach) --

package LinkedList;

public class RemoveNth {
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

    public void removeNthFromEnd(int n){
        /* if size function is not given then to find size operation --
        int sz = 0;
        Node temp = head;
        while (temp == null){
            temp = temp.next;
            sz++;
        } */

        //if to remove head('n' is extreme front).
        if(n == size){
            head = head.next;
            return;
        }

        //if size-n
        int i = 1;
        Node prev = head;
        while (i < size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args){
        RemoveNth ll = new RemoveNth();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(11);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.removeNthFromEnd(5);
        ll.print();
    }
}
