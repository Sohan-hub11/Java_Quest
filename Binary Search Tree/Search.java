//Search in Binary search Tree.

package Binary_Search_Tree;

public class Search {
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
    public static boolean searchKey(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }
    public static void main(String[] args){
        int[] values = {5, 1, 3, 4, 2, 7};
        int key = 2;
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
        if(searchKey(root, key)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
