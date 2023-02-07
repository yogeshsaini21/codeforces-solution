import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = sc.nextInt();
        int area = n*k;
       int ans = Math.floorDiv(area, 2);
       System.out.println(ans);
        

    }
}
