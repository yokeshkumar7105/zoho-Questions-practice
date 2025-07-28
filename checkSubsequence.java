import java.util.*;

public class checkSubsequence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int i=0;
        int j=0;

        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println(i==s1.length());

        sc.close();
    }
}
