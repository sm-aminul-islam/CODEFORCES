import java.util.Scanner;

public class PolycapCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();

        for(long i=0;i<t;i++) {
            long n = sc.nextLong();
           long x=n/3;
           long y=x;
           long z=x*2;
           if(n%3==0){
               System.out.println(+y+" "+z/2);
           }
           else if(n%3==1){
               System.out.println(+(y+1)+" "+z/2);
           }
           else {
               System.out.println(+y+" "+(z/2+1));
           }
        }
    }
}
