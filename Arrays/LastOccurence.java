//Program to find the last occurrence of element x in a given array

package Arrays;
import java.util.*;
public class LastOccurence {
    public static int lastoccurence(int num[], int x){
        int lastcount = -1;
        for(int i = 0; i<num.length; i++){
            if(num[i] == x){
                lastcount = i;
            }
        }
        return lastcount;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = {2,11,8,11,18};
        System.out.println("Enter the element : ");
        int x = sc.nextInt();

        System.out.println("Last Occurence of element "+x+ " is in index "+lastoccurence(num,x));
    }
}
