public class LeftViewOfBinaryTree{
    static int maxLevel=0;
    public static void main(String args[]){
        
            Node root=new Node(10);
            root.left=new Node(30);
            root.left.left=new Node(35);
            root.right=new Node(40);
            root.right.right=new Node(50);
            root.right.right.right=new Node(29);
            System.out.println("Left View of a binary tree: " );
          
            leftViewBinaryTree(root,1);
          
    } 


    public static void leftViewBinaryTree(Node root, int level){
        if (root==null){
            return; 
        }
        if(maxLevel<level){
             System.out.print(root.key+" ");
             maxLevel++;
        }
       leftViewBinaryTree(root.left, level+1);
       leftViewBinaryTree(root.right, level+1);
    }

    
}
class Node{
    int key;
    Node left;
    Node right;
    public Node(int k){
        key=k;
    }  
}