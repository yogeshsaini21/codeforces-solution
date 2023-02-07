import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String[] str = s.split("\\+");
        
        Arrays.sort(str);
        String ans="";
        for(int i=0;i<str.length;i++){
            if(i==str.length-1){
                ans+=str[i];
            }
            else{
                ans+=str[i]+"+";
            }
        }
        System.out.println(ans);

    }
}
