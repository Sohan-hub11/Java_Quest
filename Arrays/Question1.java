//Program to count the number of elements strictly greater than a value x

package Arrays;

import java.util.Scanner;

public class Question1 {
    public static int greater(int num[], int x){
        int count = 0;
        for(int i=0; i<num.length; i++){
            if(num[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = {2,11,8,11,18};
        System.out.print("Enter the element x : ");
        int x = sc.nextInt();

        System.out.println("Elements strictly greater than a value x is : "+greater(num,x));
    }
}
