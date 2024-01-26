package T9BasicSorting;

public class L2SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 4};
        selectionSort(arr);

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    // O(n2)
    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int k = i; // index of smallest element of unsorted array

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[k]){
                    k = j;
                }
            }

            // swap arr[i] and arr[k]
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}