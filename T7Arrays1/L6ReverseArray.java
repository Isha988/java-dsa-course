/* Reverse the given array
 * A = [1, 2, 9, 4, 5]
 * After reverse
 * A = [5, 4, 9, 2, 1] 
 */
package T7Arrays1;

public class L6ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 7, 9, 67};
        reverse1(arr);
        reverse2(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // Approach 1: using extra array
    static void reverse1(int arr[]){
        int len = arr.length;
        int arr2[] = new int[len];

        for(int i = 0, j = len -1 ; i < len; i++, j--){
            arr2[j] = arr[i];
        }

        for(int i = 0 ; i < len; i++){
            arr[i] = arr2[i];
        }
    }
    // Approach 2: in place reversal 
    static void reverse2(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swapping left and right elements
            arr[right] = returnFirst(arr[left], arr[left] = arr[right]);
            left++;
            right--;
        }

    }

    // function that return first argument
    static int returnFirst(int a, int b){
        return a;
    }
}
