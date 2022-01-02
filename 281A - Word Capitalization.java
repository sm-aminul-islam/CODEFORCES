import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       char []ch=s.toCharArray();
       ch[0]=Character.toUpperCase(ch[0]);
       for(int i=0;i<ch.length;i++)
       {
           System.out.print(ch[i]);
       }
       }
}



