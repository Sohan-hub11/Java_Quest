//Zig-Zag in Linked List --

package LinkedList;

public class ZigZag {
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

    public void zigZag(){
        if (head == null || head.next == null){
            System.out.println("Linked List is null or contains 1 element");
            return;
        }
        //find mid Node.
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow;

        //Reverse the 2nd half.
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Alternate merging.
        Node LH = head;
        Node RH = prev;
        Node nextL, nextR;
        while(LH != null && RH != null){
            //Zig-Zag.
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            //Updating.
            LH = nextL;
            RH = nextR;
        }

    }

    public static void main(String[] args){
        ZigZag ll = new ZigZag();

        ll.addFirst(-4);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(4);
        ll.print(); //original LL.

        ll.zigZag();
        ll.print(); //Zig-Zag LL

    }
}
