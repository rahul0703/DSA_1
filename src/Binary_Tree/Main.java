package Binary_Tree;

import Binary_Tree.Types.Node;
import Binary_Tree.Types.Node_randomPointer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Node tree = new Node(1);
        tree.setLeft(new Node(2));
        tree.setRight(new Node(3));
        tree.getLeft().setLeft(new Node(4));
        tree.getLeft().setRight(new Node(5));
//        tree.setRandom(tree.getLeft().getRight());
//        tree.getLeft().getLeft().setRandom(tree);
//        tree.getLeft().getRight().setRandom(tree.getRight());
//        clone_with_random_pointer(tree);
        inorder(tree);
    }

    public static void clone_with_random_pointer(Node_randomPointer node){
        Utility utility = new Utility();
        Node_randomPointer cloned_node = utility.clone_Tree_with_random_pointer(node);
        utility.Print_Tree_Pretty(cloned_node);
        utility.Print_Tree_Pretty(node);
    }
    public static void inorder(Node root){
        Utility utility = new Utility();
        ArrayList<Integer> list =utility.inorder(root);
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
