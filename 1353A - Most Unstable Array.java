import java.util.Scanner;

public class UnstableArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt(),m=sc.nextInt();
            int min=Math.min(2,n-1);
             int x=min*m;
            System.out.println(x);
        }

    }
}
