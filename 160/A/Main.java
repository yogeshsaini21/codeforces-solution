import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        System.out.println(solve(coins));
    }

    
    static int solve(int[] coins){
        Arrays.sort(coins);
        
        int total = Arrays.stream(coins).sum();
        int sum=0;
        for(int i=coins.length-1 ;i >=0 ;i--){
            sum+=coins[i];
            if(sum*2 > total){
                return coins.length-i;
            }
        }
        return 0;

         
    }
}