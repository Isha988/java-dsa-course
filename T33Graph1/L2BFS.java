package T33Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L2BFS {
    public static void main(String[] args) {
        /*
                   1---------3
                  /          | \
                 /           |  \ 
                0            |   5---------6
                 \           |  /
                  \          | / 
                   2---------4

        
        */
        ArrayList<Integer>[] graph = createGraph();
        BFS(graph);
    }

    // O(V + E)
    static void BFS(ArrayList<Integer>[] graph){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        boolean[] visited = new boolean[graph.length]; 

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

    static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure  
        /*
                   1---------3
                  /          | \
                 /           |  \ 
                0            |   5---------6
                 \           |  /
                  \          | / 
                   2---------4

        
        */
        int V = 7;
        ArrayList<Integer> graph[] = new ArrayList[V];
       
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Integer>();
        }
        
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 3, 5);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);

        return graph;
    }

    static void addEdge(ArrayList<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
        graph[dest].add(src);
    }
}
