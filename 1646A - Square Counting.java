import java.util.Scanner;

public class SqureCounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(long i=0;i<t;i++){
            long n=sc.nextLong();
            long s=sc.nextLong();
            System.out.println(s/(n*n));
        }
    }
}
