import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=a+b;
            int y=a-b;
            int z=x-y;
            System.out.println(z);
        }
    }
}
