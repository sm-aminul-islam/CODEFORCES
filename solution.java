import  java.util.Scanner;
public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s =sc.nextLine();
      String t= sc.nextLine();
      StringBuilder bd = new StringBuilder(s);
      if(bd.reverse().toString().equals(t))
      {
          System.out.println("YES");
      }
      else
      {
          System.out.println("NO");
      }
    }
}
