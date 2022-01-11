import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int k=sc.nextInt();
        int count =0;
        int max=0;
        for(int i=1;i<=n;i++)
        {
            max=max+i*5;
            int x=240-max;
            if(x>=k){
                count++;
            }
        }
        System.out.println(count);
    }
}
