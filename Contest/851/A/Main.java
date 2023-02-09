import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            int[] array = new int[size];
            for(int j=0;j<size;j++){
                array[j] = sc.nextInt();
            }
            ans[i]=solve(array);
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
    public static int solve(int[] array){
        int v1;
        int v2;
        for(int i=0;i<array.length;i++){
            v1=1;
            v2=1;
            for(int j=0;j<=i;j++){
                v1 = v1*array[j];
            }
            
            for(int j=i+1;j<array.length;j++){
                v2=v2*array[j];
            }

            if(v1==v2){
                return i+1;
            }

        }
        return -1;
    }
}
