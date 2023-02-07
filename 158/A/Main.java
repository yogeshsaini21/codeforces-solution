import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ind= sc.nextInt();
        // System.out.println("===========");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr[i]=num;
        }

        int count=0;
        for (int i =0;i<n;i++) {
            if(arr[i]>=arr[ind-1] && arr[i]>0)
            count++;
        }
        System.out.println(count);
    }
}
