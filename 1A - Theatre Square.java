import java.util.Scanner;
public class Squre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long m=sc.nextLong(),n=sc.nextLong(),a=sc.nextLong();
        long x=((m+a-1)/a)*((n+a-1)/a);
        System.out.println(x);
    }
}
