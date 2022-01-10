import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;
        while (n>=1)
        {
            if(n>=100){
                n=n-100;
                count++;
                continue;
            }
            if(n>=20)
            {
                n=n-20;
                count++;
                continue;
            }
            if(n>=10)
            {
                n=n-10;
                count++;
                continue;
            }
            if(n>=5)
            {
                n=n-5;
                count++;
                continue;
            }
            if(n>=1)
            {
                n=n-1;
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
