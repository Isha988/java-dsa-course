/* Print all the subarrays of an given array
 * Example:
 * A = [2,4,6,8,10]
 * subarrays:
 * 2, 4, 6, 8, 10 < - subarrays of size 1
 * 2 4, 4 6, 6 8, 8 10 < - subarrays of size 2
 * 2 4 6, 4 6 8, 6 8 10 < - subarrays of size 3
 * 2 4 6 8, 4 6 8 10 < - subarrays of size 4
 * 2 4 6 8 10 < - subarrays of size 5
 */
package T7Arrays1;

public class L8PrintSubarrays {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        subarraysOfArray(arr);
    }

    static void subarraysOfArray(int arr[]){
        for(int size = 1; size <= arr.length; size++){
            for(int i = 0; i + size <= arr.length; i++){
                printSubarray(arr, i, size);
            }
            System.out.println();
        }
    }

    static void printSubarray(int arr[], int i, int size){
        System.out.print("[ ");
        for(int j = i; j < i + size; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.print("]");
    }
}
