import java.util.Scanner;
public class CheapTravell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        int x=n/m;
        int z=n-(m*x);
        if(m*a<=b){
            System.out.println(n*a);
        }
        else {
            System.out.println((x*b)+Math.min(z*a,b));
        }
    }
}
