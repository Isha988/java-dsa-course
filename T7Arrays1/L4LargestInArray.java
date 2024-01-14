// find the largest number in an array
package T7Arrays1;

public class L4LargestInArray {
    public static void main(String[] args) {
        int array[] = {10, 45, 89, 67, 94, 56, 80, 12, 54, 88, 100};
        System.out.println(largestInArray(array));
    }

    static int largestInArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] > max)
                max = arr[i];
            // or max = Math.max(max, arr[i]);
        }

        return max;
    }
    
}