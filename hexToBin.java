import java.util.*;
public class hexToBin {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int dec = Integer.parseInt(s,16);
        System.out.println(Integer.toBinaryString(dec));
        sc.close();
    }
}
