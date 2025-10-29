//To check LL is Palindrome or not? (Slow-fast Approach, Reversing half LL) --

package LinkedList;

public class Palindrome {
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

    //slow-fast Approach.
    public Node findMid(Node head){ //helper
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is my mid
    }

    //Checking.
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //1. finding mid Node.
        Node midNode = findMid(head);

        //2. Reversing 2nd half.
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        //3. checking 1st half == 2nd half.
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args){
        Palindrome ll = new Palindrome();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(11);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();

        System.out.println(ll.isPalindrome());
    }
}
