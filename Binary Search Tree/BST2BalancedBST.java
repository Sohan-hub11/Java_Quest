//Convert BST to Balanced BST.

package Binary_Search_Tree;
import java.util.*;
public class BST2BalancedBST {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node balancedBST(ArrayList<Integer> arr, int st, int end){
        if(st > end){
            return null;
        }

        int mid = st + (end-st) / 2;
        Node root = new Node(arr.get(mid));
        root.left = balancedBST(arr, st, mid-1);
        root.right = balancedBST(arr, mid+1, end);

        return root;
    }

    public static void getInOrder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }

    public static Node balancedBST(Node root){
        //inOrder Sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root, inOrder);

        //Sorted -> Balanced BST
        return balancedBST(inOrder, 0, inOrder.size()-1);
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println("Given BST");
        preOrder(root);
        System.out.println();

        System.out.println("Balanced BST");
        root = balancedBST(root);
        preOrder(root);
    }
}
