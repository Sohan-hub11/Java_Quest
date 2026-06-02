/*

    1
    01
    101
    0101
    10101

 */

package Patterns;

public class Q13 {
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                for(int j=1; j<=i; j++){
                    if(j % 2 == 0)
                        System.out.print(1);
                    else
                        System.out.print(0);
                }
                System.out.println();
            } else {
                for(int j=1; j<=i; j++){
                    if(j % 2 == 0)
                        System.out.print(0);
                    else
                        System.out.print(1);
                }
                System.out.println();
            }
        }
    }
}
