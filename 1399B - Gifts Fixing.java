import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long a[] = new long[60];
        long b[] = new long[60];
        while (t-- > 0) {
            long n = sc.nextLong();
            long amin = Integer.MAX_VALUE, bmin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                amin = Math.min(amin, a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                bmin = Math.min(bmin, b[i]);
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.max(a[i] - amin, b[i] - bmin);
            }
            System.out.println(ans);
        }

    }
}
