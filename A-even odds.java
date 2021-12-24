import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        long k=sc.nextLong();
        long p=(n+1)/2;
        if(k <= p)
            System.out.println(2*k-1);
        else
            System.out.println(2*(k-p));
    }
}
