import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis=sc.nextInt();
        int count=0;
        int totalstep  = dis/5 + (dis%5==0?0:1);
    System.out.println(totalstep);
    }    
}
