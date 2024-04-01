package T35Graph3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class L1TopologicalSortBFS {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        topologicalSort(graph);   
    }

    static void topologicalSort(ArrayList<Integer>[] graph){
        // calculate in degree of each node
        int[] inDegree = new int[graph.length];
        for(ArrayList<Integer> neighborList: graph){
            for(int neighbor: neighborList){
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        // Initializing queue with node having in degree zero
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        // BFS traversal
        while (!queue.isEmpty()) {
            int curr = queue.remove();
            System.out.print(curr +  " "); // Printing topological sorted order

            for(int neighbor: graph[curr]){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.add(neighbor);
                }
            }
        }
    }
    
    static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure
        /*
            1 <----- 3 <------- 2
            ^                   ^
            |                   |
            |                   |
            |                   |  
            4 -----> 0 <------- 5
        */
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        addEdge(graph, 2, 3);
        addEdge(graph, 3, 1);
        addEdge(graph, 4, 0);
        addEdge(graph, 4, 1);
        addEdge(graph, 5, 0);
        addEdge(graph, 5, 2);


        return graph;
    }

    static void addEdge(ArrayList<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
    }
}