
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double ans = 2 * Math.max(a[0], l - a[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, a[i + 1] - a[i]);

        }
        System.out.format("%.10f", ans / 2);
    }

}
