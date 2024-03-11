/**
 * Generate a balanced bst from given sorted array(InOrder Sequence),
 * eg: arr={3,5,6,8,10,11,12}
   8
  / \
 5   11
/ \   / \
3   6 10 12
 */
package T30BinarySearchTree2;

public class L1SortedArrayToBalancedTree {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        Node root = generateBalancedBst(arr);
        preOrder(root);
    }

    static Node generateBalancedBst(int[] arr) {
        return generateBalancedBST(arr, 0, arr.length - 1);
    }

    static Node generateBalancedBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start + (end - start) / 2;
        Node root = new Node(arr[mid]);
        root.left = generateBalancedBST(arr, start, mid - 1); 
        root.right = generateBalancedBST(arr, mid + 1, end);
        return root;
    }

    // PreOrder
    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static class Node {
        int val;
        Node left = null;
        Node right = null;

        Node(int val) {
            this.val = val;
        }
    }
}
