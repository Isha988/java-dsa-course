package T9BasicSorting;

public class L5CountSort {
    public static void main(String[] args) {
        int arr1[] = { 3, 8, 8, 12, 10, 12, 3};
        countSort(arr1, 0, 12);
        printArray(arr1);

        int arr2[] = { 3, 8, 8, 12, 10, 12, 3};
        countSort(arr2, 3, 12);
        printArray(arr2);
    }

    // array element need to be positive
    static void countSort(int arr[], int maxElement){
        // initialize count array
        int count[] = new int[maxElement + 1];
        
        // filling count array with frequency of each element
        for(int num: arr){
            count[num]++;
        }

        // refilling given array in sorted order
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k] = i;
                k++;
            }
        }
    }

        // array element need to be positive
        static void countSort(int arr[], int minElement, int maxElement){
            // initialize count array
            int count[] = new int[maxElement - minElement + 1];
            
            // filling count array with frequency of each element
            for(int num: arr){
                count[num - minElement]++;
            }
    
            // refilling given array in sorted order
            int k = 0;
            for(int i = 0; i < count.length; i++){
                for(int j = 0; j < count[i]; j++){
                    arr[k] = i + minElement;
                    k++;
                }
            }
        }

    // print array
    static void printArray(int arr[]){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}