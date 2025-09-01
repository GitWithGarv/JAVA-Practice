package searches;

public class linearSearch {

    public static int linearsearch(int arr[], int num){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,55,5,35,34,6,42};
        int num = 34;
        
        int res = linearsearch(arr, num);

        System.out.println("Element found at index : " + res);
    }
}
