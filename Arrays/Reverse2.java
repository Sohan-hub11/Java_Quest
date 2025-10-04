package Arrays;

public class Reverse2 {
    static int[] reverseArray(int[] arr){
        int len = arr.length;
        int[] ans = new int[len];

//  Transverse the Original Array into Reverse Direction.
//        int j = 0;
//        for(int i=len-1; i>=0; i--){
//            ans[j++] = arr[i];
//        }

//  Different Approach.      
        int i = len-1, j = 0;
        while(i >= 0){
            ans[j++] = arr[i--];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,11,22,5};
        int[] ans = reverseArray(arr);
        printArray(ans);
    }
}
