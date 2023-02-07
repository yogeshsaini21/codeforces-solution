import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         
        char ct =Character.toUpperCase(s.charAt(0)); 
        String ans="";
        ans+=ct;
        for(int i=1;i<s.length();i++){
            ans+=s.charAt(i);
        }
        System.out.println(ans);
    }    
}
