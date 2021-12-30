import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int i,n,d=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a+b+c)>1){
                d++;
            }
        }
        System.out.println(d);
    }
}
