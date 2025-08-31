//Array as Function Arguments.

import java.util.*;
public class ArrayBasics2 {
    public static void update(int num[], int unchange){
        unchange = 10;
        for (int i = 0; i < num.length ; i++) {
            num[i] = num[i] + 1;
        }
        System.out.println("Value of the Unchanged Variable from update func" + unchange); //its dublicate the value and uses, without changing from the main function.
    }
    public static void main(String[] args){
        int num[] = {10, 20, 30};
        int unchange = 5;
        update(num,unchange);

        //print of number.
        for (int i = 0; i < num.length ; i++) {
            //Array with the help of call by reference, can change the value of the parent array also.
            System.out.println(num[i]);
        }
        System.out.println("Value of the Unchanged Variable from main func" + unchange);
        //the value(unchange variable) will never change as the value of main function will not change.
    }
}

