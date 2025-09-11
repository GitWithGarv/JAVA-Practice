import java.util.*;

public class prime_no {

    public static boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n) ;i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        boolean res = isPrime(n);
        System.out.println(n + " is a prime number "+res);
        sc.close();
    }
}
