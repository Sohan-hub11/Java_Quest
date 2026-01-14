//Print Range in Binary search Tree.

package Binary_Search_Tree;

public class PrintRange {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //Left SubTree.
            root.left = insert(root.left, val);
        } else {
            //right SubTree.
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        //Case 1.
        if(k1 <= root.data && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        }
        //Case 2.
        if(root.data < k1){
            printRange(root.left, k1, k2);
        } else if (root.data > k2) { //Case 3.
            printRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14 };
        int k1 = 5, k2 = 12;
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        printRange(root, k1, k2);
    }
}
