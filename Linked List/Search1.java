//Search (Recursive) --

package LinkedList;

public class Search1 {
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

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int searchRec(int key){
      return helper(head, key);
    }
    public static void main(String[] args){
        Search1 ll = new Search1();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(11);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        System.out.println(ll.searchRec(11));
        System.out.println(ll.searchRec(10));
    }
}
