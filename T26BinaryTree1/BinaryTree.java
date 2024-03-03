package T26BinaryTree1;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // int[] preOrder = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] preOrder = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.build(preOrder);
        System.out.println(root.val);

        System.out.println("PreOrder: ");
        preOrderTraversal(root);
        System.out.println("\nInOrder: ");
        inOrderTraversal(root);
        System.out.println("\nPostOrder: ");
        postOrderTraversal(root);
        System.out.println("\nLevel Order: ");
        levelOrderTraversal(root);
        System.out.println("Height: " + height(root));
        System.out.println("Node Count: " + countNode(root));
        System.out.println("Node Sum: " + nodeSum(root));
    }

    /*
    * Given an array nodes, containing values of nodes of a binary tree in preOrder,
    * in which -1 means null node
    * WAP to build the tree from preOrder array
    */
    // O(n)
    static int index = -1;
    Node build(int[] preOrder){
        index++;
        // base case: null node
        if(preOrder[index] == -1){
            return null;
        }

        // creating current node
        Node node = new Node(preOrder[index]);
        // creating left subtree
        node.left = build(preOrder);
        // creating right subtree
        node.right = build(preOrder);

        // returning current node
        return node;
    }    

    // O(n)
    static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        // print root
        System.out.print(root.val + " ");
        // print left subtree
        preOrderTraversal(root.left);
        // print right subtree
        preOrderTraversal(root.right);
    }
    
    // O(n)
    static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        // print left subtree
        inOrderTraversal(root.left);
        // print root
        System.out.print(root.val + " ");
        // print right subtree
        inOrderTraversal(root.right);
    }

    // O(n)
    static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        // print left subtree
        postOrderTraversal(root.left);
        // print right subtree
        postOrderTraversal(root.right);
        // print root
        System.out.print(root.val + " ");
    }

    // O(n)
    static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // null represent ending of a level 

        while (!queue.isEmpty() && queue.peek() != null) {
            Node curr = queue.remove();
            System.out.print(curr.val + " ");
            
            // add left child in queue
            if(curr.left != null){
                queue.add(curr.left);
            }
            
            // add right child in queue
            if(curr.right != null){
                queue.add(curr.right);
            }
            
            // handling level ending
            if(queue.peek() == null){
                queue.remove();
                System.out.println();
                queue.add(null);
            }
        }
    }

    static int height(Node root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int countNode(Node root){
        if(root == null){
            return 0;
        }

        return 1 + countNode(root.left) + countNode(root.right);
    }

    static int nodeSum(Node root){
        if(root == null){
            return 0;
        }

        return root.val + nodeSum(root.left) + nodeSum(root.right);
    }
}