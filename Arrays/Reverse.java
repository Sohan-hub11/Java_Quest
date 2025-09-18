//Reverse

package Arrays;

import java.util.Scanner;

public class Reverse {
    public static void reversenum(int arr[]){
        int first = 0, last = arr.length-1;
        //Swap
        while(first < last){
            int temp =0;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first ++;
            last --;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the Array...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array..");
        reversenum(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

