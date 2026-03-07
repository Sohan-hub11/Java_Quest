//Maximum Sliding Window.

package Heaps;
import java.util.*;
public class MaxSlidingWindow {
    public static class Num implements Comparable<Num>{
        int number;
        int idx;
        public Num(int number, int idx){
            this.number = number;
            this.idx = idx;
        }

        @Override
        public int compareTo(Num n2){
            return n2.number - this.number;
        }
    }
    public static void main(String[] args){
        int[] num = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int [] ans = new int[num.length - k+1];

        PriorityQueue<Num> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(new Num(num[i], i));
        }

        ans[0] = pq.peek().number;
        for(int i=k; i< num.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Num(num[i], i));
            ans[i-k+1] = pq.peek().number;
        }

        for(int i=0; i<k; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
