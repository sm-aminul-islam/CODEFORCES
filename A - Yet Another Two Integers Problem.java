import java.util.Scanner;

public class IntergerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d=Math.abs(a-b);
            System.out.println(d%10==0? d/10:(d/10)+1);
        }
    }
}
