import java.util.Scanner;

public class Playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long t=sc.nextLong();
       for(long i=0;i<t;i++){
           long n=sc.nextLong();
           System.out.println((int)Math.pow(2,n)-1);
       }
    }
}
