//To Remove a Loop/Cycle in a LL (Floyd's Algorithm -> Slow-fast Approach) --

package LinkedList;

public class RemoveCycle {
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

    public boolean isCycle(){
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

    public void removeCycle(){
        //Detect cycle
        boolean cycle = false;
        Node fast = head;
        Node slow = head;
        while(fast != null && slow.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //Find last node
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        //Remove cycle
        prev.next = null;
    }

    public static void main(String[] args){
        RemoveCycle ll = new RemoveCycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = temp;

        System.out.println(ll.isCycle()); //checking is cycle or not
        ll.removeCycle(); //removing the cycle
        ll.print(); //printing linear LL without cycle
        System.out.println(ll.isCycle()); //again checking the is cycle or not
    }
}
