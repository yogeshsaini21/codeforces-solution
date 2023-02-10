import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            int[] arr  =new int[k];
            for(int j=0;j<k;j++){
                arr[j]=sc.nextInt();
            }
            int a = solve(arr);
            list.add(a);
        }
        list.forEach((temp) -> { System.out.println(temp); });
    }
    static int solve(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return arr.length-(count/2);
    }
}