public class bubbleSort {

    public static void bubblesort(int []arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String []args){
        int arr[] = {13,45,34,36,22,5};
        bubblesort(arr);

        for(int num: arr){
            System.out.println(num+" ");
        }
    }
}
