import java.util.Scanner;
public class Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        int x[]=new int[n+1];
        int []y=new int[n+1];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(x[i]==y[j])
                {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
