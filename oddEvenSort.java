import java.util.*;

public class oddEvenSort {
    public static void oddevenSort(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            if(arr[high]%2 !=0){
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
                low++;
            }
            else{
                high--;
            }
        }

        if(arr[high]%2!=0){
            Arrays.sort(arr,0, high+1);
            reverse(arr,0,high);
            Arrays.sort(arr,high+1,arr.length);
        }
        else{
            Arrays.sort(arr,0,high);
            reverse(arr,0,high-1);
            Arrays.sort(arr,high,arr.length);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        oddevenSort(arr);
        sc.close();
    }
}
