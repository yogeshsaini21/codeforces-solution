import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int n  = sc.nextInt();
        int[][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            int exit = sc.nextInt();
            int enter= sc.nextInt();
            arr[i][0]=exit;
            arr[i][1]=enter;

        }
        int[] pass = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                pass[i]=arr[i][1];
            }else{
                pass[i]=pass[i-1]-arr[i][0]+arr[i][1];
            }

             
        }
        int max = Arrays.stream(pass).max().getAsInt();
        System.out.println(max);
    }    
}
