import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int x=k*l;
        int y=x/nl;
        int z=c*d;
        int a=p/np;
        int min=Math.min(y,Math.min(z,a));
        System.out.println(min/n);
    }
}
