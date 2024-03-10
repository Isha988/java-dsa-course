package T29BinarySearchTree1;

import java.util.ArrayList;

public class BST {
    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = build(values);
        inOrder(root);
        // System.out.println(search(root, 4).val);

        /*
         * delete(root, 5);
         * inOrder(root);
         */

        /*
         * System.out.println();
         * printInRange(root, 2, 4);
         */

        /* 
        System.out.println();
        paths(root);
         */

        // System.out.println(validateBst(root));     
        
        /* 
        System.out.println();
        Node mirror = mirror(root);
        inOrder(mirror);
        */
    }

    // ? Building BST -------------------------------------------------------------

    // Build a BST
    // O(n*h) = O(n log(n)) -> O(n^2)
    static Node build(int values[]) {
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        return root;
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        }

        if (value > root.val) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // ? Search in BST -------------------------------------------------------------

    // Search
    // O(h)
    static Node search(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            return search(root.left, key);
        }

        if (key > root.val) {
            return search(root.right, key);
        }

        return root;
    }

    // ? Delete from BST -------------------------------------------------------------

    // Delete
    static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {
            boolean leftChild = root.left != null;
            boolean rightChild = root.right != null;

            if (!leftChild && !rightChild) { // leaf node
                return null;
            } else if (leftChild && rightChild) { // two children
                // find in order successor: Left most element of right sub tree
                Node inOrderSuccessor = leftMostNode(root.right);
                // replace root with in order successor
                root.val = inOrderSuccessor.val;
                // delete in order successor
                root.right = delete(root.right, inOrderSuccessor.val);

            } else if (leftChild) { // only left child
                return root.left;
            } else if (rightChild) { // only right child
                return root.right;
            }

        }

        return root;
    }

    // Left most element of tree
    static Node leftMostNode(Node root) {
        if (root != null) {
            return null;
        }

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // ? Print in Range -------------------------------------------------------------
    /**
     * Given two number K1 and K2
     * Print value of all the element having value
     * such that k1 <= node.val <= k2
     */
    static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.val > k1) {
            printInRange(root.left, k1, k2);
        }
        if (root.val >= k1 && root.val <= k2) {
            System.out.print(root.val + " ");
        }
        if (root.val < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    // ? Root to leaf path -------------------------------------------------------------
    /**
     * Print all the paths from root to leaf
     */
    static ArrayList<Integer> path = new ArrayList<>();

    static void paths(Node root) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        paths(root.left);
        paths(root.right);

        if (root.left == null && root.right == null) { // leaf node
            System.out.println(path.toString());
        }

        path.remove(path.size() - 1);
    }

    // ? Validate BST --------------------------------------------------------------------
    /**
     * Check whether a given BST is valid or not
     */
    static boolean validateBst(Node root) {
        return validateBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean validateBst(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        return (min <= root.val && root.val <= max) && validateBst(root.left, min, root.val)
                && validateBst(root.right, root.val, max);

    }

    // ? Mirror of bst -------------------------------------------------------------
    /**
     * Find the mirror of given bst
     */
    static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // ? InOrder Traversal -------------------------------------------------------------

    // InOrder
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
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
