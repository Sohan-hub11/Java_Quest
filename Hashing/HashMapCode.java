//HashMap Implementation.

package Hashing;
import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{ //generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; //n
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("Unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
    }
    public static void main(String[] args){

    }
}
