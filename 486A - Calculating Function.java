import java.util.Scanner;
public class calculatingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long sum;
       if(n%2==0){
           sum=n/2;
       }
       else {
           sum=(-1)*(n/2+1);
       }
        System.out.println(sum);

    }
}
