package T34Graph2;

import java.util.ArrayList;
import java.util.Stack;

public class L5TopologicalSort {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        topologicalSort(graph);
    }

    // O(V+E)
    static void topologicalSort(ArrayList<Integer>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                topologicalSortUtil(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    static void topologicalSortUtil(ArrayList<Integer>[] graph, int curr, boolean[] visited, Stack<Integer> stack){
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            int neighbor = graph[curr].get(i);
            if(!visited[neighbor]){
                topologicalSortUtil(graph, neighbor, visited, stack);
            }
        }

        stack.push(curr);
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