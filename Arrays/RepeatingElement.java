package Arrays;
import java.util.*;
public class RepeatingElement {
    static int repeated(int num[]){
        int len = num.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(num[i] == num[j]){
                    return num[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int num[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(repeated(num));
    }
}
