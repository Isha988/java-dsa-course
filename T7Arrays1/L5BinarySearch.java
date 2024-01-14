// Find the index of given element in a given sorted array
package T7Arrays1;

import java.util.Arrays;

public class L5BinarySearch {
    public static void main(String[] args) {
        int array[] = {10, 45, 89, 67, 94, 56, 80, 12, 54, 88, 100};
        Arrays.sort(array);
        System.out.println(binarySearch(array, 45));
    }

    static int binarySearch(int arr[], int key){
        int l = 0;
        int h = arr.length - 1;
        
        while (l <= h) {
            int mid = (l + h) / 2;
            int curr = arr[mid];
            if(key == curr)
                return mid;
            else if(key < curr)
                h = mid - 1;
            else
                l = mid + 1; 
        }

        return -1;
    }
}
