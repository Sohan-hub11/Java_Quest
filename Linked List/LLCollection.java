//To implements Linked List Collection Framework.

package LinkedList;
import java.util.LinkedList;
public class LLCollection {
    public static void main(String[] args){
        //Creation.
        LinkedList<Integer> ll = new LinkedList<>();

        //Add.
        ll.addLast(11);
        ll.addLast(22);
        ll.addFirst(1);
        System.out.println(ll);

        //Remove.
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
