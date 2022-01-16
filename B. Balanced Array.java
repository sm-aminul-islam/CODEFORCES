import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int esum=0,osum=0;
            if(n%4==0)
            {
                System.out.println("YES");
                int number = 2;
                for(int j = 0; j < n/2; j++){
                    esum += number;
                    System.out.print(number + " ");
                    number+=2;
                }
                number = 1;
                for(int j = 0; j < n/2 -1; j++){
                    osum += number;
                    System.out.print(number + " ");
                    number+=2;
                }
                System.out.println(esum - osum);
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
