// Find the index of given element in a given array
package T7Arrays1;

public class L3LinearSearch {
    public static void main(String[] args) {
        int array[] = {10, 45, 89, 67, 94, 56, 80, 12, 54, 88};
        int element = 88;

        int index = linearSearch(array, element);

        if(index == -1)
            System.out.println("Element does not exist in array");
        else
            System.out.println("Element is at: " + index);
    }
    
    static int linearSearch(int arr[], int ele){
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] == ele)
                return i;
        }

        return -1;
    }
}