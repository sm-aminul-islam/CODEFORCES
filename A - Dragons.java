import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author devil
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();
        int x[][] = new int[n][2];
      
        for (int i = 0; i < n; i++) {
            x[i][0] = sc.nextInt();
            x[i][1]=sc.nextInt();
        }
          Arrays.sort(x,(a,b)->Integer.compare(a[0], b[0]));
       
       for (int i = 0; i < n; i++) {

            if (s > x[i][0]) {
                s += x[i][1];
            } else {
                System.out.println("NO");
                 return;
            }
        }
        System.out.println("YES");

    }
}
