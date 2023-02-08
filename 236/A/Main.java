import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        Set<Character> st= new HashSet<>();
        for(int i=0;i<str.length();i++){
            st.add(str.charAt(i));
        }
        if(st.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}