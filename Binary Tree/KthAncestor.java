//Kth Ancestor of a Node.

package Binary_Tree;

public class KthAncestor {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int kAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftSide = kAncestor(root.left, n, k);
        int rightSide = kAncestor(root.right, n, k);

        if(leftSide == -1 && rightSide == -1){
            return -1;
        }

        int max = Math.max(leftSide,rightSide);
        if (max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        int n = 5, k = 1;
        kAncestor(root, n, k);
    }

}
