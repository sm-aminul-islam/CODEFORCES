import java.util.Scanner;

public class OddSum {
    public static  void main(String []args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while (t-->0){
            long n=sc.nextLong(),k=sc.nextLong();
            if((k*k)<=n) {
                if((n+k)%2==0)
                {
                    System.out.println("YES");
                }
            else  {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
