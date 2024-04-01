/*
 * Print all path from source to destination in a given graph
 * example 
 * Graph:  
            1 <----- 3 <------- 2
            ^        ^          ^
            |        |          |
            |        |          |
            |        |          |  
            4 -----> 0 <------- 5
  * ans: 5031, 5231      
 */
package T35Graph3;

import java.util.ArrayList;

public class L2AllPath {
    public static void main(String[] args) {
        ArrayList<Integer>[] graph = createGraph();
        int src = 5, dest = 1;
        findAllPath(graph, src, dest, "");
    }

    // O(V ^ V) Exponential
    // ! Fails for graph with cycle
    static void findAllPath(ArrayList<Integer>[] graph, int src, int dest, String path){
        if(src == dest){
            System.out.println(path + src);
            return;
        }

        for(int neighbor: graph[src]){
            findAllPath(graph, neighbor, dest, path+src);  
        }
    }
    
     static ArrayList<Integer>[] createGraph() {
        // This function create following graph structure
        /*
            1 <----- 3 <------- 2
            ^        ^          ^
            |        |          |
            |        |          |
            |        |          |  
            4 -----> 0 <------- 5
        */
        int V = 6;
        ArrayList<Integer> graph[] = new ArrayList[V];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        addEdge(graph, 0, 3);
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