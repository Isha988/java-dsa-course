package T34Graph2;

import java.util.ArrayList;

public class L4DetectCycleDirected {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        System.out.println(detectCycle(graph));
    }

    static boolean detectCycle(ArrayList<Integer>[] graph){
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++){
            boolean[] stack = new boolean[graph.length];
            if(!visited[i] && detectCycleUtil(graph, i, visited, stack)){
                return true;
            }
        }
        
        return false;
    }

    static boolean detectCycleUtil(ArrayList<Integer>[] graph, int curr, boolean[] visited, boolean[] stack){
        visited[curr] = true;
        stack[curr] = true;

        for(int neighbor: graph[curr]){
            if(stack[neighbor]){
                return true;
            }
            if(!visited[neighbor] && detectCycleUtil(graph, neighbor, visited, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure
        /*
            1 -----> 0 <--- 3
                     |      ^
                     |     /
                     |    /
                     |   /
                    \/  /
                     2 
        */
        int V = 4;
        ArrayList<Integer> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        addEdge(graph, 0, 2);
        addEdge(graph, 1, 0);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 0);

        return graph;
    }

    static void addEdge(ArrayList<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
    }
}