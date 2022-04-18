
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
            int n = sc.nextInt(), m = sc.nextInt();
            if (m % 2 == 0) {
                System.out.println(n * (m / 2));
            } else {
                System.out.println(n * ((m - 1) / 2) + (n + 1) / 2);
            }
        }

    }
}
