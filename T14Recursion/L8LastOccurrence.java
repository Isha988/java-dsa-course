/*
 * WAF to find the last occurrence of an element in an array
 * Example: A = 8 3 6 9 5 10 2 5 3
 * Ques: Key = 5 Output: 7
 */
package T14Recursion;

public class L8LastOccurrence {
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurrence(arr, 0, 5));
    }

    // O(n)
    static int lastOccurrence(int arr[], int i, int key){ // i is current index of array
        
        if(i == arr.length){
            return -1;
        }

        int lastOccurrence = lastOccurrence(arr, i + 1, key);
        
        if(lastOccurrence == -1){
            return arr[i] == key ? i : -1;
        }

        return lastOccurrence;
    }
}
