//Finding peek in Heap

package Heaps;

import java.util.*;

public class HeapPeek {
    static class Heap{
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data){ //O(log n)
            list.add(data);
            int childIdx = list.size()-1;
            int parentIdx = (childIdx - 1)/2;

            while (list.get(childIdx) < list.get(parentIdx)){
                int temp = list.get(childIdx);
                list.set(childIdx, list.get(parentIdx));
                list.set(parentIdx, temp);

                childIdx = parentIdx;
                parentIdx = (childIdx - 1)/2;
            }
        }
        public int peek(){ //O(1)
            return list.get(0);
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();

        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);

        System.out.println(h.peek());
    }
}
