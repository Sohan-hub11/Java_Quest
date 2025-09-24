//Program to count the number of occurrences of element x in a given array

package Arrays;
import java.util.Scanner;
public class FrequencyCount {
    public static int freqcount(int arr[], int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        printarray(arr);
        System.out.println("Enter the element x to count : ");
        int x = sc.nextInt();

        System.out.println("The number of Occurence of element "+x +"in the array : "+freqcount(arr,x));
    }
}
