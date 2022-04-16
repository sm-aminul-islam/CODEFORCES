
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int m = 0, d = 0;
        int count = a;
        while (a >= b) {
            d = a / b;
            count += d;
            m = a % b;
            a = d + m;
        }
        System.out.println(count);

    }
}
