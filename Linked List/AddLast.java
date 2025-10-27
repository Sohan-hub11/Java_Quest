package LinkedList;

public class AddLast {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        //1. Create a new node
        AddLast.Node newNode = new AddLast.Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //2. new node's next = head
        tail.next = newNode;

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
        AddLast ll = new AddLast();

        ll.printLL();
        ll.addLast(1);
        ll.printLL();
        ll.addLast(2);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    }
}
