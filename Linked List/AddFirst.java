//Add data at First in Linked list.

package LinkedList;

public class AddFirst {
    public static class Node { //Declaration.
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //1. Create a new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //2. new node's next = head
        newNode.next = head;

        //3. head = new node
        head = newNode;
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
        AddFirst ll = new AddFirst();

        ll.printLL();
        ll.addFirst(4);
        ll.printLL();
        ll.addFirst(3);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
    }
}
