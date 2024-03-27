/*
Has Path ?
For given src & dest, tell if a path exists from src to dest
    example: src = 0, dest = 5
                   1---------3
                  /          | \
                 /           |  \ 
                0            |   5---------6
                 \           |  /
                  \          | / 
                   2---------4
    Output: True
*/
package T33Graph1;

import java.util.ArrayList;

public class L4HasPath {
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
        System.out.println(hasPath(graph, 0, 5, new boolean[graph.length]));
    }

    // O(V + E)
    static boolean hasPath(ArrayList<Integer>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }

        visited[src] = true;

        for(int i = 0; i < graph[src].size(); i++){
            int neighbor = graph[src].get(i);
            if(!visited[neighbor] && hasPath(graph, neighbor, dest, visited)){
                return true;
            }
        }

        return false;
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
