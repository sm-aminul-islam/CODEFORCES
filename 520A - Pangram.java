import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Panagram {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String s=sc.next();
          s=s.toLowerCase();
        Set<Character> ch=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            ch.add(s.charAt(i));
        }
        if(ch.size()==26){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
