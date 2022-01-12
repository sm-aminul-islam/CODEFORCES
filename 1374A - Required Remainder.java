import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            int result=n/x;
            if((x*result+y)>n)
            {
                System.out.println(x*(result-1)+y);
            }
            else {
                System.out.println(x*result+y);
            }
        }


    }
}
