//Mirror Problem in Binary search Tree.

package Binary_Search_Tree;

public class Mirror {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);

        root.left = rights;
        root.right = lefts;

        return root;
    }
    public static void main(String[] args){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Original Tree");
        inOrder(root);
        System.out.println();

        System.out.println("Mirror Tree");
        root = mirror(root);
        inOrder(root);
    }
}
