import java.util.HashMap;

public class twosum {

    public static int[] two_sum(int arr[], int target, int n){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int more = target - num;
            if (mpp.containsKey(more)) {
                return new int[] {mpp.get(more) , i};
            }
            mpp.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,6,8,9};
        int target = 14;
        int n = arr.length;

        System.out.println("The array is :");

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int res[] = two_sum(arr, target, n);

        System.out.println("The 2 indexes are :");

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
