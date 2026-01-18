/*
*
 *
  *
   *
    *
*/
package Patterns;

public class Q2 {
    public static void main(String[] args){
        int k = 0;
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                if(j == k){
                    System.out.print("*");
                    k++;
                    break;
                }
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
