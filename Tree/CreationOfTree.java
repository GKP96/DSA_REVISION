package Tree;
import java.util.*;

class Node {
    int data;
    Node left = null, right = null;

    public Node(int data) {
        this.data = data;
    }
}

public class CreationOfTree {
    public static Node insert(Node root, int data) {
        if(root == null)return new Node(data);
        if(root.data <  data){
            root.left = insert(root.left, data);
        }
        if(root.data > data){
            root.right = insert(root.right, data);
        }
        return root;
    }
    static Node createBST(ArrayList<Integer> list){
        Node root = null;
        for(int i:list){
            root = insert(root, i);
        }
        return root;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        Node root = createBST(list);
        inorder(root);
    }
    static void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
}
