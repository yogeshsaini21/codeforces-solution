import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
            else if(ch>='a' && ch<='z'){
                lower++;
            }
        }
        // System.out.println(upper+" "+lower);
        if(upper>lower){
            System.out.println(str.toUpperCase());
          
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
