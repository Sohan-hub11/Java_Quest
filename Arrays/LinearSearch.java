//Linear Search.

package Arrays;
import java.util.*;
public class LinearSearch {

    public static int linearsearch(int num[], int key){
        for(int i = 0; i< num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        System.out.println("Enter Number..");
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the value to find..");
        int key = sc.nextInt();

        int index = linearsearch(num,key);
        if(index == -1){
            System.out.println("Number Not Found");
        }
        else
            System.out.println("Number Found at index " + index);
    }
}
