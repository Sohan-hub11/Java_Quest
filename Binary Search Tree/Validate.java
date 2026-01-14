//Validate Binary search Tree.

package Binary_Search_Tree;

public class Validate {
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
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean isValid(Node root, Node max, Node min){
        if(root == null){
            return true;
        }

        if (max != null && max.data <= root.data){
            return false;
        } else if (min != null && min.data >= root.data){
            return false;
        }

        return isValid(root.left, root, min) && isValid(root.right, max, root);
    }
    public static void main(String[] args){
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        if(isValid(root, null, null)){
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
