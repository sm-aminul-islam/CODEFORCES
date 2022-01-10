import java.util.Scanner;

public class Fafa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int count=0,a;
        for(int i=1;i<n+1;i++){
            a=n-i;
            if(a%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
