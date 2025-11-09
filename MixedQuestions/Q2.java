//Party at Cruise -- 

package MixedQuestions;
import java.util.*;
public class Q2 {
    public static int findMax(int[] E, int[] L, int t){
        int max = 0;
        int sum = 0;

        //Traversing each every time interval for E[], L[].
        for(int i=0; i<t; i++){
            sum += E[i] - L[i];
            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] E = new int[t];
        for(int i=0; i<t; i++){
            E[i] = sc.nextInt();
        }
        int[] L = new int[t];
        for(int i=0; i<t; i++){
            L[i] = sc.nextInt();
        }
        int max = findMax(E, L, t);
        System.out.println(max);
    }
}
