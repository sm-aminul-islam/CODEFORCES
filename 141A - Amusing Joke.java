import java.util.Arrays;
import java.util.Scanner;
public class AmazingJokes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        String s2=sc.next();
        String s4=s.concat(s1);

      char ch[]=s4.toCharArray();
      Arrays.sort(ch);
      String result=String.valueOf(ch);
      char ch1[]=s2.toCharArray();
      Arrays.sort(ch1);
      String result1=String.valueOf(ch1);
      if(result1.equals(result)){
          System.out.println("YES");
      }
      else {
          System.out.println("NO");
      }


    }
}
