/**
 * eg 
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   6 
        k = 3
        ans = 4 5 6 
 */
package T28BinaryTree3;

public class L1KLevel {
    public static void main(String[] args) {
        //*Tree */
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

        kthLevel(node1, 3);
    }
    
    static void kthLevel(Node root, int k){
        kthLevel(root, k, 1);
    }
    // O(n)
    static void kthLevel(Node root, int k, int level){
        if(root == null || k < level){
            return;
        }

        if(k == level){
            System.out.print(root.val + " ");
        }
        kthLevel(root.left, k, level + 1);
        kthLevel(root.right, k, level + 1);
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