import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        String s =solve(n);
        System.out.println(s);
    }

     static String solve(int n){
        return n>=4 && n%2==0 ? "Yes" : "No" ;
    }
}