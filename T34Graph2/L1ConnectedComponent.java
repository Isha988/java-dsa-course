/*
 * Rewriting dfs and bfs function for graph with multiple connected components
 */
package T34Graph2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L1ConnectedComponent {
    public static void main(String[] args) {
        /*
            0 -------- 1

            2 -------- 3
        */
        ArrayList<Integer>[] graph = createGraph();
        BFS(graph);
        System.out.println();
        DFS(graph);
    }

    // BFS ==========================================================================================

    static void BFS(ArrayList<Integer>[] graph){
        boolean[] visited = new boolean[graph.length]; 
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                BFSUtil(graph, i, visited);
            }
        }
    }

    static void BFSUtil(ArrayList<Integer>[] graph, int src, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    queue.add(graph[curr].get(i));
                }
            }

        }
    }

    // DFS ===========================================================================================

    static void DFS(ArrayList<Integer>[] graph){
        boolean[] visited = new boolean[graph.length]; 
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                DFSUtil(graph, i, visited);
            }
        }
    }

    // O(V + E)
    static void DFSUtil(ArrayList<Integer>[] graph, int curr, boolean[] visited){
        // visit the current node
        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            if(!visited[graph[curr].get(i)]){
                DFSUtil(graph, graph[curr].get(i), visited);
            }
        }
    }

    // Create Graph ==================================================================================
    
    static ArrayList<Integer>[] createGraph(){
        /*
            0 -------- 1

            2 -------- 3
        */
        int V = 4;
        ArrayList<Integer>[] graph = new ArrayList[4];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Integer>();
        }
        graph[0].add(1);
        graph[1].add(0);
        graph[2].add(3);
        graph[3].add(2);

        return graph;
    }
}
