import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int n=sc.nextInt();
        int m = n;
        int rev=0;
        int r;

        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        
        if(rev==m)
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");

        sc.close();
    }
}
