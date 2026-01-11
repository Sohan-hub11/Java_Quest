//Queue Implementation using Java Collection Framework.

package Queue;

import java.util.*;

public class QueueD {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        //All Operations are O(1).
        
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
