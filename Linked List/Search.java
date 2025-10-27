//Search (Iterative) --

package LinkedList;

public class Search {
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

    public int searchIterative(int key){
        int i=0;
        Node temp = head;
        while (temp != null) {
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }

        return -1;
    }
    public static void main(String[] args){
        Search ll = new Search();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(11);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.searchIterative(11));
    }
}
