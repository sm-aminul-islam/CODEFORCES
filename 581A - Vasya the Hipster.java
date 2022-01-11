import java.util.Scanner;

public class Hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b){
            a-=b;
            a/=2;
            System.out.println(b+" "+a);
        }
        else if(b>=a)
        {
            b-=a;
            b/=2;
            System.out.println(a+" "+b);
        }
    }
}
