import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int b= sc.nextInt();
        int count=0;
        while(l<=b){
            l=3*l;
            b=2*b;
            count++;
        }
        System.out.println(count);
    }
}
