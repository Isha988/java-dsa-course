/*
 * Shortest path from a source to all vertices 
 */
package T35Graph3;

import java.util.ArrayList;

public class L3Dijkstra {
    public static void main(String[] args) {
        
    }
    

    static ArrayList<Edge>[] createGraph(){
        // This function create following graph structure
        /*
            1 ------(7)-----> 3
            ^                 | 
            |                 | 
            |                 |   
           (2)               (1)   
            |                 |
            |                 |
            0                 5
            
        */
        int V = 6;
    }

    class Edge{
        int src; // source
        int dest; // destination
        int wt; // weight  
    }
}