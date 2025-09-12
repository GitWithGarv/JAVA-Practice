public class quickSort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high ; j++){
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high){
        if (low < high) {
            int pivot_index = partition(arr, low, high);

            quicksort(arr, low, pivot_index-1);
            quicksort(arr, pivot_index+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,5,7,3,6,9,8};
        int n = arr.length;

        System.out.println("Unsorted Array:");
        for(int i = 0; i<n ;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        quicksort(arr, 0 , n-1);

        System.out.println("Sorted Array:");
        for(int i = 0; i<n ;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}



/*
 * Worst case time complexity :- O(n^2)
 * Average case time complexity :- O(n*logn)
 * 
 * merge sort is used over quick sort because it takes less T.C in worst case. But in merge sort extra space is used, so if you dont want to use extra space then you should use quick sort.
 */