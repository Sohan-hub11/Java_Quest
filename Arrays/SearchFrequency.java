//Check if number is present in array or not in the given Q queries.

package Arrays;
import java.util.*;
public class SearchFrequency {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100001];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 5, 10001, 1100, 500, 11, 200};
        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter Number of Queries : ");
        int q = sc.nextInt();
        while(q > 0){
            System.out.print("Enter value to be searched : ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("Yes...Found");
            }
            else {
                System.out.println("No....not Found");
            }
            q--;
        }

    }
}
