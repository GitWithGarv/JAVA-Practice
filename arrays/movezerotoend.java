public class movezerotoend {

    public static void moveZerosToEnd(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }

        System.out.println("New array : ");

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,2,4,0,6};

        System.out.println("Old array : ");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        moveZerosToEnd(arr);
    }
}
