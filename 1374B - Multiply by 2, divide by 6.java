
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
            int n = sc.nextInt();
            int count1 = 0, count = 0;
            while (n % 2 == 0) {
                n /= 2;
                ++count1;

            }
            while (n % 3 == 0) {
                n /= 3;
                ++count;
            }
            if (n == 1 && count1 <= count) {
                System.out.println(2 * count - count1);
            } else {
                System.out.println("-1");
            }
        }
    }
}
