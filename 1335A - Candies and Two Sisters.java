import java.util.Scanner;

public class TwoSisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
                System.out.println(n/2-1);
            }
            else {
                System.out.println(n/2);
            }
        }
    }
}
