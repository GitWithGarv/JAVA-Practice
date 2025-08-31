public class insertionSort {

    public static void insertionsort(int []arr){
        int n = arr.length;
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String []args){
        int arr[] = {13,45,34,36,22,56};
        insertionsort(arr);

        for(int num: arr){
            System.out.println(num+" ");
        }
    }
}