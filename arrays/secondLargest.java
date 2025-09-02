public class secondLargest {

    public static int secondlargest(int []arr){
        int max = -1;
        int secMax = -1;
        for(int num : arr){
            if (num > max) {
                secMax = max;
                max = num;
            }else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int arr[] = {13,45,34,36,22,5};

        int res = secondlargest(arr);

        System.out.println("Second largest element is : "+res);
    }
}