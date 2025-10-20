//To find largest String.

package String;

public class LargestString {
    static String getLargest(String[] str){
        String largest = str[0];
        for(int i=1; i< str.length;i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        String fruits[] = {"Mango", "Apple", "Banana", "Watermelon"};
        System.out.println(getLargest(fruits));
    }
}
