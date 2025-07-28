import java.util.*;

public class sortElementByFreq{
    public static void sortElements(int [] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        // System.out.println(mp);
        int mpsize = mp.size();
        for(int i=0;i<mpsize;i++){
            int maxNum = Integer.MIN_VALUE;
            int maxCount = Integer.MIN_VALUE;

            for(int j:mp.keySet()){
                if(mp.get(j)>maxCount){
                    maxNum = j;
                    maxCount = mp.get(j);
                }
            }
            for(int k=0;k<maxCount;k++){
                System.out.print(maxNum+" ");
            }
            mp.remove(maxNum);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortElements(arr);
        sc.close();
    }
}