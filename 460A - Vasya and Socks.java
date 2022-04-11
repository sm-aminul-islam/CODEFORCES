import java.util.Scanner;
public class VasyaAndSocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(n+Math.abs((n-1)/(m-1)));
    }
}
