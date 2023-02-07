import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] mat= new int[5][5];
        Scanner sc= new Scanner(System.in);
        int k=0;
        int l=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==1){
                    k+=i;
                    l+=j;
                }
            }
        }
        k++;
        l++;
        System.out.println(Math.abs(3-k)+Math.abs(3-l));

        
    }
}
