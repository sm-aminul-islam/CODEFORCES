import java.util.Scanner;

/**
 *
 * @author devil
 */
public class PairwiseMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong(), y = sc.nextLong(), z = sc.nextLong();
            if (x == y && x == z) {
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
            } else if (x == z && x > y) {
                System.out.println("YES");
                System.out.println(x + " " + y + " " + "1");
            } else if (x == y && x > z) {
                System.out.println("YES");
                System.out.println(x + " " + " " + "1" +" "+z);
            } else if (y == z && y > x) {
                System.out.println("YES");
                System.out.println(x + " " + y + " " + " " + "1");

            } else {
                System.out.println("NO");
            }

        }
    }

}
