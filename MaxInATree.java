//max in a binary tree

public class MaxInATree {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(29);
       
        System.out.println(maxinABinaryTree(root));
    }


    //constant work for each node so time=O(N)
    //space= O(H)
    public static int maxinABinaryTree(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(root.key, Math.max(maxinABinaryTree(root.left), maxinABinaryTree(root.right)));
        }
    }
    
      //for iterative solution use level order traversal using queue. //time complexity=O(n)//space=O(W) w=width of tree

}
class Node{
    int key;
    Node left;
    Node right;
    public Node(int k){
        key=k;
    }

    
}