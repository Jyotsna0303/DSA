public class KDistanceNode {
    public static void main(String args[]){
        Node root=new Node(10);
        root.left=new Node(30);
        root.left.left=new Node(35);
        root.right=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(29);
        System.out.println("K Distance Nodes: " );
        printNodesKDistance(root, 2);
    } 

    //Time Complexity=O(n), n=number of nodes
    //Space= O(h), h=height of tree
    

    public static void  printNodesKDistance(Node root, int k){
        if(root==null) return;
        if (k==0){
            System.out.print(root.key+ " ");
        }
        else{
            printNodesKDistance(root.left, k-1);
            printNodesKDistance(root.right, k-1);
        }
       
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
