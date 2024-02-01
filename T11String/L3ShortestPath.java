/*
    Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
    "WNEENESENNN"
 */
package T11String;

public class L3ShortestPath {
    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println(shortestPath(directions));
    }

    static double shortestPath(String directions){
        int x = 0;
        int y = 0;

        for(int i = 0; i < directions.length(); i++){
            switch (directions.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            
                default:
                    break;
            }
        }

        double displacement = Math.sqrt(x*x + y*y);
        return displacement; 
    }
}