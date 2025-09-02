public class checkSortedArray {

    public static boolean check(int []arr){
        int n = arr.length;

        for(int i = 1 ; i < n ; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,12,20,25,50};

        boolean res = check(arr);

        System.out.println("The given array is sorted : "+res);
    }
}
