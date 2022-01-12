import java.util.Scanner;

public class Police {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0,count=0;
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(n>=0)
            {
                sum=sum+n;
            }
            else {
                if(sum==0)
                {
                    count++;
                }
                else sum--;
            }
        }
        System.out.println(count);
    }
}
