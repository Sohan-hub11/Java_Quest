//Merge Sort in Linked List --

package LinkedList;

public class MergeSort {
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


    public Node findMid(Node head){ //slow-fast Approach.
        Node slow = head;
        Node fast = head.next; //.next is taken to pick the 2nd mid.
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow; //slow is my mid
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next ==null){
            return head;
        }

        //find mid Node.
        Node mid = findMid(head);

        //Separating into 2 half.
        Node rightNode = mid.next;
        mid.next = null;

        //Sorting 2 half.
        Node newLeft = mergeSort(head);
        Node newright = mergeSort(rightNode);

        //merging 2 half.
        return merge(newLeft, newright);
    }

    public static void main(String[] args){
        MergeSort ll = new MergeSort();

        ll.addFirst(-4);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(4);
        ll.print(); //original LL.

        head = ll.mergeSort(head);
        ll.print(); //sorted LL

    }
}
