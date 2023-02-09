import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String numr= sc.next();
        Long num = (long) Integer.parseInt(numr);
        int count=0;
        int len=0;
        while(num>0){
           Long x = num%10;
           len++;
            if(x==4 ||x==7){
                count++;
            }
            num=num/10;
        }
        System.out.println(count==len?"Yes":"No");

    }
}
