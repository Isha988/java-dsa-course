package T102DArray;

public class L1Matrix {
    public static void main(String[] args) {
        // declaring a matrix of 4 X 5
        int matrix[][] = new int[4][5];

        // initializing matrix;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 10);

                // can use to take input from user;
                // matrix[i][j] = sc.nextInt();
            }
        }

        // output matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, (int) (Math.random() * 10));

    }

    static boolean search(int matrix[][], int x){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == x){
                    System.out.println(x + " found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(x + " not found");
        return false;
    }
    
}