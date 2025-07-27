import java.util.*;

public class makeDistinctDigits {
    public static int [] distinctDigitsInArray(int [] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int num:arr){
            while(num>0){
                int rem = num%10;
                num/=10;
                hs.add(rem);
            }
        }
        //System.out.println(hs);
        return hs.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int [] ans =distinctDigitsInArray(arr);
        for(int num:ans){
            System.out.print(num+" ");
        }
        sc.close();
    }
}

// n = 3
// arr = [131, 11, 48]
// 1 3 4 8 
