package T9BasicSorting;

public class L1BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 4};
        bubbleSort(arr);

        // print array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        } 
    }
    
    // O(n2)
    static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    // swap arr[i] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // by adding flag to check swapping, 
    // this bubble sort become adaptive.  
    static void bubbleSort1(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int flag = 0; // flag to check whether there is any swapping done or not
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    // swap arr[i] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                return;
            }
        }
    }
}