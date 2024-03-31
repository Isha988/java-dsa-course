package T34Graph2;

import java.util.ArrayList;

public class L2DetectCycleUndirected {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        System.out.println(detectCycle(graph));
    }

    static boolean detectCycle(ArrayList<Integer>[] graph){
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!visited[i] && detectCycleUtil(graph, i, -1, visited)){
                return true;
                // cycle exist in one of the part
            }
        }
        return false;
    }

    static boolean detectCycleUtil(ArrayList<Integer>[] graph, int curr, int par, boolean[] visited){
        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++ ){
            int neighbor = graph[curr].get(i);

            // case 3: neighbor node is not visited
            if(!visited[neighbor]){
                if(detectCycleUtil(graph, neighbor, curr, visited)){
                    return true;
                }
            }
            // Case 1: neighbor is visited and is not parent 
            else if(visited[neighbor] && neighbor != par){
                return true;
            }
            // case 2: neighbor is visited and is parent 
            // continue; 
        }
        return false;
    }

    static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure
        /*
         *        0---------3
         *       /|         |
         *      / |         |
         *     1  |         |
         *      \ |         |
         *       \|         |
         *        2         4
         * 
         * 
         */
        int V = 5;
        ArrayList<Integer> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 3, 4);

        return graph;
    }

    static void addEdge(ArrayList<Integer>[] graph, int src, int dest) {
        graph[src].add(dest);
        graph[dest].add(src);
    }
}
