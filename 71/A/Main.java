import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
         String anss[]=new String[n];
        for(int i=0;i<n;i++){
            String s = sc.next();
            String ans=null;
            if(s.length()>10){
               ans=  String.format("%c%d%c", s.charAt(0) , s.length()-2, s.charAt(s.length()-1));
            }
            else{
                 ans=s;
            }
            anss[i]=ans;
        }

        for(int i=0;i<n;i++){
            System.out.println(anss[i]);
        }
         

    }

}
