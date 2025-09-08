public class copingArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = new int[a.length];

        System.out.print("Array a : ");
        for(int num : a){
            System.out.print(num + "\t");
        }
        System.out.println("");

        for(int i = 0 ; i < b.length ; i++){
            b[i] = a[i];
        }

        System.out.print("Copied Array b :");


        for(int num : b){
            System.out.print(num +"\t");
        }
    }
}