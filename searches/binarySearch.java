package searches;

public class binarySearch {

    public static void selectionSort(int []arr){
        int n = arr.length;
        for(int i = 0; i <= n-2; i++){
            int min = i;
            for(int j = i; j < n-1; j++){
                if(arr[j] < arr[min])
                min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static int binarysearch(int arr[], int target){
        int left = 0; 
        int right = arr.length-1;
        
        while (left <= right) {
            int mid = left + (right-left) / 2;

            if (arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,55,5,35,34,6,42};
        int target = 34;

        selectionSort(arr);               // this will sort the array in ascending order then only binary search will work
        
        int res = binarysearch(arr, target);

        System.out.println("Element found at index : " + res);
    }
}
