import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=(n+1)/10;
            System.out.println(x);
        }
    }
}
