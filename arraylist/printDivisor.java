import java.util.*;

public class printDivisor {

    static class solutions{
        public static List<Integer> getDivisor(int n){

            ArrayList<Integer> r = new ArrayList<>();

            for(int i = 1 ; i*i <= n ; i++){
                if (n % i == 0){
                    r.add(i);

                    if(i != n/i){
                        r.add(n/i);
                    }
                }
            }

            return r;
        }
    }
    public static void main(String[] args) {
        solutions s1 = new solutions();

        int n = 36;

        List<Integer> res =s1.getDivisor(n);

        System.out.println("Divisor of "+n+ " is :");
        for (int val : res){
            System.out.println(val+ " ");
        }
        System.out.println();
    }
}
