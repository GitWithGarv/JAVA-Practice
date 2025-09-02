public class removeDuplicates {

    public static int removeDup(int arr[]){
        int n = arr.length;
        int i = 0;
        for(int j = 1 ; j < n ; j++){
            if (arr[j] != arr[i]) {
                arr[i++] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3};

        System.out.println("Length of the array with duplicates is : "+arr.length);
        
        int res = removeDup(arr);

        System.out.println("Length of the array without duplicates is : "+res);
    }
}
