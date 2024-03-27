package T33Graph1;

import java.util.ArrayList;

public class L1AdjacencyList {
    public static void main(String[] args) {
        /*
            0 ------(5)------1
                            / \
                           /   \       
                         (1)   (3)
                         /       \
                        /         \
                       2----(1)----3
                       |
                       |
                      (2)
                       |
                       |
                       4

        */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // changing graph[i] from null to empty ArrayList
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        // 0 Vertex
        graph[0].add(new Edge(0,1,5));

        // 1 Vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 Vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,3));

        // 3 Vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 Vertex
        graph[4].add(new Edge(4,2,2));

        // 2's Neighbors
        for(int i = 0; i < graph[2].size(); i++){
            System.out.println(graph[2].get(i).dist);
        }
    }

    static class Edge {
        int src;
        int dist;
        int weight;

        Edge(int src, int destination, int weight){
            this.src = src;
            this.dist = destination;
            this.weight = weight;
        }
    }
}
