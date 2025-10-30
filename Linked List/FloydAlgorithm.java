//To Detect a Loop/Cycle in a LL (Floyd's Algorithm -> Slow-fast Approach) --

package LinkedList;

public class FloydAlgorithm {
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


    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Floyd's Algorithm.
    public static boolean isLoop(){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true; //cycle exist.
            }
        }

        return false; //cycle don't exist.
    }

    public static void main(String[] args){
        FloydAlgorithm ll = new FloydAlgorithm();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //head.next.next.next.next = head;

        System.out.println(ll.isLoop());
    }
}
