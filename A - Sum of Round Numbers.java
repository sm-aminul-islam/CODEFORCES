import java.util.Scanner;
import java.util.Stack;

public class RoundNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            Stack<Integer> list=new Stack<>();
            int n=sc.nextInt();
            int count=0;
            int d=10;
            while (n!=0)
            {
                int m=n%d;
                n-=m;
                if(m!=0)
                {
                    count++;
                    list.add(m);
                }

               d=d*10;
            }
            System.out.println(count);
            for(int x: list)
                System.out.print(x+" ");

            System.out.println();
        }

    }
}
