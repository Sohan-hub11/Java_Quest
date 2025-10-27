//Add data at middle in Linked List.

package LinkedList;

public class AddMiddle {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void middleAdd(int data, int idx) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1(prev Node)   temp -- points prev Node
        newNode.next = temp.next;
        size++;
        temp.next = newNode;
    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        AddMiddle ll = new AddMiddle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        ll.middleAdd(11,2);
        ll.print();
        System.out.println("Size of the Linked List : " + size);
    }
}
