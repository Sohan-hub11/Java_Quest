//Basic creation of Array.

package Arrays;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {

        //int arr[] = new int[50];
        //int marks[] = {90,88,99};
        //String name[] = {"Sohan", "Sintu", "Banti"};

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        marks[0] = sc.nextInt(); //math
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //phy

        System.out.println("Maths mark " + marks[0]);
        System.out.println("Chemistry mark " + marks[1]);
        System.out.println("Physics mark " + marks[2]);
        System.out.println("Length of an Array: " + marks.length);

    }
}
