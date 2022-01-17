public class SizeOfTree {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(29);
        
        System.out.println("Size of tree: "+ sizeofTree(root) );
    }

    //Time=O(n)
    //space=O(h)
    public static int sizeofTree(Node root){
        if (root==null){
            return 0;
        }
        else
        return (sizeofTree(root.left)+sizeofTree(root.right)+1);
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