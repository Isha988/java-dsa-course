/*
 * WAF to find the first occurrence of an element in an array
 * Example: A = 8 3 6 9 5 10 2 5 3
 * Ques: Key = 5 Output: 4
 */
package T14Recursion;

public class L7FirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurrence(arr, 0, 5));
    }

    // O(n)
    static int firstOccurrence(int arr[], int i, int key){ // i is current index of array
        
        if(i == arr.length){
            return -1;
        }

        return arr[i] == key ? i : firstOccurrence(arr, i + 1, key);
    }
}
