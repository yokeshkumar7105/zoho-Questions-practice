import java.util.*;

public class twistedPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int num = n;
        int rev =0;

        while(n>0){
            rev = rev*10+n%10;
            n/=10;
        }

        if(isPrime(num) && isPrime(rev)) System.out.println("Twisted Prime");
        else System.out.println("Not twisted prime");

        sc.close();
    }
}
