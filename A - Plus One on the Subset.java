
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
                for(int i=1;i<=t;i++)
                {
                    int n=sc.nextInt();
                    int Min=Integer.MAX_VALUE;
                    int Max=Integer.MIN_VALUE;
                    for(int j=1;j<=n;j++){
                        int a=sc.nextInt();
                        Min=Math.min(a,Min);
                        Max=Math.max(a,Max);
                    }
                    System.out.println((int)Max-Min);

                }





    }
}
