import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lim = sc.nextInt();
        for(int i=0;i<lim;i++){
            if(num%10!=0){
                num=num-1;
            }
            else{
                num=num/10;
            }
        }
        System.out.println(num);
    }    
}
