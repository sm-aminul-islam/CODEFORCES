import java.util.Scanner;
public class DivisibleSol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  c=0;
        long n=sc.nextInt();
        for (long i=0;i<n;i++){
            long a=sc.nextInt();
            long b=sc.nextInt();
            while(a%b !=0)
            {
                a++;
                c++;
            }
            System.out.println(c);
            c=0;
        }
    }
