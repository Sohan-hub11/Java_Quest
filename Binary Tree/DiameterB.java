//Diameter of a Tree(Approach 2).
//Time-Complexity -- O(n)

package Binary_Tree;

public class DiameterB {
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
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info lInfo = diameter(root.left);
        Info rInfo = diameter(root.right);

        int finalDiam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht+ rInfo.ht+1);
        int finalHt = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(finalDiam, finalHt);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root).diam);
    }
}
