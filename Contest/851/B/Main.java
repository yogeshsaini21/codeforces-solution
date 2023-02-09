import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> str = new ArrayList<>();
        while(n>0){
            int t;
            t=sc.nextInt();
            int x = t/2;
            int y = t-x;
            int s1 = digitsum(x);
            int s2 = digitsum(y);
            if(Math.abs(s1-s2)>1){
                if(s1<s2){
                    x--;
                }
                else{
                    y--;
                }
            }
            str.add(x+" "+y);

        }

        for(int i=0;i<str.size();i++){
            System.out.println(str.get(i));
        }

        // long[] arr = new long[(int) n];
        // for(int i=0;i<n;i++){
        //     arr[i] =sc.nextInt();
        // }
        // // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<n;i++){
        //     solve(arr[i]); 
        // }
    }
    // public static void solve(long num){

    //     long v1;
    //     long v2;
    //     for(int i=1;i<=num;i++){

    //          v1=0;
    //         for(long j=1;j<=i;j++){
    //             v1+=j;
    //         }

    //         v2=0;
    //         for(long j=i+1;j<=num;j++){
    //             v2+=j;
    //         }
    //         if(Math.abs(digitsum(v1)-digitsum(v2))<=1){
    //             System.out.println(v1+" "+v2);
    //         }

    //     }
         

    // }
    public static int digitsum(int n){
        int sum = 0;
         
        while (n > 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
}
