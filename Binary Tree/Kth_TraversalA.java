//Kth Traversal(Approach 1).

package Binary_Tree;

import java.util.*;

public class Kth_TraversalA {
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


    public static void kthFinder(Node root, int level){
        if(root == null){
            return;
        }

        Queue q = new LinkedList();

        q.add(root);
        q.add(null);
        int k = 1;

        while (!q.isEmpty()){
            Node currNode =(Node) q.remove();
            if(currNode == null){
                k++;
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            } else {
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
                if(k == level){ //matches the kth level
                    System.out.print(currNode.data + " ");
                }
            }

        }
    }
    public static void main(String[] args){
        //int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthFinder(root, 3);
    }
}
