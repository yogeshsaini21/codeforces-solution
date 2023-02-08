import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h= sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            int w = sc.nextInt();
            if(w > h){
                ans+=2;
            }
            else{
                ans+=1;
            }
        }
        System.out.println(ans);
    }    
}
