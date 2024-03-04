/**
 Subtree of another Tree
 Given the roots of two binary trees root and subRoot, 
 return true 
 if there is a subtree of root with the same structure and node values of subRoot 
 and false otherwise.

 Example: 
 Tree 
             1
            / \
           2   3
          / \   \
         4   5   6 
 Subtree
           2  
          / \  
         4   5
 Ans: true         
 */
package T27BinaryTree2;

public class L2Subtree {
    public static void main(String[] args) {
        //* Tree
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   6 
        // Creating nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        // Connecting nodes to build the tree
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        //* Subtree
        //    2  
        //   / \  
        //  4   5
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(node1, subRoot));
    }

    static boolean isSubtree(Node root, Node subRoot){
        if(root == null ) {
            return subRoot == null;
        }    

        if(isSubtreeEquals(root, subRoot)) {
            return true;
        };

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static boolean isSubtreeEquals(Node root, Node subRoot){
        if(root == null && subRoot == null) {
            return true;
        } else if(root == null || subRoot == null){
            return false;
        }

        return (root.val == subRoot.val) 
                && isSubtreeEquals(root.left, subRoot.left) 
                && isSubtree(root.right, subRoot.right); 
    }

    static class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val){
            this.val = val;
        }
    }
}