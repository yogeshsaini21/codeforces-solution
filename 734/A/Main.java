import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A=0;
        int D=0;
        String str = sc.next();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'){
                A++;
            }
            else{
                D++;
            }
        }
        if(A>D)
        System.out.println("Anton");
        else if(A==D)
        System.out.println("Friendship");
        else{
            System.out.println("Danik");
        }
    }    
}
