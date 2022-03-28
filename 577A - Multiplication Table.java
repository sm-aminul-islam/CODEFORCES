import java.util.Scanner;
public class MultiplictionTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong(),x=sc.nextLong();
       int count=0;
       for(int i=1;i<=n;i++){
           if(x%i==0 && x<=i*n){
               count++;
           }
       }
        System.out.println(count);
    }
}
