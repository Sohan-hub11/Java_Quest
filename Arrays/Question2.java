//Program to check if an array is sorted or not

package Arrays;

import java.util.Scanner;

public class Question2 {

//    public static int sorted(int num[]){
//        for(int i=1; i< num.length; i++){
//            if(num[i] < num[i-1]){
//                return -1;
//            }
//        }
//        return 1;
//    }

//*************More Optimized**************
    
    public static boolean issorted(int num[]){
        boolean check = true;
        for(int i = 1; i< num.length; i++){
            if(num[i] < num[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int num[] = {2, 11, 8, 11, 18};

//        int x = sorted(num);
//        if(x == -1){
//            System.out.println("The array is UnSorted");
//        }
//        else
//            System.out.println("The Array is Sorted");
        
        System.out.println("Is Sorted...."+issorted(num));
    }
}
