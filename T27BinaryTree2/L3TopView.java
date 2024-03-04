package T27BinaryTree2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class L3TopView {
    public static void main(String[] args) {
        //*Tree 1 */
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

        topView(node1);
    }

    static void topView(Node root){
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        Queue<Info> queue = new LinkedList<>();

        queue.add(new Info(root, 0));
        while (!queue.isEmpty()) {
            Info curr = queue.remove();

            // updating map
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }

            // adding left and right child
            if(curr.node.left != null){
                queue.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(curr.hd - 1, min);
            }
            if(curr.node.right != null){
                queue.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(curr.hd + 1, max);
            }
        }

        // printing top view
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).val + " ");
        }
    }

    static class Info {
        Node node; 
        int hd; // horizontal distance

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
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
