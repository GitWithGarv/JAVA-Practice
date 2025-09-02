public class largestElement {

    public static int largestEle(int []arr){
        int n = arr.length;
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {13,45,34,36,22,5};

        int res = largestEle(arr);

        System.out.println("Largest element is : "+res);
    }
}
