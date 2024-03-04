/**
 * Diameter of Tree
 * Diameter of tree is the longest path between two leaves
 * eg: 
 *     1
      / \
     2   3
    / \   \
   4   5   6 
   diameter = 5 (4,2,1,3,6)
 */
package T27BinaryTree2;

public class L1DiameterOfTree {
    public static void main(String[] args) {
        //*Tree 1 */
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   6 
        // Creating nodes
        // Node node1 = new Node(1);
        // Node node2 = new Node(2);
        // Node node3 = new Node(3);
        // Node node4 = new Node(4);
        // Node node5 = new Node(5);
        // Node node6 = new Node(6);

        // // Connecting nodes to build the tree
        // node1.left = node2;
        // node1.right = node3;
        // node2.left = node4;
        // node2.right = node5;
        // node3.right = node6;
        
        //*Tree 2 */
        //          1
        //         / \
        //        2   3
        //       / \
        //      4   5
        //     /     \
        //    9       6
        //   /         \
        //  8           7
        // Creating nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);

        // Connecting nodes to build the tree
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node9;
        node9.left = node8;
        node5.right = node6;
        node6.right = node7;
      

        diameter(node1);
        System.out.println(diameter);
    }

    static class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val){
            this.val = val;
        }
    }

    // O(n)
    static int diameter = 0;
    static int diameter(Node root){ // this function return height and update diameter variable
        if(root == null) {
            return 0;
        }

        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        int currDiameter = 1 + leftHeight + rightHeight;
        
        diameter = Math.max(diameter, currDiameter);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
