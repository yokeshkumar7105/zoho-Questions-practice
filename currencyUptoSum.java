import java.util.*;

public class currencyUptoSum {

    public static void numberOfCurrency(int amt){
        int [] currency = {2000,500,200,100,50,20,10,5,1};
        int [] currCounter = new int[9];

        for(int i=0;i<9;i++){
            if(amt>=currency[i]){
                currCounter[i] = amt/currency[i];
                amt%=currency[i];
            }
        }
        for(int i=0;i<9;i++){
            if(currCounter[i] !=0){
                System.out.println(currency[i]+": "+currCounter[i]);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        numberOfCurrency(amt);
        sc.close();
    }
}
