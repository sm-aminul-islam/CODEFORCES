
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int d1=sc.nextInt();
      int d2=sc.nextInt();
      int d3=sc.nextInt();
      int x=Math.min((d1+d2+d3),((2*d1)+(2*d2)));
      int y=Math.min(((2*d2)+(2*d3)),((2*d1)+(2*d3)));
        System.out.println(Math.min(x,y));
    }
}
