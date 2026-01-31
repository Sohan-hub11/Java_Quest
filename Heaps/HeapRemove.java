//Deletion in Heap

package Heaps;

import java.util.ArrayList;

public class HeapRemove {
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
        } //O(1)

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if(left < list.size()-1 && list.get(minIdx) > list.get(left)){
                minIdx = left;
            }

            if(right < list.size()-1 && list.get(minIdx) > list.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove() {
            int data = list.get(0);

            //swap 1st and last idx.
            int temp = list.get(0);
            list.set(0, list.get(list.size()-1));
            list.set(list.size()-1, temp);

            //remove last
            list.remove(list.size()-1);

            //Heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();

        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
