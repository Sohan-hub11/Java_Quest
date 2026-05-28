/*

    *********
     *******
      *****
       ***
        *
     Reverse
  Pyramid Pattern

*/

package Patterns;

public class Q10 {
    public static void main(String[] args){
        int n = 5;

        for(int i=4; i >=0; i--){
          for(int j=1; j<= 5-i-1; j++){
              System.out.print(" ");
          }
          for(int j=1; j<= (2*i+1); j++){
                System.out.print("*");
          }
            System.out.println();
        }
    }
}
