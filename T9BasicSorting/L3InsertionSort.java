package T9BasicSorting;

public class L3InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 4};
        insertionSort(arr);

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    // O(n2)
    static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int x = arr[i];

            // either this
            int j = i - 1;
            while(j >= 0 && arr[j] > x){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;

            // or this
            // for(int j = i - 1; j >= 0; j--){
            //     if(arr[j] > x){
            //         arr[j + 1] = arr[j];
            //         arr[j] = x;
            //     }
            // }
        }
    }
}