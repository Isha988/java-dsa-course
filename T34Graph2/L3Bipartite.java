/*
? Note:
* If graph doesn't have cycle then it is a Bipartite for sure.
*/

package T34Graph2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class L3Bipartite {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        System.out.println(isBipartite(graph));
    }

    static boolean isBipartite(ArrayList<Integer>[] graph){
        int color[] = new int[graph.length]; // work similar to visited array
        Arrays.fill(color, -1); // no color

        for(int i = 0; i < graph.length; i++){
            if(color[i] == -1 && isBipartiteUtil(graph, i, color)){
                return true;
            }
        }

        return false;
    }

    // O(V + E)
    static boolean isBipartiteUtil(ArrayList<Integer>[] graph, int src, int[] color){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        color[src] = 0; // adding src node in set0;

        while(!queue.isEmpty()){
            int curr = queue.remove();
        
            for(int neighbor: graph[curr]){
                // case 3: neighbor doesn't have any color assign
                if(color[neighbor] == -1){
                    color[neighbor] = (color[curr] + 1) % 2; // give opposite color of curr node
                    queue.add(neighbor);
                }
                // case 1: neighbor with same color
                else if(color[neighbor] == color[curr]){
                    return false;
                }
                // case 2 neighbor with opposite color
                // continue;
            }
        }
        return true;
    }

     static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure
        /*
         *        0---------2
         *       /          |
         *      /           |
         *     1            |
         *      \           |
         *       \          |
         *        3---------4
         * 
         */
        int V = 5;
        ArrayList<Integer> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);

        return graph;
    }

    static void addEdge(ArrayList<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
        graph[dest].add(src);
    }
}
