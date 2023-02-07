import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static final int People_num=3; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][People_num];
        for(int i=0;i<n;i++){
            for(int j=0;j<People_num;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        Integer[] count1 = new Integer[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<People_num;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            count1[i]=count;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(count1[i]>1){
                ans++;
            }
        }
        System.out.println(ans);
      
    }

    }

