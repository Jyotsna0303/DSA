public class HeightOfTree {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(29);
        System.out.println("Height: " +  heightTree(root));
       
    } 

    //Recursive solution
    //O(n)=Time n=number of nodes
    //O(h)= auxillary space, worst case there will be O(h+1) function call in the stack
    public static int heightTree(Node root){
      
        if (root!=null){
            return Math.max(heightTree(root.left), heightTree(root.right))+1;
        }
        return 0;
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

