
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            for (int k = 2; k < 50; k++) {
                long x = (long) (Math.pow(2, k) - 1);
                if (n % x == 0) {
                    System.out.println(n / x);
                    break;
                }
            }

        }

    }
}
