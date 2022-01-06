import java.util.Scanner;

public class Mathemathcian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String s1=sc.next();
       char ch[]=s.toCharArray();
       char ch1[]=s1.toCharArray();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=s1.charAt(i)){
               System.out.print("1");
           }
           else {
               System.out.print("0");
           }
       }

    }
}
